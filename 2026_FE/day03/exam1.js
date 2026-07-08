console.log(" Js 실행");

// 한줄주석
/* 여러줄 주석 */

/*
    [1] 숫자타입
    1. 정수

    typeof 자료 -> 해당 자료의 타입명 확인
*/

console.log(10);
console.log(typeof 10);

/*
    2. 실수 : 부동소수점 "3.141592..."
*/

console.log(3.14);
console.log(typeof 3.14);

/* 
    [2] 문자열 타입
    1. ' '
    2. " "
    3. ` ` <- 백틱 안에 변수를 넣을 수 있다.
        - $ { }
*/

console.log("안녕");
console.log("안녕");
console.log(`안녕`);
let age = 19;
console.log(`나이는 ${age}살 입니다.`);

// 문자열 연결

console.log("안녕", "하세요");
console.log("안녕" + "하세요");
console.log(`안녕 ${3}`); // 문자열 템플릿? 문자열 내 코드 포함
console.log(`안녕` + 3); // 문자열 + 숫자 => 문자열
let a = 10;
console.log("안녕" + a);
console.log(`안녕 ${a}`); // 문자열 템플릿은 ` 백틱으로 감싼 자료 안에 ${} 이용하여 코드를 포함시킬 수 있다.

/*
    이스케이프(제어) 문자, \ 백슬래시
    '\' - 출력하려면 
    언어별 출력방법
        python: print("\\")
        Java: System.out.println("\\");
        JS : console.log("\\");
        HTML : &#92;
    '\n' 줄바꿈

*/

console.log("\\안녕");
console.log("\n안녕");
console.log("'안녕"); // 문자열 감싼 기호와 그 자체 기호 구분
console.log("\t안녕"); // '\t' 들여쓰기
console.log("\\");

/*
    불리언(논리) 타입
*/
console.log(true); // 참
console.log(false); // 거짓
console.log(10 > 3); // 논리연산자의 반환값

/*
    undefiend, null
    컴퓨터는 0 vs ' ' vs null vs undefined 모두 다르게 처리
    null: 참조가 없다
    undefiend: 정의가 없다
*/
let 과일상자; // 변수선언 : let 변수명
console.log(과일상자); //undefiend
let 채소상자 = null; // 변수선언 ok 초기화 but null
console.log(null); //null

/*
    배열 , 순서대로 나열
    [] 안에. ,를 이용하여 여러개의 자료들을 * 하나의 자료 * 로 표현
    인덱스(색인) : [] 해당 배열내 저장된 자료들의 순서번호, 0번부터 시작
*/
let arr = ["봄", "여름", "가을", "겨울", ["1학기", "2학기"]];
console.log(arr); //배열 전체호출
console.log(arr[0]); //특정 인덱스의 자료(요소값) 호출
console.log(arr[4]); //4 인덱스의 자료호출
console.log(arr[4][1]); //2학기
//vs
let 요소값1 = arr[4]; // (1) 4번 인덱스 요소 꺼내고 변수에 저장
let 요소값2 = 요소값1[1]; // (2) 1번 인덱스 요소 꺼내고 변수에 저장
/* 
    풀어서 설명하면 배열안의 배열을 먼저 꺼낸다.
    여기서 요소값1 = ['a', 'b']
    요소값2 = 요소값1[1]
    -> 요소값1 저장할때 꺼낸 배열 ['a','b'] 에서
    1번 인덱스를 꺼내서 요소값 2에 저장한다.
    -> 요소값2 = 'b'
*/
console.log(요소값2);

/*
    배열수정, 변수명 = 새로운배열
    * 변수(자료저장소) vs 배열(자료) *
    변수는 하나의 자료를 저장하기 때문에 새로운 대입이 들어오면 기존 대입은 사라진다.
*/

arr2 = ["유재석", "강호동"];
console.log(arr2);
arr2[0] = "유재석2"; // 0번 자리에 유재석을 유재석2로 변경한다.
console.log(arr2);

// 배열 요소 추가
arr2.push("서장훈"); // 마지막 자료 뒤에 새로운 자료 추가
console.log(arr2);

// 4. 배열 요소 삭제, splice( 삭제할인덱스, 개수)
arr2.splice(0, 1); // 0번 인덱스에 요소 1개를 삭제한다.
console.log(arr2);

/*
    5. 배열 요소 찾기
    .indexof(찾을값)
    만약에 찾을 값이 존재하면 찾은 인덱스를 반환
    없으면 -1
    .includes(찾을값)
    만약에 찾을값이 존재하면 true
    없으면 false 반환
*/
let 찾은인덱스 = arr2.indexOf("강호동");
console.log(찾은인덱스); // 0번 인덱스에 찾을 '강호동' 존재한다.

let 존재여부 = arr2.includes("강호동");
console.log(존재여부);

/*
    타입 변환
    3 vs "3" 숫자 3과 문자3은 다르다.
    실무는 JS만으로 개발 [X]
    JS + JAVA + PYTHON + DB + API + DATA + EXCEL 등
    외부언어/자료 혼합 [O]
    서로 다른 언어/자료들간의 통신 HTTP한다.
    JSON/XML/CSV 타입
    1. 자동 타입 변환
*/

console.log(3 + 3.14); // 정수 + 실수 => 실수
console.log(typeof ("3" + 5)); //문자 + 숫자 => 문자
console.log(typeof (3 + true)); //숫자 + 논리 => 숫자
console.log(typeof (false * true)); // 논리 + 논리 => 숫자

// 2. 직접 타입 변환
console.log(Number(true));
console.log(Number("10A")); // NaN, 10A -> 숫자형으로 변환 불가능
console.log(2 && 1);
console.log(parseInt("10")); // 문자열 10 -> 숫자(정수) 10으로 반환
console.log(parseFloat("3.14")); // 문자열 3.14 -> 숫자(실수) 3.14로 변환
console.log(String(10)); // 숫자 10 -> 문자열 10으로 변환
console.log(10 + "");

// 추후에 JAVA/PYTHON/API(외부자료) 들을 통신한경우
// JSON.parse ( 통신결과물 )

/*
    산술연산자: +더하기 -빼기 *곱하기 /나누기 %나머지
    컴퓨터는 백분율을 모른다.
    연결연산자: +연결연산자 문자 <-> 숫자 
    비교연산자: < > <= >=  초과 미만 이하 이상 
    ==(값이)같다. !=(값)같지않다. ===(값/타입)같다 !==(값/타입)같지않다
    논리연산자: &&(AND) || (OR) !부정
    대입연산자 : = 오른쪽항을 왼쪽항에 대입(넣기)
    + 복합대입연산자 : += -= *= /= %= 오른쪽항의 값을 왼쪽항에 연산 후 대입
    증감연산자 : ++ -- 
    * ++변수 --변수 변수++ 변수-- 전위(증가, 감소) 후위(증가, 감소)
    삼항연산자: 조건 ? 참 : 거짓 , true 와 false를 다른값으로 표현하고 싶을때
    점수 >= 90 ? '합격' : '불합격'  
    중첩 삼항연산자 조건1 ? 참1 : 조건2 ? 참2 : 조건3 ? 참3 : 거짓
*/

// [지문1] prompt 함수로 국어 , 영어 , 수학 점수를 각 입력받아서
// (각 변수에 저장하고) 총점 과 평균을 계산하여 console탭에 출력하시오.
/*
let 국어점수 = prompt("국어점수 입력");
let 영어점수 = prompt("영어점수 입력");
let 수학점수 = prompt("수학점수 입력");

let 총점 = parseInt(국어점수) + parseInt(영어점수) + parseInt(수학점수);
let 평균 = 총점 / 3;

console.log(`총점: ${총점}`);
console.log(`평균: ${평균}`);

// [지문2] prompt 함수로 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여
// console탭에 출력하시오.
let 반지름 = prompt("반지름 입력");
let 원넓이 = parseInt(반지름) ** 2 * 3.14;

console.log(`원넓이: ${원넓이}`);
*/

// [지문3] prompt 함수로 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의
// 비율% 계산하여 console탭에 출력하시오.

// let 실수1 = Number(prompt("첫번 째 숫자 입력"));
// let 실수2 = Number(prompt("두번 째 숫자 입력:"));
/*
    소수점 두자리까지 보여주기
    Number.toFixed(숫자)) - 숫자 자릿수만큼 자를 수 있다. 해당 숫자는 반올림되어 보여줌
    Math.round() - 반올림
    Math.ceil() - 올림
    Math.floor() - 내림

    참고자료 - https://blacklobster.tistory.com/9#google_vignette
*/
// let 비율1 = ((실수1 / 실수2) * 100).toFixed(2);

// console.log(`비율%: ${비율1} % `);

// [지문4] prompt 함수로 정수를 입력받아 입력받은 값이 홀수이면 true
// / 짝수이면 false 로 console탭에 출력하시오.

// let 정수 = Number(prompt("정수 입력"));
// let 결과 = 정수 % 2 == 1;

// console.log(`결과: ${결과}`);

// [지문5] prompt 함수로 정수를 입력받아 입력받은 값이 7의 배수이면 true
// / 아니면 false 로 console탭에 출력하시오.

// let 정수2 = Number(prompt("정수 입력"));
// let 결과2 = 정수2 % 7 == 0;

// console.log(`결과: ${결과2}`);

// [지문6] prompt 함수로 아이디 와 비밀번호를 입력받아서
// (입력받은)아이디가 'admin' 이고 (입력받은)비밀번호가 1234 와 일치하면
// true / 아니면 false 출력하시오.

// let 아이디 = prompt("아이디 입력");
// let 비밀번호 = prompt("비밀번호 입력");

// let 결과3 = 아이디 == "admin" && 비밀번호 == "1234";
// console.log(`결과: ${결과3}`);

// [지문7] prompt 함수로 정수를 입력받아 입력받은 값이 홀수 이거나
// 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.

// let 정수4 = Number(prompt("정수 입력"));
// let 결과4 = 정수4 % 2 == 1 || 정수4 % 7 == 0;

// console.log(`결과: ${결과4}`);

// [지문8] 1차점수 와 2차점수 prompt함수로 각 입력받아서
// 총점이 150점이상이면 '합격' 아니면 '불합격'
// HTML의 <h3> 에 출력하시오.

// let 점수1 = Number(prompt("1차 점수 입력"));
// let 점수2 = Number(prompt("2차 점수 입력"));

// let 결과5 = 점수1 + 점수2 >= 150 ? "합격" : "불합격";
// let 결과텍스트 = document.querySelector("h3");

// 결과텍스트.innerHTML = 결과5;

// // [지문9] 두 사람의 이름을 prompt함수로 각 입력받아서 만일 이름이 '유재석' 이면
// // 뒤에 (방장) 이라고 이름 뒤에 붙이고 아니면 생략한다.
// // HTML의 <ol> 에 결과를 출력하시오.

// let 사람1 = prompt("첫번 째 사람이름 입력");
// let 사람2 = prompt("두번 째 사람이름 입력");

// let 방장1 = 사람1 == "유재석" ? `${사람1} (방장)` : 사람1;
// let 방장2 = 사람2 == "유재석" ? `${사람2} (방장)` : 사람2;

// let 결과텍스트2 = document.querySelector("ol");

// 결과텍스트2.innerHTML = `<li>${방장1}</li> <li>${방장2}`;
/*
- 대상 요소(객체)의 내용(태그 사이에 작성된 항목)을 확인하거나 변경하는 용도로 사용하는 속성
- innerText 는 대상 요소의 내용 중 텍스트만 취급하지만(사용자에게 실제 보여지는 텍스트, 주석은 제외)
  innerHTML 은 대상 요소의 내용을 HTML 태그요소 및 텍스트요소까지 모두 취급(숨은 태그 및 주석도 포함)
  또한, textContent는 대상 요소의 내용 중 실제 텍스트 요소들만 취급함(숨은 태그 포함, 주석은 제외)
*/

// 증감연산자
let age = 40;
console.log(age++); // 40, 후위증가: 출력후에 증가, 현재 명령단위에서 가장 마지막에 처리
console.log(++age); // 42, 전위증가: 출력전에 증가, 현재 명령어단위에서 먼저 처리
console.log(--age); // 41, 전위감소: 출력전에 감소
console.log(age--); // 41 후위감소 : 출력후에 감소
