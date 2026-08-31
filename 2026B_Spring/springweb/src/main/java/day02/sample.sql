	
DROP DATABASE IF EXISTS mydb0826;
CREATE DATABASE mydb0826;
USE mydb0826;
CREATE TABLE board( 
    no int AUTO_INCREMENT, 
    content VARCHAR(255) ,
    writer VARCHAR(30) ,
    constraint PRIMARY KEY( no ) 
);
insert into board( content, writer )values( "안녕하세요", "유재석" ),( "하하", "강호동"); -- 샘플 데이터 2개 

CREATE TABLE WAITING(
    WNO INT PRIMARY KEY AUTO_INCREMENT,
    PHONE_NUMBER VARCHAR(50) NOT NULL,
    HEAD_COUNT INT NOT NULL
)

INSERT INTO waiting ( `PHONE_NUMBER` , `HEAD_COUNT` )
    VALUES ( "010-1111-2222" , 2),( "010-0101-2020" , 5);
