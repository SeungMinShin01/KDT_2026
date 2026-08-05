-- [1] 데이터베이스 삭제

drop database if exists mydb0805;

-- [2] 데이터베이스 생성

create database mydb0805;

show databases;

use mydb0805;

-- DDL : 데이터베이스/테이블 생성/삭제/수정 질의어 (** 트랜잭션 불가능 / 오토커밋 **)
-- 1) 테이블 생성 : 1. 테이블생성할 데이터베이스 활성화

create table test1(필드명1 int, 필드명2 double, 필드명3 text);

-- 테이블 목록 조회
SHOW TABLES;

DESCRIBE test1;

DROPNTABLE test1;

ALTER TABLE test1 ADD 필드명4 FLOAT;

ALTER TABLE test1 MODIFY `필드명3` LONGTEXT;

ALTER TABLE test1 CHANGE `필드명1` `필드명5` BIGINT;

RENAME TABLE test1 TO new_test1;

TRUNCATE TABLE new_test1;

-- 테이블의 속성/필드 타입

USE mydb0805

create table test2 (
    정수필드1 TINYINT , 정수필드2 SMALLINT , 정수필드3 MEDIUMINT,
    정수필드4 int , 정수필드5 BIGINT, 정수필드6 int UNSIGNED,
    -- UNSIGNED 부호없다, TINYINT(1바이트 -128~127) --> 0 ~225
    실수필드1 FLOAT, 실수필드2 DOUBLE, 실수필드3  DECIMAL,
    -- DECIMAL 문자타입 이면서 소수점 오차가 없음
    날짜필드1 DATE , 시간필드1 TIME, 날짜시간필드 DATETIME ,
    문자필드1 CHAR(3) , 문자필드2 VARCHAR(3) , 문자필드3 TEXT , 문자필드4 LONGTEXT,
    -- CHAR( 문자 고정길이 ~255 ) VS VARCHAR( 문자 가변길이 ~255 )
    -- 예] "수박" -- CHAR( [수][박][X] ) vs VARCHAR( [수][박] )
    논리필드 BOOLEAN -- 마지막 필드타입 뒤로 ,넣지않기
);

CREATE TABLE test3 (
    필드명1 TINYINT NOT NULL, -- 해당 필드/속성에는 NULL 저장할 수 없도록 설정, 값이 NULL 이면 오류 발생
    필드명2 SMALLINT UNIQUE, -- 해당 필드/속성 에는 중복값을 저장할 수 없도록 설정, 값이 다른 레코드와 같다면 오류 발생
    필드명3 INT DEFAULT 100, -- 해당 필드/속성에 레코드 생성시 기본값 10 대입된다.
    필드명4 DATETIME DEFAULT now(), -- 예] 레코드 삽입시 현재날짜/시간 자동 대입
    필드명5 BIGINT AUTO_INCREMENT , -- AUTO_INCREMENT 레코드(행) 삽입 시 자동으로 순서번호 설정 , 1 2 3 4 5
    -- PRIMARY KEY(PK) : 기본/식별 키 , 식별가능한 고유한 값을 갖는 필드 (NOT NULL + UNIQUE 내장됨)
    CONSTRAINT PRIMARY KEY(필드명5)
);

CREATE TABLE test4 (
    -- FOREIGN KEY (FK) : 참조/외래 키 ( PK가 다른테이블에 위치한 경우 ), 다른 테이블의 기본키 참조하는 키
    -- 참조 옵션 : PK가 삭제/수정된 경우 FK 어떻게?
        -- ON DELETE/UPDATE CASCADE : PK가 삭제되면 FK도 같이 삭제/수정
        -- ON DELETE/UPDATE SET NULL : PK가 삭제되면 FK는 NULL로 수정
        -- ON DELETE/UPDATE RESTRICT : (기본값) FK가 존재하면 삭제/수정 안됨
    필드명1 BIGINT, 
    CONSTRAINT FOREIGN KEY (필드명1) REFERENCES test3(필드명5) 
        ON DELETE CASCADE
        ON UPDATE CASCADE;
)