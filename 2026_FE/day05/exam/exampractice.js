/*
    [1] 1부터 10까지 출력
    
*/
for (let i = 0; i < 10; i++) {
  console.log(i);
}

/*
    [2] 배열의 모든 요소 출력
*/

let fruits = ["사과", "바나나", "포도", "딸기"];

for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

//[3] 배열 역순으로 출력

let numbers = [1, 2, 3, 4, 5];

for (let i = numbers.length; i > 0; i--) {
  console.log(numbers[i - 1]);
}

// [4] 1부터 50까지의 합계

let sum = 0;

for (i = 1; i <= 50; i++) {
  sum += i;
}
console.log(sum);

// [5] 짝수만 출력.

let even = "";

for (i = 1; i <= 20; i++) {
  if (i % 2 == 0) {
    even += `${i}, `;
  }
}
console.log(even);
