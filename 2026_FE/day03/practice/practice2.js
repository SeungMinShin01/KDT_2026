/*
    [1번] 삼각형 넓이 계산
    밑변과 높이 prompt 함수 입력
    삼각형의 넓이 계산 콘솔 출력
    넓이 공식 : 밑변 * 높이 / 2
*/

let 밑변 = Number(prompt("삼각형의 밑변 입력"));
let 높이 = Number(prompt(" 삼각형의 높이 입력"));

let 넓이 = (밑변 * 높이) / 2;

console.log(`넓이 : ${넓이}`);

/*
    [2번] 섭씨를 화씨로 변환
    섭씨 온도 prompt로 입력
    화씨 온도 출력 콘솔
    변환 공식 : (섭씨온도 * 9/5) +32
*/

let 섭씨 = Number(prompt("섭씨 입력"));
let 화씨 = (섭씨 * 9) / 5 + 32;

console.log(`화씨 : ${화씨}°F`);

/*
    [3번] 나이 계산기
    태어난 년도 prompt 입력
    2025년 기준 현재 나이 계산 콘솔 출력
    계산 공식: 2025 - 태어난 년도
*/

let 태어난년도 = Number(prompt("태어난 년도 입력(숫자만)"));

let 현재나이 = 2025 - 태어난년도;

console.log(`${태어난년도}년생기준 현재나이:${현재나이} `);

/*
    [4번] BMI 지수계산
    키(cm), 몸무게(kg) prompt 입력
    BMI 공식: 몸무게/키*키
    힌트 - 공식에는 m 단위 

*/

let 키 = Number(prompt("키(cm) 입력"));
let 몸무게 = Number(prompt("몸무게(kg) 입력"));
let bmi = 몸무게 / (키 / 100) ** 2;

console.log(`BMI 지수: ${bmi}`);

/* 
    [5번] 관리자 확인
    아이디와 이메일 prompt
    아이디 admin 이메일 admin@test.com 이면 관리자
    아니면 일반 사용자 콘솔 출력

*/

let 아이디 = prompt("아이디 입력");
let 이메일 = prompt("이메일 입력");

let 결과1 =
  아이디 === "admin" && 이메일 === "admin@test.com" ? "관리자" : "일반 사용자";

console.log(`당신은 ${결과1}입니다.`);

/*
    [6번] 학점 변환기
    100점 만점의 점수를 prompt 입력
    점수에 따라 등급 부여 
    <h2> 태그로 출력
    90이상 A 80이상 90미만 B 70미만 C
    -> 70이상 80미만 등급이 없어서 오타로 판단하여 80미만 C등급으로 수정하겠습니다.
*/

let 점수 = Number(prompt("점수 입력(100점만점)"));
let 등급 =
  점수 > 100
    ? "100점 초과: 다시 입력해주세요"
    : 점수 >= 90
      ? "A"
      : 점수 >= 80 && 점수 < 90
        ? "B"
        : "C";
document.querySelector("h2").innerHTML = `등급 : ${등급}`;

/*
    [7번] 청년 할인 이벤트 대상 확인
    나이를 prompt 입력
    20대(20세 이상 29세 이하) "이벤트 대상입니다."
    아니면 "이벤트 대상이 아닙니다." 콘솔 출력
*/

let 나이 = Number(prompt("나이(숫자만) 입력"));
let 대상 =
  나이 >= 20 && 나이 <= 29 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다.";

console.log(대상);

/*
    [8번] '좋아요' 카운터 
    '좋아요' 수를 저장하는 likeCount 변수 3 선언
    증감연산자 ++ 사용 1증가
    좋아요:[숫자] 형식으로 새로운 좋아요 수를 콘솔에 출력

    (likecount++) 이후 좋아요 출력

*/

let likeCount = 3;

console.log(++likeCount);

/*
    [9번]
    todolist 배열
    prompt 입력 - 새로운 할일
    배열의 마지막에 추가 후 배열 전체 콘솔 출력
    초기배열: llet todoList=['장보기', '과제하기']
    배열ㅇ소 추가 .push()
*/

let todoList = ["장보기", "과제하기"];

todoList.push(prompt("할 일 추가"));

console.log(todoList);

/*
    [10번] 대기열의 마지막 사람 확인
    대기자 명단 waitingList 배열
    배열의 마지막 사람의 이름을 찾아
    "마지막 대기자는 [이름] 입니다."
    초기배열 
    waitingList = ['김민준', '이서연', '박도윤', '최지우']
    
*/

let waitingList = ["김민준", "이서연", "박도윤", "최지우"];

console.log(`마지막 대기자는 ${waitingList[waitingList.length - 1]}입니다.`);
