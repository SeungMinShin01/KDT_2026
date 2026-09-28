package day11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import day11.model.dto.ApiDto;
import day11.service.ApiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:5173")
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/api")
    public List<ApiDto> findAll() {
        return apiService.findAll();
    }

    @PostMapping("/api")
    public boolean postMethodName(@RequestBody ApiDto apiDto) {
        return apiService.save(apiDto);
    }

}