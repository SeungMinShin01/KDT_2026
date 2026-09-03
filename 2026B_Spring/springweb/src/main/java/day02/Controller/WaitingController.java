package day02.Controller;

import org.springframework.web.bind.annotation.RestController;

import day02.Model.Dao.WaitingDao;
import day02.Model.Dto.WaitingDto;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class WaitingController {
    private WaitingDao wd = WaitingDao.getInstance();

    // [1] 등록
    @PostMapping("waiting/insert")
    public boolean InsertList(WaitingDto waitingDto) {
        boolean result = wd.InsertList(waitingDto);
        return result;
    }

    // [2] 전체조회
    @GetMapping("waiting/findall")
    public ArrayList<WaitingDto> findAll() {
        ArrayList<WaitingDto> result = wd.findAll();
        return result;
    }

    // [3] 개별수정
    @PutMapping("waiting/update")
    public boolean updateList(WaitingDto waitingDto) {
        return wd.updateList(waitingDto);
    }

    // [4] 개별삭제
    @DeleteMapping("waiting/delete")
    public boolean deleteList(String pNumber) {
        return wd.deleteList(pNumber);
    }

}
