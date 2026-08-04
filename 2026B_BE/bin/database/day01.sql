-- [1]

-- 데이터베이스란 여러 데이터들을 집합해놓은 공간
-- 데이터베이스 서버란 여러 데이터베이스들을 저장한 PC 또는 프로그렘
-- 1. SQL 문법 작성한다. 2. ; 세미콜론 마침 3. 실행할 SQL 문법에 커서 두고 CRTL+엔터 또는 RUN

SHOW DATABASES; -- 연결된 DB 서버 내 모든 데이토베이스 목록 확인

-- [2] 데이터베이스 로컬 경로

SHOW VARIABLES LIKE 'datadir';

-- [3] 데이터베이스 생성 , SQL 문법은 대소문자 구분하지 않는다.
CREATE DATABASE mydb0804;

-- [4] 데이터베이스 삭제 , if exists 존재하면 삭제, 주의할점 : 없는 데이터베이스면 삭제 불가능
DROP DATABASE mydb0804;

DROP DATABASE IF EXISTS mydb0804;
-- [5] 데이터베이스 활성화 : 연결된 DB 서버내 여러개 DB 중 조작할 DB 선택

USE mydb0804;

-- [활용] : 프로젝트 데이터베이스 생성한다.
-- 1. DROP 부터 사용한다.

DROP DATABASE IF EXISTS boardService;

CREATE DATABASE boardService;

USE boardService;