package day07.practice.model.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enroll")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EnrollEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enrollId;
    @Column
    private String status;

    @JoinColumn(name = "course_id")
    @ManyToOne
    private CourseEntity courseEntity;

    @JoinColumn(name = "student_id")
    @ManyToOne
    private StudentEntity studentEntity;
}
