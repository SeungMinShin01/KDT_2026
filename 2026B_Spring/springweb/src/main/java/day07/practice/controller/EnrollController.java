package day07.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.practice.model.dto.EnrollDto;
import day07.practice.service.EnrollService;

@RestController
@RequestMapping("/api/enroll")
public class EnrollController {
    @Autowired
    private EnrollService enrollService;

    @PostMapping("")
    public boolean enrollSave(@RequestBody EnrollDto enrollDto) {
        return enrollService.enrollSave(enrollDto);
    }

    @GetMapping("/detail")
    public EnrollDto enrollFindAll(
            @RequestParam(name = "enrollId") Integer enrollId) {
        return enrollService.enrollFindAll(enrollId);
    }
}
