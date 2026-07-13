/*
    [문제1]
    배열에서 최댓값 찾기
    가장 큰값 찾기.
*/

let numbers = [23, 5, 67, 12, 88, 34];
let max = numbers[0];

for (let i = 0; i < numbers.length; i++) {
  if (max < numbers[i]) max = numbers[i];
}
console.log(max);

/*
    [문제2]
    별 찍기
    *****
    ****
    ...
*/
let star = "";

for (let i = 0; i < 5; i++) {
  for (let j = i; j < 5; j++) {
    star += "*";
  }
  star += "\n";
}

console.log(star);

/*
    [문제3]
    배열에서 특정 문자 찾기 (break)
    이름 배열에서 '솔' 글자가 들어간 첫 번째 사용자
    해당 사용자의 이름을 출력하고 반복문 종료
*/

let userNames = ["김하준", "이서하", "박솔민", "최도윤"];

for (let i = 0; i < userNames.length; i++) {
  if (userNames[i].includes("솔")) {
    //반복문을 돌리니까 indexOf의 인덱스 반환이 필요없음
    console.log(userNames[i]);
    break;
  }
}

/*
    [문제4] 2차원 배열의 모든 요소 출력
    배열(좌석표)가 있다. 중첩 for 문을 통해 모든 좌석의 값 순서대로 출력
*/

let seatLayout = [
  ["A1", "A2", "A3"],
  ["B1", "B2", "B3"],
  ["C1", "C2", "C3"],
];

// [3][3] 행 -> 열 출력

for (let i = 0; i < 3; i++) {
  //행
  for (j = 0; j < 3; j++) {
    //열
    console.log(seatLayout[i][j]);
  }
}

/*
    [문제 5] 배열의 중복 요소 제거
    주어진 배열에서 중복된 요소 제거, 
    중복없는 새로운 배열을 "만들어" 출력
*/

let numbers1 = [1, 5, 2, 6, 3, 5, 1, 4, 2, 6, 9];
let newNumbers = [];

for (let i = 0; i < numbers1.length; i++) {
  if (newNumbers.indexOf(numbers1[i]) == -1) {
    newNumbers.push(numbers1[i]);
  }
}
console.log(newNumbers);

/*
    [문제 6] 버블정렬 구현
    버블 정렬 알고리즘 - 오름차순 정렬
    최종 정렬된 배열 출력
*/
let numbers2 = [5, 3, 4, 1, 2, 6, 8, 0];

for (let i = 0; i < numbers2.length; i++) {
  for (let j = 0; j < numbers2.length; j++) {
    if (numbers2[j] < numbers2[j + 1]) {
      let temp;
      temp = numbers2[j];
      numbers2[j] = numbers2[j + 1];
      numbers2[j + 1] = temp;
      console.log(numbers2); // 알고리즘 확인용 콘솔
    }
  }
}
console.log(`최종 배열: ${numbers2}`);

/*
    [문제 7] 재고 관리 시스템
    두 개의 배열 product(상품 목록) stock(재고 수량)
    상품명과 수량 입력
    충분하면 "구매 완료!" 재고차감
    재고가 부족하면 "재고가 부족합니다."
*/

let products = ["볼펜", "노트", "지우개"];
let stock = [10, 5, 20];

let productName = prompt("상품명 입력");
let quantity = Number(prompt("수량 입력"));

for (let i = 0; i < products.length; i++) {
  if (products[i].includes(productName) && stock[i] > quantity) {
    //상품과 재고의 인덱스가 서로 같다는 가정하에
    console.log("구매 완료!");
  } else if (products[i].includes(productName) && stock[i] < quantity) {
    console.log("재고가 부족합니다.");
  }
}

/*
    [문제 8] 영화 평점 시각화
    (1) 초기  데이터  - 두 배열의 동일한 인덱스 사용 
    10점만점만큼 꽉찬별, 나머지 점수만큼 빈 별을 출력
    HTML 표시 ★ ☆
*/

let movieNames = ["히든페이즈", "위키드", "글래디에이터2", "청설"];
let movieRatings = [8, 4, 7, 6];
let maxRate = 10;
let rate = "";

for (let i = 0; i < movieNames.length; i++) {
  rate += `<tbody><tr><td> ${movieNames[i]}</td><td> `;
  for (let j = 0; j < movieRatings[i]; j++) {
    rate += `★`;
  }
  for (let k = 0; k < 10 - movieRatings[i]; k++) {
    rate += `☆`;
  }
  rate += `</td></tr></tbody><br />`;
  document.querySelector("table").innerHTML = `${rate}`;
}

/*
    [문제 9] 좌석 예약 상태 표시
    6개의 좌석을 2칸식 3줄 형태로 표시
    좌석 상태에 따라
    빈좌석 - blue / 예약석 - red
*/

let seatStatus = ["빈좌석", "예약석", "예약석", "빈좌석", "예약석", "빈좌석"];

let result2 = "";
let color = "";

for (let i = 0; i < seatStatus.length; i++) {
  if (seatStatus[i] == "예약석") {
    color = "red";
  } else if (seatStatus[i] == "빈좌석") {
    color = "blue";
  }
  /*
    <h2><span style="color: 색깔(red/blue)">좌석상태</span>
    <span style="color 색깔(red/blue)>좌석상태</span><br />...</h2> 반복"
    하면 -> 두칸씩 <br /> / 정해진 color (blue / red)에 따라 <span> 태그에 color 속성 변경
    빈좌석 예약석
    예약석 빈좌석
    예약석 빈좌석
  */
  if (i % 2 == 1) {
    document.querySelector(`h2 `).innerHTML +=
      `<span style="color: ${color};">${seatStatus[i]}</span> `;
    document.querySelector("h2").innerHTML += "<br />";
  } else
    document.querySelector("h2").innerHTML +=
      `<span style="color: ${color};">${seatStatus[i]}</span> `;
}

/*
  [문제 10] 주차 요금 정산

  HTML 출력
  차량 번호, 주차 시간(분), 최종 요금

   기본 요금: 최초 30분까지 1000원
   추가 요금: 30분 초과 시, 매 10분마다 500원
   일일 최대 요금: 20000원
*/

let carNumbers = ["210어7125", "142가7415", "888호8888", "931나8234"];
let usageMinutes = [65, 30, 140, 420];
let fee = 0;
let html = "";

for (let i = 0; i < carNumbers.length; i++) {
  fee = 1000 + parseInt((usageMinutes[i] - 30) / 10) * 500;
  if (fee > 20000) fee = 200000;
  html = `${carNumbers[i]}: ${usageMinutes[i]}분 주차, 최종 요금: ${fee}`;
  document.querySelector("h2").innerHTML += `${html} <br />`;
}
