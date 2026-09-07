package day07.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import day07.practice.service.EnrollService;

@RestController
@RequestMapping("api/course")
public class EnrollController {
    @Autowired
    private EnrollService enrollService;
}
