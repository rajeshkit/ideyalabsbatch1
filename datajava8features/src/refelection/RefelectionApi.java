package refelection;

import java8.Employee;
import java8.MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class RefelectionApi {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c= Class.forName("java8.Employee");
        System.out.println(c.getTypeName());
        Field[] fields=c.getDeclaredFields();
        Annotation[] annotations=c.getAnnotations();
        System.out.println(annotations.length);
        for(Annotation annotation:annotations){
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println(myAnnotation.size());
            System.out.println(myAnnotation.value());
        }



//        for (Field field:fields){
//            System.out.println(field.getName());
//            System.out.println(Modifier.toString(field.getModifiers()));
//            System.out.println(field.getType());
//        }
//        Method[] methods =c.getDeclaredMethods();
//        for (Method method:methods) {
//            System.out.println(method.getModifiers());
//            System.out.println(method.getReturnType());
//            System.out.println(method.getName());
//            System.out.println(method.getTypeParameters());

        }



}
