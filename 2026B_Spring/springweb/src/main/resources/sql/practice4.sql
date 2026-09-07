
Spring 실습4

100%
B15

-- practice4 데이터베이스 초기 실행용 SQL (Insert 코드)
-- 1. 과정(Course) 정보 등록
INSERT INTO course (course_name, created_at, updated_at) VALUES ('자바 백엔드 개발자 과정', NOW(), NOW());
INSERT INTO course (course_name, created_at, updated_at) VALUES ('프론트엔드 React 과정', NOW(), NOW());
-- 2. 학생(Student) 정보 등록
INSERT INTO student (student_name, created_at, updated_at) VALUES ('김철수', NOW(), NOW());
INSERT INTO student (student_name, created_at, updated_at) VALUES ('이영희', NOW(), NOW());
-- 3. 수강(Enroll) 정보 등록
INSERT INTO enroll (status, course_id, student_id, created_at, updated_at) VALUES ('수강중', 1, 1, NOW(), NOW());
INSERT INTO enroll (status, course_id, student_id, created_at, updated_at) VALUES ('수강중', 1, 2, NOW(), NOW());
 
 
 	
-- practice4 데이터베이스 초기 실행용 SQL (Insert 코드)
-- 1. 과정(Course) 정보 등록
INSERT INTO course (course_name, created_at, updated_at) VALUES ('자바 백엔드 개발자 과정', NOW(), NOW());
INSERT INTO course (course_name, created_at, updated_at) VALUES ('프론트엔드 React 과정', NOW(), NOW());
-- 2. 학생(Student) 정보 등록
INSERT INTO student (student_name, created_at, updated_at) VALUES ('김철수', NOW(), NOW());
INSERT INTO student (student_name, created_at, updated_at) VALUES ('이영희', NOW(), NOW());
-- 3. 수강(Enroll) 정보 등록
INSERT INTO enroll (status, course_id, student_id, created_at, updated_at) VALUES ('수강중', 1, 1, NOW(), NOW());
INSERT INTO enroll (status, course_id, student_id, created_at, updated_at) VALUES ('수강중', 1, 2, NOW(), NOW());
스크린 리더 지원 사용 설정

배너 숨겨짐스크린 리더 기능을 사용하려면 Ctrl+Alt+Z을(를) 누르세요. 키보드 단축키에 대해 알아보려면 Ctrl+슬래시을(를) 누르세요.17명의 공동작업자가 문서 작업에 참여했습니다.