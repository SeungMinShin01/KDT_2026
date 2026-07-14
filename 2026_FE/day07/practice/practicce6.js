/* 
    [문제 1] prompt로 제품 정보 객체 만들기
    prompt를 세번 사용하여 사용자로부터
    '제품명' , '가격', '제조사'을 순서대로 입력
    입력받은 정보로 하나의 product 객체를 생성하고
    생성된 객체를 콘솔에 출력    
*/

let 제품명1 = prompt("제품명 입력");
let 가격1 = Number(prompt("가격 입력"));
let 제조사1 = prompt("제조사 입력");

let product = { 제품명: 제품명1, 가격: 가격1, 제조사: 제조사1 };
console.log(product);
