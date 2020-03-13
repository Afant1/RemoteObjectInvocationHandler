package afanti.rasp.util;

import java.lang.reflect.Field;

public class Reflections {
    public Reflections() {
    }

    public static Field getField(Class<?> clazz, String fieldName) throws Exception {
        Field field = clazz.getDeclaredField(fieldName);
        if (field != null) {
            field.setAccessible(true);
        } else if (clazz.getSuperclass() != null) {
            field = getField(clazz.getSuperclass(), fieldName);
        }

        return field;
    }

    public static void setFieldValue(Object obj, String fieldName, Object value) throws Exception {
        Field field = getField(obj.getClass(), fieldName);
        field.set(obj, value);
    }

}

