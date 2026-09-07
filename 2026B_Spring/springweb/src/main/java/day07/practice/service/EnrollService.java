package day07.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice.model.repository.EnrollRepository;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;
}
