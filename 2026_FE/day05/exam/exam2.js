/*
    반복문 : for( 초기값; 조건식; 증감식 ) { 실행문 }
    배열과 반복문 관계 : 배열의 인덱스는 0부터 요소/자료가 저장되는 순서 규칙
    즉 인덱스는 0부터 마지막 인덱스까지 1씩 증가
*/

//[1] 배열의 데이터를 하나씩 출력
let fruitList = ["사과", "포도", "딸기"];
//1.

console.log(과일목록[0]);
console.log(과일목록[1]);
console.log(과일목록[2]);

//2.
for (let i = 0; i < 3; i++) {
  console.log(fruitList[i]);
}
// length란, 배열 내 요소/ 자료 개수 반환, 마지막 인덱스: 배열.length-1
for (let i = 0; i < fruitList.length; i++) {
  console.log(fruitList[i]);
}

// [생각해보기] 3개의 이름을 입력받아 배열에 저장하고 배열에 저장된 이름들을 HTML 출력하시오.

let name = [];
let html = " ";
for (let i = 0; i < 3; i++) {
  name.push(prompt(`이름${i + 1} 입력:`));
  html += `<li>${name(i)}</li>`;
}
document.querySelector("ul").innerHTML = html;

/*
    반복문 제워키워드
    1. continue;
    2. break;
*/

for (let i = 1; 1 <= 5; i++) {
  //만약 반복수가 3이면 continue 만나면 코드흐름이 증감식으로 이동한다.
  if (i == 3) continue; //반복문의 *증감식*으로 흐름 이동
  console.log(i); //즉 반복수가 3이면 console.log 실행안됨.
}

//break; 반복문의 탈출/종료
for (let i = 0; i <= 5; i++) {
  if (i == 3) {
    break;
  }
  console.log(i);
}

//!! 여기로 이동!!

//3. 무한루푸 ( 무한 반복 ) *특정조건의 break 권장 *
// for( ; ; ){console.log( '무한출력중' )}
/* 
    for ( ; ; ){console.log('무한출력중'){
        let 입력 = prompt()
        if( 입력 == 'EXIT' ) { break }    
    }

*/
