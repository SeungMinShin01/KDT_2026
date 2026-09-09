package day07.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice.model.dto.EnrollDto;
import day07.practice.model.entity.CourseEntity;
import day07.practice.model.entity.EnrollEntity;
import day07.practice.model.entity.StudentEntity;
import day07.practice.model.repository.CourseRepository;
import day07.practice.model.repository.EnrollRepository;
import day07.practice.model.repository.StudentRepository;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    // 1. 수강등록 : FK --> entity
    public boolean enrollSave(EnrollDto enrollDto) {
        // 1. dto -> entity
        EnrollEntity enrollEntity = enrollDto.toEntity();
        // ** DTO내 FK 값을 ENTITY으로 변환 **
        Optional<StudentEntity> optional1 = studentRepository.findById(enrollDto.getStudentId());
        Optional<CourseEntity> optional2 = courseRepository.findById(enrollDto.getCourseId());
        if (optional1.isPresent() && optional2.isPresent()) { // FK 2개가 모두 엔티티가 존재하면
            // 학생엔티티 꺼내서 enroll 엔티티에 대입
            StudentEntity studentEntity = optional1.get();
            enrollEntity.setStudentEntity(studentEntity);
            // 과정엔티티 꺼내서 enroll 엔티티에 대입
            CourseEntity courseEntity = optional2.get();
            enrollEntity.setCourseEntity(courseEntity);
            // 2. entity save
            EnrollEntity savedEntity = enrollRepository.save(enrollEntity);
            // 3.
            if (savedEntity.getEnrollId() >= 1)
                return true;
        }
        return false;
    }

    // 2. 수강조회
    public EnrollDto enrollFindAll(Integer enrollId) {
        // Optional< > 클래스는 null 예외검사 메소드 제공 , isPresent() 있으면true/false , orElse( 없을때자료
        // )
        EnrollEntity enrollEntity = enrollRepository.findById(enrollId).orElse(null);
        return EnrollDto.from(enrollEntity);
    }
}
