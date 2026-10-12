package day13;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/session")
public class SessionController {
    @GetMapping("/add")
    public String save(@RequestParam(name = "data") String data, HttpSession session) {
        try {
            List<String> list = (List<String>) session.getAttribute("list");
            if (list == null)
                list = new ArrayList<>();
            list.add(data);
            session.setAttribute("list", list);
            return "세션저장성공";
        } catch (Exception e) {
            return "세션저장실패";
        }
    }

    @GetMapping("/all")
    public List<String> getList(HttpSession session) {
        List<String> list = (List<String>) session.getAttribute("list");
        if (list == null)
            new ArrayList<>();
        return list;
    }
}
