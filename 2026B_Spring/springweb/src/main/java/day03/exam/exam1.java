package day03.exam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class exam1 {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.method1(); // - 부모 메소드가 아닌 오버라이드 메소드 실행된다.
        subclass.method2(); // - 실행은 가능하지만 권장안함. // 스프링개발자가 -> 웹 개발자에게 알려주기

        // 1. 리플렉션

        // 1. zmffotmdml wjdqhqksghks
        Class<TestClass> class2 = TestClass.class;
        try {
            Method method = class2.getMethod("method3");
            // 3. 메소드의 어노테이션 확인
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            // 4. 특정 어노테이션의 속성 확인
            System.out.println(annotation.value());
            System.out.println(annotation.data());
            // 5. 동적 로딩
            TestClass testClass = class2.getDeclaredConstructor().newInstance();
            method.invoke(testClass);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// [3] 어노테이션 만들기 : @interface 어노테이션명{ }
@Retention(RetentionPolicy.RUNTIME) // 해당 어노테이션 생명주기: 실행 중 유지
@Target(ElementType.METHOD) // 해당 어노테이션 사용처: 메소드
@interface MyAnnotation {
    String value(); // 추상메소드

    int data() default 1;
}

// [4] 어노테이션 주입:
class TestClass {
    @MyAnnotation(value = "안녕하세요", data = 10) // @ 내가만든어노테이션( 추상메소드명 )
    void method3() {
        System.out.println("메소드3 실행");
    }

    @MyAnnotation(value = "안녕하세요2")
    void method4() {
        System.out.println("메소드 4 실행");
    }
}

class SuperClass {
    void method1() {

    }
} // 상위클래스

class Subclass extends SuperClass {
    @Override // [1] 어노테이션 : (재정의)컴파일/실행중 해당 메소드 사용하는 방법/주석 명시
    void method1() {
        super.method1();
    }

    @Deprecated // [2] 어노테이션: (더이상 사용을 권장안함을 명시)
    void method2() {
    }
}
