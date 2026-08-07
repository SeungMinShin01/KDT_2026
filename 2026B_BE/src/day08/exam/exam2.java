package day08.exam;

public class exam2 {
    public static void main(String[] args) {
        // [1]
        User u1 = new User();
        // u1.name = "유재석"; 접근 불가
        u1.setName("유재석"); // 간접접근 허용
        // System.out.println(u1.name); 불가능
        System.out.println(u1.getName("비밀번호")); // 간접접근 가능

        // [2] 객체 출력하면 객체 주소값 출력
        System.out.println(u1); // day08.exam.User@5ecddf8f

    }

}

class User { // 클래스란? 객체 설계도/종이

    // 1. 멤버변수 = 상태 = private 사용
    private String name;
    private int age;

    // 2. 생성자 = 초기화
    // 3. 메소드 = 행위
    // - private 메소드에 대한 간접접근 메소드
    // setter (저장할때) , getter (가져올때) , set멤버변수 , get멤버변수
    // getter만 존재하면 V(value) O(object) 읽기모드
    // setter/getter 존재하면 D(data)T(transfer)O(object) DTO - 읽기/쓰기 모드

    public void setName(String name) {
        if (name.length() < 1) {
            return;
        }
        // 조건문으로 유효성검사를 사용하여 예외처리
        this.name = name;
    }

    public String getName(String 비밀번호) {
        return this.name;
    }

    // 3. toString : 객체호출 시 주소값 대신에 문자열 반환
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    // DTO : 데이터베이스에 있는 자료를 프론트엔드로 이동
    // 1. 관례적으로 멤버변수를 모두 private
    // 2. getter/setter를 제공한다.
    // 3. toString을 제공한다.
    // 4. 생성자에 기본생성자 1개, 전체매개변수 1개 => 2개
    // MVC패턴: 소규모가 아닌 체게적인 규모 필요할 때 클래스 역할 나누기
    /*
     * V: VIEW 입출력 담당 HTML/CSS/JS/REACT/FLUTTER
     * C : Controller 제어(백/프론트) 중계 JAVA/PYTHON/NODE.JS
     * M : Model 데이터 담당 DTO,VO (CONTROLLER-외부DB/클라우드)
     */

}