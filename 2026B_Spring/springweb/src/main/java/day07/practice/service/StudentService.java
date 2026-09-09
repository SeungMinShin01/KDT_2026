package day07.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice.model.dto.StudentDto;
import day07.practice.model.entity.StudentEntity;
import day07.practice.model.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // 1. 학생등록
    public boolean studentSave(StudentDto studentDto) {
        StudentEntity studentEntity = studentDto.toEntity();
        StudentEntity savedEntity = studentRepository.save(studentEntity);
        if (savedEntity.getStudentId() >= 1)
            return true;
        return false;
    }

    // 2. 학생삭제
    public boolean studentDelete(Integer studentId) {
        // 1. 학생번호 이용한 학생엔티티 찾기
        Optional<StudentEntity> optional = studentRepository.findById(studentId);
        // 2. 만일 엔티티 존재하면
        if (optional.isPresent()) {
            studentRepository.deleteById(studentId);
            return true;
        }
        return false;
    }
}
