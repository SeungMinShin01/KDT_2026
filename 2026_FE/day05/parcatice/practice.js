/*
    [문제1]
    배열에서 최댓값 찾기
    가장 큰값 찾기
*/

// let numbers = [23, 5, 67, 12, 88, 34];
// let max = numbers[0];

// for (let i = 0; i < numbers.length; i++) {
//   if (max < numbers[i]) max = numbers[i];
// }
// console.log(max);

/*
    [문제2]
    별 찍기
    *****
    ****
    ...
// */
// let star = "";

// for (let i = 0; i < 5; i++) {
//   for (let j = i; j < 5; j++) {
//     star += "*";
//   }
//   star += "\n";
// }

// console.log(star);

/*
    [문제3]
    배열에서 특정 문자 찾기 (break)
    이름 배열에서 '솔' 글자가 들어간 첫 번째 사용자
    해당 사용자의 이름을 출력하고 반복문 종료
*/

// let userNames = ["김하준", "이서하", "박솔민", "최도윤"];

// for (let i = 0; i < userNames.length; i++) {
//   if (userNames[i].includes("솔")) { //반복문을 돌리니까 indexOf의 인덱스 반환이 필요없음
//     console.log(userNames[i]);
//     break;
//   }
// }

/*
    [문제4] 2차원 배열의 모든 요소 출력
    배열(좌석표)가 있다. 중첩 for 문을 통해 모든 좌석의 값 순서대로 출력
*/

// let seatLayout = [
//   ["A1", "A2", "A3"],
//   ["B1", "B2", "B3"],
//   ["C1", "C2", "C3"],
// ];

// // [3][3] 행 -> 열 출력

// for (let i = 0; i < 3; i++) {
//   //행
//   for (j = 0; j < 3; j++) {
//     //열
//     console.log(seatLayout[i][j]);
//   }
// }

/*
    [문제 5] 배열의 중복 요소 제거
    주어진 배열에서 중복된 요소 제거, 
    중복없는 새로운 배열을 "만들어" 출력
*/

// let numbers = [1, 5, 2, 6, 3, 5, 1, 4, 2, 6, 9];
// let newNumbers = [];

// for (let i = 0; i < numbers.length; i++) {
//   if (newNumbers.indexOf(numbers[i]) == -1) {
//     newNumbers.push(numbers[i]);
//   }
// }
// console.log(newNumbers);

/*
    [문제 6] 버블정렬 구현
    버블 정렬 알고리즘 - 오름차순 정렬
    최종 정렬된 배열 출력
*/
// let numbers2 = [5, 3, 4, 1, 2, 6, 8, 0];

// for (let i = 0; i < numbers2.length; i++) {
//   for (let j = 0; j < numbers2.length; j++) {
//     if (numbers2[j] < numbers2[j + 1]) {
//       let temp;
//       temp = numbers2[j];
//       numbers2[j] = numbers2[j + 1];
//       numbers2[j + 1] = temp;
//       console.log(numbers2); // 알고리즘 확인용 콘솔
//     }
//   }
// }
// console.log(`최종 배열: ${numbers2}`);

/*
    [문제 7] 재고 관리 시스템
    두 개의 배열 product(상품 목록) stock(재고 수량)
    상품명과 수량 입력
    충분하면 "구매 완료!" 재고차감
    재고가 부족하면 "재고가 부족합니다."
*/

// let products = ["볼펜", "노트", "지우개"];
// let stock = [10, 5, 20];

// let productName = prompt("상품명 입력");
// let quantity = Number(prompt("수량 입력"));

// for (let i = 0; i < products.length; i++) {
//   if (products[i].includes(productName) && stock[i] > quantity) {
//     //상품과 재고의 인덱스가 서로 같다는 가정하에
//     console.log("구매 완료!");
//   } else if (products[i].includes(productName) && stock[i] < quantity) {
//     console.log("재고가 부족합니다.");
//   }
// }

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
