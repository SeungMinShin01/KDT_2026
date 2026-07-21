/* 
    [1번] 성인 인증 함수
     age 매개변수 20세 이상이면 true 미만이면 false isAdult 함수  
    isAdult(25)와 isAdult(17)의 결과 콘솔 출력     
*/

function isAdult(age) {
  let result;
  if (age >= 20) result = true;
  else result = false;
  return result;
}

console.log(isAdult(25));
console.log(isAdult(17));

/*
    [2번] 배열의 총합 구하기
    숫자로 이루어진 배열을 매개변수
    for 통해 모든 요소의 합계 구하여 반환
*/

const numbers = [10, 20, 30, 40, 50];

function sumArray() {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum += numbers[i];
  }
  return sum;
}

console.log(sumArray());

/*
    [3번] 가장 긴 단어 찾기
    배열 매개변수 가장 긴 단어를 찾아 반환
*/

const words = ["apple", "banna", "kiwi", "strawberry"]; //const로 선언해도 배열 내부값은 변경될 수 있다.

function findLongestWord() {
  let max = 0;
  for (let i = 0; i < words.length; i++) {
    if (max < words[i].length) {
      max = words[i].length;
      result = words[i];
    }
  }
  return result;
}

console.log(findLongestWord());

/*
    [4번] 게임 점수 관리
    전역변수 0, 함수1 = 점수 10증가, 함수2 = 점수 5감소
    점수증가 3번 점수감소 한번 호출, 최종점수
*/

let userScore = 0;

function gainScore() {
  userScore += 10;
}

function loseScore() {
  userScore -= 5;
}

gainScore();
gainScore();
gainScore();
loseScore();
console.log(userScore);

/*
    [5번] 최고 점수 학생 찾기
    전역변수 students 배열
    가장 높은 점수의 이름 찾아 반환
*/

const students = [
  {
    name: "김철수",
    score: 85,
  },
  {
    name: "이영희",
    score: 92,
  },
  {
    name: "박민준",
    score: 78,
  },
];

function findTopStudent() {
  let max = 0;
  for (let i = 0; i < students.length; i++) {
    if (max < students[i].score) {
      max = students[i].score;
      result = students[i].name;
    }
  }
  return result;
}

console.log(findTopStudent());

/*
    [6번] 상품 목록 페이지
    전역변수 배열 데이터를 이용하여 각 상품을 소개하는 HRML 요소를 동적으로 만들어 페이지를 표시하는 함수를 만들어라

*/

const products = [
  {
    name: "노트북",
    price: 1200000,
    stock: 5,
  },
  {
    name: "모니터",
    price: 350000,
    stock: 12,
  },
  {
    name: "키보드",
    price: 80000,
    stock: 25,
  },
];

function renderProducts() {
  let html = "";
  for (i = 0; i < products.length; i++) {
    html += `<h4>상품 : ${products[i].name} </h4>
            <p>가격 : ${products[i].price}원 </p>
            <p>재고 : ${products[i].stock}개 `;
  }
  document.querySelector("body").innerHTML = html;
}

renderProducts();

/*
    [7번] 간단한 계산기

*/

function calculator(num1, num2, operator) {
  if (operator == "+") result = num1 + num2;
  else if (operator == "-") result = num1 - num2;
  return result;
}
console.log(calculator(5, 4, "+"));
console.log(calculator(10, 2, "-"));

/*
    [8번] HTML 리스트(ul, li) 동적 생성
    투두리스트 전역 배열
    함수는 배열을 순회하여 할일 내용을 HTMl문자열로 만든다.
    최종적으로 이 문자열을 HTML 태그로 표현하여 리스트 그리기
*/

let todoList = ["장보기", "운동하기"];

function renderList() {
  let html = "";
  for (let i = 0; i < todoList.length; i++) {
    html += `<li>${todoList[i]}</li>`;
  }
  document.querySelector("ul").innerHTML = html;
}

renderList();

/* 
    [9번] 입장료 계산 함수
    임의의 나이를 매개변수로 받아 입장료를 반환하는 함수
    8세 미만: "무료"
    8세 이상 19세 이해 : "5000원"
    20세 이상 : " 10,000원"
    문자열 반환
*/

function getTicketPrice(age) {
  let result = "";
  if (age < 8 && age > 0) result += `무료`;
  else if (age > 20) result += "10,000원";
  else result += "5,000원";
  return result;
}
console.log(getTicketPrice(5));
console.log(getTicketPrice(10));
console.log(getTicketPrice(21));
