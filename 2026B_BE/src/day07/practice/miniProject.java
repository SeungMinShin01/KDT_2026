package day07.practice;

import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        OverallRepository repository = new OverallRepository();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("===================== 세탁도우미 ===================== ");
            System.out.println("1.의류 추가 2. 세탁법추가 3. 의류 출력 4. 세탁법 출력");
            System.out.println("====================================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            switch (ch) {
                case 1:
                    scan.nextLine();
                    System.out.print("의류ID : ");
                    int 의류ID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("의류명 : ");
                    String 의류명 = scan.nextLine();
                    System.out.print("카테고리ID : ");
                    int 카테고리ID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("소재ID : ");
                    int 소재ID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("이미지경로 : ");
                    String 이미지경로 = scan.nextLine();

                    의류 새의류 = new 의류(의류ID, 의류명, 카테고리ID, 소재ID, 이미지경로);
                    boolean result = repository.의류저장함수(새의류);

                    if (result) {
                        System.out.println("[안내] 성공");
                    } else {
                        System.out.println("[안내] 실패");
                    }
                    break;
                case 2:
                    scan.nextLine();
                    System.out.print("의류 ID : ");

                    의류ID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("물온도 : ");
                    String 물온도 = scan.nextLine();
                    System.out.print("세탁방법 : ");
                    String 세탁방법 = scan.nextLine();
                    System.out.print("권장세제 : ");
                    String 권장세제 = scan.nextLine();
                    System.out.print("주의사항 : ");
                    String 주의사항 = scan.nextLine();

                    의류별세탁법 추가할세탁법 = new 의류별세탁법(의류ID, 물온도, 세탁방법, 권장세제, 주의사항);
                    result = repository.세탁법저장(추가할세탁법);

                    if (result)
                        System.out.println("[안내] 세탁법 추가 성공");
                    else
                        System.out.println("[안내] 세탁법 추가 실패");
                    break;

                case 3:

                    break;

                case 4:
                    의류별세탁법[] 세탁법리스트 = repository.findAll();
                    for (의류별세탁법 출력할세탁법 : 세탁법리스트) {
                        if (출력할세탁법 != null) {
                            System.out.printf("의류ID : %d\n 물온도 : %s\n세탁방법 : %s\n권장세제 : %s\n주의사항 : %s\n", 출력할세탁법.의류ID,
                                    출력할세탁법.물온도, 출력할세탁법.세탁방법, 출력할세탁법.권장세제, 출력할세탁법.주의사항);
                        }
                    }
                    break;

                default:
                    break;
            }

        }
    }
}

// 데이터 저장 및 반환(조회) 비즈니스 로직 전담 클래스
class OverallRepository {

    Post[] posts = new Post[100];

    의류[] 의류배열 = new 의류[100];

    boolean 의류저장함수(의류 새의류) {
        for (int i = 0; i < 의류배열.length; i++) {
            if (의류배열[i] == null) {
                의류배열[i] = 새의류;
                return true;
            }
        }
        return false;
    }

    의류[] findAll2() {
        return 의류배열;
    }

    의류별세탁법[] 세탁법리스트 = new 의류별세탁법[100];

    // 세탁법 저장
    boolean 세탁법저장(의류별세탁법 추가할세탁법) {
        for (int i = 0; i < 세탁법리스트.length; i++) {
            if (세탁법리스트[i] == null) {
                세탁법리스트[i] = 추가할세탁법;
                return true;
            }
        }
        return false;
    }

    // 세탁법 반환
    의류별세탁법[] findAll() {
        return 세탁법리스트;
    }

}

class Post {
    String content;
    String writer;

    Post() {
    }

    Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}

class 카테고리 {
    int 카테고리ID;
    String 카테고리명;

    카테고리() {
    }

    카테고리(int 카테고리ID, String 카테고리명) {
        this.카테고리ID = 카테고리ID;
    }
}

class 의류 {
    int 의류ID;
    String 의류명;
    int 카테고리ID;
    int 소재ID;
    String 이미지경로;

    의류() {
    }

    의류(int 의류ID, String 의류명, int 카테고리ID, int 소재ID, String 이미지경로) {
        this.의류ID = 의류ID;
        this.의류명 = 의류명;
        this.카테고리ID = 카테고리ID;
        this.소재ID = 소재ID;
        this.이미지경로 = 이미지경로;
    }
}

class 의류별세탁법 {
    int 의류ID;
    String 물온도;
    String 세탁방법;
    String 권장세제;
    String 주의사항;

    의류별세탁법() {
    }

    의류별세탁법(int 의류ID, String 물온도, String 세탁방법, String 권장세제, String 주의사항) {
        this.의류ID = 의류ID;
        this.물온도 = 물온도;
        this.세탁방법 = 세탁방법;
        this.권장세제 = 권장세제;
        this.주의사항 = 주의사항;
    }
}

class 건조방법 {
    int 건조ID;
    String 건조방법;
    String 장점;
    String 주의사항;
}

class 세탁기호 {
    int 기호ID;
    String 기호명;
    String 이미지경로;
}