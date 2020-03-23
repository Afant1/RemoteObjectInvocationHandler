
# RemoteObjectInvocationHandler
bypass JEP290 RaspHook code，Hook InvokeRemoteMethod 函数，替换成URLDNS gadget
## Usage
**1、mvn package 打好jar包**

**2、运行RmiServer**

**3、运行RmiClient前，VM options参数填写:-javaagent:C:\Users\xxx\InvokeRemoteMethod\target\rasp-1.0-SNAPSHOT.jar**

**4、最终会hook住RemoteObjectInvocationHandler函数，修改第三个参数为URLDNS gadget**

**bypass jep920攻击rmi文章已首发在安全客：https://www.anquanke.com/post/id/200860**


参考链接：

https://mogwailabs.de/blog/2019/03/attacking-java-rmi-services-after-jep-290/

https://github.com/linxin26/javarespdemo/

---------------------------------------------------

JavaSearchTools是另一个小工具，提交到一个仓库了，具体用法：https://github.com/Afant1/JavaSearchTools
