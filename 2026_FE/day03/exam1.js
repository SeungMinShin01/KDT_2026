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
