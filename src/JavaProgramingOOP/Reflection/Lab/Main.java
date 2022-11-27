package JavaProgramingOOP.Reflection.Lab;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<Reflection> clazz = Reflection.class;

        Comparator<Method> methodComparator = Comparator.comparing(Method::getName);
        Comparator<Field> fieldComparator = Comparator.comparing(Field::getName);

        Set<Method> getters = new TreeSet<>(methodComparator);
        Set<Method> setters = new TreeSet<>(methodComparator);
        Set<Field> fieldsSet = new TreeSet<>(fieldComparator);

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                getters.add(method);
            } else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        Field[] fields = clazz.getDeclaredFields();
        fieldsSet.addAll(Arrays.asList(fields));


        for (Field field : fieldsSet) {
            int modifier = field.getModifiers();
            if (!Modifier.isPrivate(modifier)){
                System.out.println(field.getName() + " must be private!");
            }
        }

        for (Method getter : getters) {
           int modifier = getter.getModifiers();
           if(!Modifier.isPublic(modifier)){
               System.out.println(getter.getName() + " have to be public!");
           }
        }

        for (Method setter : setters) {
            int modifier = setter.getModifiers();
            if(!Modifier.isPrivate(modifier)){
                System.out.println(setter.getName() + " have to be private!");
            }
        }


    }

}
