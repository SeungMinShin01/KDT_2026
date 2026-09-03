package day05;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "test")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class TestEntity extends BaseTime { // BaseTime 상속: createDate/updateDate 컬럼 물려받기
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "name", nullable = true, length = 100, unique = true) // 제약조건 설정
    private String name; // 이름
    @Column(columnDefinition = "varchar(100) not null default '제품설명'")
    private String descri; // 설명
    @Column(insertable = true, updatable = true)
    private Integer price; // 가격
}

/*
 * @Column(name = "필드명") : 생략시 자동으로 멤버변수명지정
 * 
 * @Column(nullable = ture/false) : not null
 * 
 * @Column(length = "문자열길이") : 최대 255 Varchar
 * 
 * @Column(unique = true) : 중복 불가능/가능
 * 
 * @Column(columnDefinition = "SQL구문")
 * 
 * @Column(insertable = insert여부 , updateable = update 여부)
 */