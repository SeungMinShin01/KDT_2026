package day09.종합예제.dao;

import java.util.ArrayList;

import day09.종합예제.dto.WaitingDto;

public class WaitingDao {
    private WaitingDao() {
    }

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    // ArrayList 구성
    private ArrayList<WaitingDto> waitingList = new ArrayList<>();

    // [1] 대기명단 등록 로직
    public boolean save(WaitingDto waitingDto) {
        // 1. controller로부터 저장할 정보 객체 받기
        // 2. 리스트에 저장
        waitingList.add(waitingDto);
        // 3. 성공 반환
        return true;
    }

    // [2] 대기명단 전체 조회 로직
    public ArrayList<WaitingDto> findAll() {
        // 1. controller에게 매개변수 받기
        // 2. 리스트 전체 반환
        return waitingList;
    }

    // [3] 대기명단 수정 로직
    public boolean update(WaitingDto waitingDto, int isNum) {
        waitingList.get(isNum).sethCount(waitingDto.gethCount());
        return true;
    }

    // [4] 대기명단 삭제 로직
    public boolean delete(int isNum) {
        waitingList.remove(isNum);
        return true;
    }

    // [5] 대기명단 개별조회 - 전화번호검사
    public int isPnumber(WaitingDto waitingDto) {
        for (int i = 0; i < waitingList.size(); i++) {
            WaitingDto list = waitingList.get(i);
            if (list.getpNumber().equals(waitingDto.getpNumber()))
                return i;
        }
        return -1;
    }

}
