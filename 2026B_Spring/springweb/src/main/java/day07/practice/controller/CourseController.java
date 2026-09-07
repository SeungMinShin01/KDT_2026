package day07.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import day07.practice.model.dto.CourseDto;
import day07.practice.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    // [1] 등록
    @PostMapping("")
    public boolean courseSave(@RequestBody CourseDto courseDto) {
        return courseService.courseSave(courseDto);
    }

    @GetMapping("")
    public List<CourseDto> 과정전체조회() {
        return courseService.과정전체조회();
    }
}
