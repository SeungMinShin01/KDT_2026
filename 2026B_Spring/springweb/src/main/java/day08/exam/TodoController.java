
package day08.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/day08/todo")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
}
