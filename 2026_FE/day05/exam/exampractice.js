// /*
//     [1] 1부터 10까지 출력

// */
// for (let i = 0; i < 10; i++) {
//   console.log(i);
// }

// /*
//     [2] 배열의 모든 요소 출력
// */

// let fruits = ["사과", "바나나", "포도", "딸기"];

// for (let i = 0; i < fruits.length; i++) {
//   console.log(fruits[i]);
// }

// //[3] 배열 역순으로 출력

// let numbers = [1, 2, 3, 4, 5];

// for (let i = numbers.length; i > 0; i--) {
//   console.log(numbers[i - 1]);
// }

// // [4] 1부터 50까지의 합계

// let sum = 0;

// for (i = 1; i <= 50; i++) {
//   sum += i;
// }
// console.log(sum);

// // [5] 짝수만 출력.

// let even = "";

// for (i = 1; i <= 20; i++) {
//   if (i % 2 == 0) {
//     even += `${i}, `;
//   }
// }
// console.log(even);

// [6] 배열 요소의 합계와 평균

// let scores = [85, 92, 78, 65, 95];

// let sum = 0;
// let avg;

// for (i = 0; i < scores.length; i++) {
//   sum += scores[i];
// }
// avg = sum / scores.length;
// console.log(`${sum}, ${avg}`);

// [7] 특정 조건 반복분 탈출
// 100점 만점이 나오면 출력하고 탈출

let scores = [77, 82, 100, 54, 96];

for (let i = 0; i < scores.length; i++) {
  if (scores[i] != 100) {
    console.log(`${i}번째 탐색 중..`); //for문이 돌아가는지 검증용 콘솔
    continue;
  } else {
    console.log(`100점 만점자를 찾았습니다. 탐색횟수:${i}`);
    break;
  }
}

// [8]
// 점수배열에서 60점 미만인 점수 건너뛰고
// 60점 이상 점수 콘솔 출력

let scores2 = [90, 45, 72, 88, 59, 100];
let result = "";
for (let i = 0; i < scores2.length; i++) {
  if (scores2[i] >= 60) {
    result += `${scores2[i]}, `;
  }
}
console.log(result);

// [9]
// 'A'형 혈액형 사람 몇명
// 'A'형 수 출력

let bloodTypes = ["A", "B", "O", "AB", "A", "B", "A"];
let count = 0;

for (let i = 0; i < bloodTypes.length; i++) {
  if (bloodTypes[i] == "A") {
    count += 1;
  }
}
console.log(count);

//[10] 학생 점수 시각화
// 이름과 점수배열 이동 각 학생의 점수를 ○ ● 로 표시
// 100점 만점으로 십의자리수 = ● (10 - 십의 자리수) = ○

let nameArray = ["유재석", "강호동", "신동엽", "신승민"];
let scores3 = [92, 86, 72, 43];
let result2 = "";

for (let i = 0; i < nameArray.length; i++) {
  result2 += `${nameArray[i]} `;
  for (let j = 0; j < parseInt(scores3[i] / 10); j++) result2 += "●";
  for (let k = 0; k < parseInt(10 - scores3[i] / 10); k++) result2 += "○";
  result2 += `<br />`;
  document.querySelector("h2").innerHTML = `${result2}`;
}
