/* 
    변수란? 하나의 자료를 저장하는 메모리(컴퓨터 저장 단위) 공간
    같은 파일내 변수명은 중복이 안된다.
    1. let 2. 변수/상자/공간 이름 = 변수명 = 카멜표기법(권장) mycar -> myCar
    3. 대입연산자 이용하여 초기값 대입
*/
let 이름상자1; // 초기값이 없는 변수 선언
let 이름상자2 = 100; //초기값이 100인 변수 선언

이름상자2; // 변수명 작성하여 변수값 호출
console.log(이름상자2); // 변수명 작성하여 변수값 호출한뒤 con

이름상자2 = 200;
console.log(이름상자2);

/* 
    상수란? 하나의 자료를 저장하는 메모리 공간 *수정 불가능*
    1. const 2. 상수/상자/공간 이름 = 상수명 = 대문자 3. 초기값 필수
*/

// const 이름상자4;
const 이름상자3 = 300;
console.log((이름상자3 * 이름상자2) % 11);
//상수의 값 수정 불가능

//생각해보기

let point1 = 50;
let point2 = 50;
let point3 = 100;
let point4 = point1 + point2;

/*
    변수는 4개, 리터럴은 2개
    변수의 특징 : 저장(재사용), 동일한 자료를 서로다른 곳에 저장, 참조
*/

let age = 10;
let speed = 10;
//두 변수는 같은 리터럴 10 저장하지만 서로 다른 의미 갖는 10 저장하는 변수 표현

/* 
    출력함수
    함수: 자주 사용되는 코드들을 정의하여 재사용/호출 , 내가만든함수vs남이만든 함수
    1. console.log( 출력할자료 ) : 브라우저 개발자도구 [f12] CONSOLE 탭
*/

console.log("안녕하세요");

// 2. alert( 출력할 자료 ) : 브라우저 알림창에 메시지 출력
alert("안녕하세요");

// 3. *document.querySelector( "선택자" )
// document(gtml문서) , query(질의) , Selector(선택자) :
document.querySelector("h3").innerHTML = "JS에서 대입한 값";

/* 
    입력함수
    1. confirm( 출력할 메시지 ) : 브라우저 [확인=true]/[취소=false] 알림창
*/

let 결과1 = confirm(); // 입력받은 true 또는 false 변수에 저장
// 공식문서를 활용하라. CTRL CLICK
console.log(결과1);

let a = 5;
let b = 7;
let c = a + b;

/* 
    a랑 b는 눈으로 확인할 수 없다.
*/

// 2. prompt : 브라우저에서 입력이 가능한 창, 입력한 자료를 반환한다.
let 결과2 = prompt();
console.log(결과2);

/* 
    실무에선 사용 빈도가 적다. confirm, prompt
    매 시간 쉬는 시간마다 커밋/푸시 권장
*/
