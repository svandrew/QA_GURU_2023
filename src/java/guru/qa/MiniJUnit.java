package guru.qa;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class MiniJUnit {

    public static void main(String[] args) throws Exception {
        // 1) Ищет классы с аннотацией @Test

        Method[] methods = DemoTest.class.getDeclaredMethods();
        for (Method method : methods) {
            Test annotation = method.getAnnotation(Test.class);
            if (annotation != null) {
                DemoTest instance = DemoTest.class.getConstructor().newInstance();
                try {
                    method.invoke(instance);
                } catch (Exception e) {
                    System.out.println("TEST BROKEN!!!");
                    return;
                }
                System.out.println("TEST PASSED!!!");
            }
        }
    }
}