# 1. 데이터베이스 생성 
drop database if exists mydb0814; -- 만약에 'mydb0814' 데이터베이스 존재하면 삭제
create database mydb0814;   -- 'mydb0814' 데이터베이스 생성 
use mydb0814;      -- 'mydb0814' 데이터베이스 사용 , 워크벤치 재실행후에도
# 2. 테이블 생성 
create table table1(     -- 'table1' 테이블 생성 
 num_pk int ,      -- 'num_pk' 속성/컬럼/필드 을 int 타입 선언 
    constraint primary key( num_pk ) -- 선언된 'num_pk' 속성을 pk(식별키) 설정 
);
# 2. 테이블 생성 
create table table2(
 no_pk int , 
    constraint primary key( no_pk ) ,
    num_fk int ,        -- 'num_fk' 속성 을 int 타입 선언  
    constraint foreign key( num_fk ) references table1( num_pk )   -- 선언된 'num_fk'' 속성을 fk(참조키) 설정 'table1' 테이블의 'num_pk' 를 참조 
    on update cascade  on delete cascade  -- 만약에 table1 의 'num_pk' 값이 수정/삭제 되면 'num_fk' 값도 같이 수정/삭제 
); 
# 3. 서로 다른 테이블 합치기 = JOIN , # PK레코드와 FK레코드를 하나의 테이블로 조회  
# 샘플 데이터 
insert into table1 values( 1 ) , (2) , (3) , (4) , (5);
insert into table2 values( 1 , 1 ) , ( 2 , 2 ) , ( 3 , 1 ) , (4 , 1 ) , (5, 2);
# 레코드 조회 
select * from table1;
select * from table2;

-- table2 : 1 1 , 3 1 , 4 1,

# [1] 교집합
SELECT * FROM table1 , table2; -- 2개 이상 테이블 조회
# 1. WHERE
SELECT * FROM TABLE1 , TABLE2 WHERE TABLE1.NUM_PK = TABLE2.NUM_FK; -- 5개
SELECT * FROM TABLE1 T1, TABLE2 T2 WHERE T1.NUM_PK = T2.NUM_FK; -- 별칭 이용한

# 2. 테이블A INNER JOIN 테이블B ON 조인조건
SELECT * FROM TABLE1 T1 INNER JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK;

# 3. 테이블A JOIN 테이블B ON 조인조건
SELECT * FROM TABLE1 T1 JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK;

# 4. 테이블A NATURAL JOIN 테이블B *전제조건: PK와 FK 필드명 같은경우
-- SELECT * FROM TABLE1 T1 NATURAL JOIN TABLE2 T2;

# 5. 테이블A JOIN 테이블B USING( 필드명 ) *전제조건: PK 와 FK 필드명 같은경우
,-- SELECT * FROM TABLE T1 JOIN TABLE2 T2 USING(NUM);

# * 3개 이상 테이블 조인
-- SELECT * FORM TABLE1 T1 INNER JOIN TABLE2 T2 ON 조인조건 INNER JOIN TABLR3 T3 ON 조인조건

# OUTER JOIN
# 1. 테이블A LEFT OUTER JOIN 테이블B ON 왼쪽 테이블에 모든 레코드와 오른쪽 테이블에 교집합 되는 조회
SELECT * FROM TABLE1 T1 LEFT OUTER JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK; -- 8개
# 2. 테이블A RIGHT OUTER JOIN 테이블B  ON , 오른쪽 테이블에 모든 레코드와 왼쪽 테이블에 교집합 되는 조회
SELECT * FROM TABLE1 T1 RIGHT OUTER JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK;
# OUTER 생략가능
SELECT * FROM TABLE1 T1 RIGHT JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK;

# 합집합 , 테이블A UNION 테이블B : 중복 제외한 2개이상 테이블 합치기 , ORACLE : FULL OUTER JOIN
SELECT * FROM TABLE1 T1 LEFT JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK UNION
SELECT * FROM TABLE1 T1 RIGHT JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK;

# 차집합 , 테이블 A LEFT JOIN 테이블B ON 조인조건 WHERE 테이블B.FK IS NULL
SELECT NUM_PK FROM TABLE1 T1 LEFT JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK WHERE NUM_FK IS NULL;
SELECT NUM_FK FROM TABLE1 T1 RIGHT JOIN TABLE2 T2 ON T1.NUM_PK = T2.NUM_FK WHERE NUM_PK IS NULL;
