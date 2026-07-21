/*예제 1: 요소 내용 변경하기
id가 'title'인 <h1> 요소의 내용을 'DOM 조작 성공!'으로 변경하시오.*/

const h1 = document.querySelector("#title");
console.log(h1);
h1.innerHTML = "DOM 조작 성공!";

/*예제 2: 사용자 입력값 가져와서 표시하기
id가 'usernameInput'인 <input>에 이름을 입력하고 '확인' 버튼(id: 'submitBtn')을 클릭하면, 
id가 'greeting'인 <p> 태그에 "안녕하세요, [입력된이름]님!"이라고 표시하시오.*/

function greeting() {
  const nameInput = document.querySelector("#usernameInput");
  const name = nameInput.value;
  document.querySelector("#greeting").innerHTML = `안녕하세요 ${name}님`;
}

/*예제 3: 요소 스타일 동적으로 변경하기
'스타일 변경' 버튼(id: 'styleBtn')을 클릭하면, id가 'colorBox'인 <div>의 배경색을 'skyblue'로, 글자색을 'white'로 변경하시오.*/

function changecolor() {
  const boxText = document.querySelector("#colorbox");
  boxText.style = "color: #fff; background-color: skyblue ";
}

/*예제 4: CSS 클래스 토글하기 (다크 모드 예시)
'테마 변경' 버튼(id: 'themeBtn')을 클릭할 때마다 <body> 태그에 'dark-mode' 클래스를 추가하거나 제거(토글)하시오. */

function changeTheme() {
  const bodytag = document.querySelector("body");
  // .classList : 클래스 목록 반환
  // .classList.toggle( '클래스명' ) : 클래스 목록에 특정 클래스 토글
  bodytag.classList.toggle("darkmod");
}
/*예제 5: 특정 HTML 요소 제거하기
'박스 삭제' 버튼(id: 'removeBtn')을 클릭하면, id가 'targetBox'인 <div> 요소를 문서에서 제거하시오. */

function removeBox() {
  removeElenent = document.querySelector("#targetBox");
  removeElenent.remove();
}
/*예제 6: 여러 요소에 동일한 작업 반복하기
클래스가 'item'인 모든 <p> 요소의 글자색을 'green'으로, 글자 두께를 'bold'로 변경하시오. */
let htmlarr = document.querySelectorAll(".item");
for (let i = 0; i < htmlarr.length; i++) {
  htmlarr[i].style = "color: green; font-weight: bold;";
}

/*예제 7: 이미지 소스(src) 변경하기 , https://placehold.co/ 
'이미지 변경' 버튼(id: 'changeImgBtn')을 클릭하면, id가 'mainImage'인 
<img> 요소의 src 속성을 'https://placehold.co/600x400/red/white'로 변경하시오. */

function changeImg() {
  const Imgsrc = document.querySelector("#mainImage");
  Imgsrc.src = "https://placehold.co/600x400/red/white";
}
/* 예제 8 : select 에서 선택한 option값 console 출력하기. */

function select() {
  const optionvalue = document.querySelector("#optionConsole");

  console.log(optionvalue.value);
}

/* 예제 9 : input 에서 입력받은 값을 전역 배열에 저장하고 배열 상태를 출력하기. */

let newArr = [];

function arrConsole() {
  arrValue = document.querySelector("#inputBox");
  newArr.push(arrValue.value);
  console.log(newArr);
}
