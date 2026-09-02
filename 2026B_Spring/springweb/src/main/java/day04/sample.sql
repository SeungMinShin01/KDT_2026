DROP DATABASE if EXISTS mydb0902;
create DATABASE mydb0902;
use mydb0902;

create table exam(
    eno Int PRIMARY KEY AUTO_INCREMENT ,
    ename VARCHAR(255)
);

INSERT INTO exam( ename ) VALUES('유재석');
INSERT INTO exam( ename ) VALUES('강호동');
INSERT INTO exam( ename ) VALUES('신동엽');

create Table board(
    bno INT PRIMARY KEY AUTO_INCREMENT,
    content VARCHAR(255),
    writer VARCHAR(50)
)

Insert INTO board(content , writer) VALUES ("안녕하세요" , "유재석");
Insert INTO board(content , writer) VALUES ("안녕하세요2" , "강호동");