package day07.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.practice.model.dto.StudentDto;
import day07.practice.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("")
    public boolean studentSave(
            @RequestBody StudentDto studentDto) {
        return studentService.studentSave(studentDto);
    }

    @DeleteMapping("")
    public boolean studentDelete(
            @RequestParam(name = "studentId") Integer studentId) {
        return studentService.studentDelete(studentId);
    }
}
