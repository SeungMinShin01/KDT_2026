/*
    반복문 : for( 초기값; 조건식; 증감식 ) { 실행문 }
    배열과 반복문 관계 : 배열의 인덱스는 0부터 요소/자료가 저장되는 순서 규칙
    즉 인덱스는 0부터 마지막 인덱스까지 1씩 증가
*/

// [1] 배열의 데이터를 하나씩 출력
// let fruitList = ["사과", "포도", "딸기"];
// //1.

// console.log(과일목록[0]);
// console.log(과일목록[1]);
// console.log(과일목록[2]);

// //2.
// for (let i = 0; i < 3; i++) {
//   console.log(fruitList[i]);
// }
// // length란, 배열 내 요소/ 자료 개수 반환, 마지막 인덱스: 배열.length-1
// for (let i = 0; i < fruitList.length; i++) {
//   console.log(fruitList[i]);
// }

// [생각해보기] 3개의 이름을 입력받아 배열에 저장하고 배열에 저장된 이름들을 HTML 출력하시오.

let name = [];
let html = " ";
for (let i = 0; i < 3; i++) {
  name.push(prompt(`이름${i + 1} 입력:`));
  html += `<li>${name(i)}</li>`;
}
document.querySelector("ul").innerHTML = html;
