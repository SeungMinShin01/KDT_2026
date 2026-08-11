package day09.종합예제.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.종합예제.controller.WaitingController;
import day09.종합예제.dto.WaitingDto;

public class WaitingView {
    private WaitingView() {
    }

    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }

    // * 모든 메소드에서 사용 가능한 입력 객체
    private Scanner scan = new Scanner(System.in);

    // [*] 메인 입출력
    public void run() {
        while (true) {
            System.out.println("========================= WaitingList =========================");
            System.out.println("1.대기명단 등록 | 2.대기명단 출력 | 3.대기명단 수정 | 4.대기명단 삭제 ");
            System.out.println("===============================================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                save();
            } else if (ch == 2) {
                findAll();
            } else if (ch == 3) {
                update();
            } else if (ch == 4) {
                delete();
            }

        }
    }

    // controller 호출
    private WaitingController wc = WaitingController.getInstance();

    // [1] 대기명단 작성 입출력
    public void save() {
        // 입력
        System.out.println("전화번호 입력 : ");
        String 전화번호 = scan.next();
        System.out.println("인원수 입력 : ");
        int 인원수 = scan.nextInt();
        // 객체화
        WaitingDto waitingDto = new WaitingDto(전화번호, 인원수);
        // 컨트롤러 요청
        boolean result = wc.save(waitingDto);
        // 처리
        if (result)
            System.out.println("등록성공");
        else
            System.out.println("등록실패");
    }

    // [2] 대기명단 전체 출력
    public void findAll() {
        // 1. 컨트롤러로부터 모든 대기명단을 요청하고 받기
        ArrayList<WaitingDto> result = wc.findAll();
        // 2. 컨트롤러로부터 받은 대기명단 출력
        for (int i = 0; i < result.size(); i++) {
            WaitingDto list = result.get(i);
            System.out.printf("대기번호 : %d\n전화번호 : %s\n인원수 : %d\n",
                    i + 1, list.getpNumber(), list.gethCount());
        }
    }

    // [3] 대기명단 개별 수정

    public void update() {
        System.out.println("전화번호 입력 : ");
        String 전화번호 = scan.next();
        System.out.println("변경할 인원수 입력 : ");
        int 인원수변경 = scan.nextInt();

        // 객체화
        WaitingDto waitingDto = new WaitingDto(전화번호, 인원수변경);

        // 컨트롤러 요청
        boolean result = wc.update(waitingDto);
        // 처리
        if (result)
            System.out.println("수정성공");
        else
            System.out.println("수정실패");
    }

    // [4] 대기명단 삭제
    public void delete() {
        System.out.println("전화번호 입력 : ");
        String 전화번호 = scan.next();

        // 객체화
        WaitingDto waitingDto = new WaitingDto(전화번호);

        // 컨트롤러 요청
        boolean result = wc.delete(waitingDto);
        // 처리
        if (result)
            System.out.println("삭제성공");
        else
            System.out.println("삭제실패");
    }

}
