/*
    연산/함수 결과는 항상 1개
    분기/조건문 : 상황에 따라 흐름 분기/제어
    비가오면 우산챙기고 아니면 우산 두고간다.
    프로젝트/실무 : 어떠한 기능에 따른 상황 판단
*/

// 1. if문 : if( 조건식 ) 실행문, 조건식 결과가 ture(참)이면 실행문 처리
if (10 > 3) console.log("10은 3보다 크다."); // True -> console.log 실행
if (10 > 30) console.log("10은 30보다 크다."); // False -> fail

// 2. 실행문이 2개 이상이면 { }  묶는다.
if (10 > 3) {
  console.log("10은 3보다 크다.");
  console.log("3. [2]");
}

// 3. if문 : 조건식 결과 true(참) , false(거짓) 분기 처리
if (10 > 5) {
  console.log("10은 5보다 크다");
} else {
  console.log(" 10은 보다 작다. ");
}

// 4. if문 ~ else if ~ else : 다수 조건
if (10 > 3) console.log("10은 3보다 크다");
else if (10 < 11) console("10은 11보다 작다");
else if (10 > 1) console("10은 1보다 크다");
else console.log(" 나머지 ");
// vs if if if : 다수 조건에 따른 다수 결과를 처리
if (10 > 3) console.log("10은 3보다 크다");
if (10 < 11) console.log("10은 11보다 작다");
if (10 > 1) console.log("10은 1보다 크다");
// vs if () { if } : 조건을 단계적으로 좁혀갈때 사용
if (10 > 3) {
  if (10 < 11) {
    console.log("10은 3보다 크다");
  }
}
