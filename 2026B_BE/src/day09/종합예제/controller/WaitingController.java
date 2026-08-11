package day09.종합예제.controller;

import java.util.ArrayList;

import day09.종합예제.dao.WaitingDao;
import day09.종합예제.dto.WaitingDto;

public class WaitingController {
    private WaitingController() {
    }

    private static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance() {
        return instance;
    }

    // dao 싱글톤 호출
    private WaitingDao wd = WaitingDao.getInstance();

    // [1] 대기명단 등록 컨트롤러
    public boolean save(WaitingDto waitingDto) {
        // 1. view 으로부터 저장할 정보 객체로 받는다.
        // 유효성 검사/ 타입변환 ...
        // DAO에게 요청하고 응답받기
        boolean result = wd.save(waitingDto);
        // DAO 에게 받은 결과를 VIEW 에게 응답
        return result;

    }

    // [2] 대기명단 전체 조회 컨트롤러
    public ArrayList<WaitingDto> findAll() {
        // view에게 매개변수 받기
        // dao 에게 요청 및 응답
        ArrayList<WaitingDto> result = wd.findAll();
        // 3. 받은 결과 view에게 전달
        return result;
    }

    // [3] 대기명단 개별 수정 컨트롤러
    public boolean update(WaitingDto waitingDto) {

        int isNum = wd.isPnumber(waitingDto);
        boolean result = isNum == -1 ? false : wd.update(waitingDto, isNum);
        return result;

    }

    // [4] 대기명단 삭제 컨트롤러
    public boolean delete(WaitingDto waitingDto) {
        int isNum = wd.isPnumber(waitingDto);

        boolean result = isNum == -1 ? false : wd.delete(isNum);
        return result;

    }
}
