package co.idwall.utils;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

public class ObjectUtils {
    public static List<String> getObjectKeys(Object obj) {
        Class<?> clazz = obj.getClass();
        
        Field[] fields = clazz.getDeclaredFields();
        
        List<String> keys = new ArrayList<>();

        for (Field field : fields) {
            keys.add(field.getName());
        }

        return keys;
    }
}
