package day04.exam;

public class exam1 {
    public static void main(String[] args) {
        // 조건문1 : if( true / false ) 참인경우
        int 온도 = 5;
        if (온도 <= 10)
            System.out.println("외투 입는다.");

        if (온도 <= 10) {
            System.out.println("외투 입는다.");
            System.out.println("긴바지 입는다");
        }

        if (온도 <= 10) {
            System.out.println("외투 입는디. ");
        } else
            System.out.println("외투 입지 않는다.");

        if (온도 <= 10) {
            System.out.println("외투 입는다.");
        } else if (온도 <= 30)
            System.out.println("외투 입지 않는다.");
        else
            System.out.println("나시 입는다.");

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("A등급 입니다.");

                break;
            case 'B':
                System.out.println("B등급 입니다.");
                break;
            case 'C':
                System.out.println("C등급 입니다.");
                break;
            default:
                System.out.println("재시험입니다.");
                break;
        }

        int adult = 1;
        switch (grade) {
            case 'A':
                switch (adult) {
                    case 1:
                        System.out.println("A등급 성인입니다.");
                        break;
                    case 0:
                        System.out.println("A등급 미성년자 입니다.");

                        break;
                    default:
                        break;
                }
            case 'B':
            case 1:
                System.out.println("B등급 성인입니다.");
                break;
            case 2:
                System.out.println("B등급 미성년자입니다.");
                break;

            default:
                break;
        }

    }

}
