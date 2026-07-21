/*
    목표
    - 사용자가 자신의 수입/지출 내역을 날짜, 항목, 금액으로 기록하고, 등록된 모든 내역을 한눈에 볼 수 있는 간단한 가계부 웹 페이지

    화면구성
    - 페이지는 사용자가 정보를 입력하는 등록영역과 그 결과를 보여주는 목록영영으로 명확히 구분되어야함

    등록 영역
    - 날짜 선택 : 사용자가 내역의 날짜를 달력에서 직접 선택할 수 있어야 한다.
    - 항목 입력 : 사용자가 지출 또는 수입 항목의 내용을 텍스트로 자유롭게 입력할 수 있어야 한다.
    - 금액 입력 : 사용자가 금액을 숫자로 입력할 수 있어야 한다.
    - 등록 버튼 : 위 세가지 정보를 입력한 후, 목록에 추가하기 위한 "등록" 버튼이 있어야 한다.

    목록 영역
    - 등록된 모든 가계부 내역을 보여주는 표가 있어야 한다.
    - 표는 "날짜", "항목", "금액" 순서의 열로 구성되어야 한다.

    핵심기능
    초기 데이터 표시
    - 사용자가 페이지를 처음 방문했을 때, 가계부 사용법을 쉽게 이해할 수 있도록 두 개의 예시 내역이 목록 표에 기본적으로 표시되어야함

    내역 등록 기능
    - 사용자가 등록 영역에 날짜, 항목, 금액을 모두 입력하고 "등록" 버튼을 클릭하면, 해당 내역이 목록 영역 표의 가장 아래쪽에 새로운 행으로
    즉시 추가되어야 한다.

    금액 자동 서식
    목록 영역에 표시되는 모든 금액은 사용자의 가동성을 위해 천 단위마다 , 가 자동으로 표시되어야한다.
    변수명.toLocaleString(): 숫자를 세자리마다 콤마(,)로 구분해주는 유용한 함수
*/

let date;
let price;
let item;

function showBudget() {
  date = document.querySelector(".date").value;
  price = document.querySelector(".price").value;
  item = document.querySelector(".item").value;

  console.log(`${date} ${price} ${item}`);
  let html = "";
  if (date != "" && price != "" && item != "") {
    html += `<tr><td>${date}</td><td>${item}</td><td>${parseInt(price).toLocaleString()}</td></tr>`;
    document.querySelector(" table > tbody").innerHTML += html;
  }
}
