/* 
    QueryString : URL 웹 주소 상에 매개변수 사용
        - 페이지 이동 간에 매개변수 값 전달
        - URL ? 매개변수명=값 & 매개변수=값
        - 사용법
            1) new URLSearchParams( location.search ) : queryString 객체 반환
            2) .gwt ( '매개변수명' ) : queryString 내 특정한 매개변수명의 값 반환
*/

// [1] JS 에서 URL 정보 객체 호출
// let url = new URLSearchParams(location.href);

// console.log(url);

let url2 = new URLSearchParams(location.search);
console.log(url2);

// http://127.0.0.1:5500/day13/exam/exam2.html?name=유재석
let name = url2.get("name");
console.log(name);

// [2] 페이지 이동하는 방법
// 1) <a href=" 웹주소?매개변수=값 ">링크 </>

let pcode = url2.get("pcode");
let page = url2.get("page");
console.log(pcode, page);

// 2) location.href = "URL?매개변수=값"
function linkfunc() {
  location.href = "exam2.html?name=강호동";
}

/*
    인터벌 : 특정한 주기에 따라 코드를 반복 실행
        - 사용법
            : 
*/

let value = 0;
function 증가함수() {
  value += 1;
  document.querySelector("#box1").innerHTML = value;
}
setInterval(증가함수, 1000);

function 시계함수() {
  let today = new Date();
  let hour = today.getHours();
  let min = today.getMinutes();
  let second = today.getSeconds();
  let time = `${hour} : ${min} : ${second < 10 ? "0" + second : second}`;
  document.querySelector("#box2").innerHTML = time;
}

setInterval(시계함수, 1000);

// 인터벌 시작/종료

let time = 0; // 초 저장하는 변수
let timeInter; // 인터벌 저장하는 변수

function 타이머시작() {
  timeInter = setInterval(타이머함수, 1000);
}
function 타이머함수() {
  time++;
  document.querySelector("#box3").innerHTML = time;
}

function 타이머종료() {
  clearInterval(timeInter);
}
