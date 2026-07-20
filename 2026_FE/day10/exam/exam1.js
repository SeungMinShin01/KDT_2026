/*
    함수(Function) : 미리 정의된 수/코드 , 상자안에 들어오는 수/코드 , 함(상자) 수(숫자 / 크기)
        - 목적 : 1. 재사용 2. 매개변수에 따른 서로 다른 결과물 3. 지역변수
        * 매개변수(Parameter) : 함수를 호출하는 인자와 함수를 실행하는 변수 연결
        * 변수 : 하나의 값/자료 저장 , * 인자값 : 함수에 전달하는 값
        - 종류 : 1. 미리 만들어진함수(라이브러리) 2. 내가 만든 함수
*/

// [1] 사용법
// 1. 미리 만들어진 함수 : 라이브러리 , 각 프로그래밍 회사에서 제공
console.log("함수 1");
document.querySelector("body").innerHTML = "함수2";

// 2. 내가만드는함수 : 정의함수, 개발자가 함수를 직접 정의, * 함수도 자료의 타입이다.
function fun1(매개변수1) {
  //실행코드
  console.log(매개변수1);
} // f end

// * 함수호출

fun1(3);

// [2] 예시1
function 믹서기함수(과일) {
  return 과일 + "주스"; //* 함수가 종료되면서 반환하는값;
}

let 컵1 = 믹서기함수("사과");
let 컵2 = 믹서기함수("포도");

// [3] 예시 2 : 수학공식함수는 x 와 y 매개변수로 받아서

function 수학공식함수(x, y) {
  a = x + y;
  return a;
}

let 결과1 = 수학공식함수(3, 5);
let 결과2 = 수학공식함수(3, -2);

// 1. 매개변수 x , 반환값 x

function func2() {
  console.log("func2 exe");
  y = 3 + 2;
}

// 2. 매개변수 o , 반환값 x 예] console.log( )

function fun3(x) {
  console.log("fun3 exe");
  y = x + 2;
}

// 3. 매개변수 o , 반환값 o 예] prompt( )

function fun4(x) {
  console.log("fun4 exe");
  y = x + 2;
  return y;
}

// 4. 매개변수 x , 반환값 o 예] prompt( )

function fun4() {
  console.log("fun5 exe");
  y = 3 + 2;
  return y;
}

// 1. 지역변수 : if , for , function 문법 {} 에서 선언된 let 변수 , (선언) let a = 10 vs (호출 / 수정) a = 20
let 전역변수1 = "대한민국"; // 1] 해당 변수는 어떠한 { } 포함되는 선언이 아니므로 모든 곳에서 호출 가능
if (ture) {
  let 지역변수1 = "경기도"; // 2] 해당 변수는 if { } 에서 선언된 변수
  for (let i = 0; i <= 1; i++) {
    let 지역변수2 = "안양시"; // 3] 해당 변수는 for { } 에서 선언된 변수

    console.log(지역변수1);
    console.log(지역변수2);
  }
  if (true) {
    let 지역변수3 = "성남시";
    console.log(지역변수2); //오류x : { } 밖 x
  }
}

console.log(전역변수1); // 오류X : 특정한 { } 선언이 아니므로 사용가능
// console.log(지역변수1); // 오류O : 지역변수1은 if { } 선언 했으므로 그 안에서만 사용가능

// 3. HTML에서 함수 호출 방법
function fun7() {
  console.log("fun 7 exe");
}
