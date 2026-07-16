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

/*
    [문제 2] prompt로 회원가입 및 아이디 중복확인 기능
    prompt를 세번 사용하여 사용자로부터
    '아이디', '비밀번호', '이름'을 입력받는다.
    입력받은 정보로 하나의 member 객체를 생성하고,
    members 배열에 저장하여 배열을 콘솔에 출력
    단, 입력받은 아이디가 이미 배열에 존재하면 
    '존재하는 아이디 입니다'를 출력하고 배열에 등록X
*/

const members = [
  {
    id: "user1",
    password: "pass1",
    name: "사용자1",
  },
  {
    id: "user2",
    password: "pass2",
    name: "사용자2",
  },
];

let 아이디 = prompt("ID 입력");
let 비밀번호 = prompt("PW 입력");
let 이름 = prompt("이름 입력");
let 중복 = false;

for (let i = 0; i < members.length; i++) {
  if (members[i].id == 아이디) {
    console.log("존재하는 아이디 입니다.");
    중복 = true;
    break;
  }
}
if (중복 == false) members.push({ id: 아이디, password: 비밀번호, name: 이름 });

console.log(members);

/*
    [문제3] 객체 배열의 속성 값 평균 구하기
    scores 배열에 담긴 모든 학생의 수학(math) 점수 평균을 계산하여 콘솔 출력
*/

const scores = [
  {
    name: "A",
    math: 80,
    science: 92,
  },
  {
    name: "B",
    math: 95,
    science: 88,
  },
  {
    name: "C",
    math: 76,
    science: 78,
  },
];
let 결과 = "";
let 총점수 = 0;
let 총평균 = 0;
for (let i = 0; i < scores.length; i++) {
  let 평균 = 0;
  총점수 += scores[i].math;

  평균 = (scores[i].math + scores[i].science) / 2; // 내풀이는 각 학생의 "수학+과학"의 평균
  결과 += `${scores[i].name} 평균: ${평균} \n `;
}
총평균 = 총점수 / parseInt(scores.length); // 문제는 "모든 학생"의 "수학 평균"
console.log(결과);
console.log(총평균);

/*
    [문제 4] 특정 조건 만족하는 객체 찾기
    products 배열에서 id가 3인 상품 객체를 찾아, 해당 객체 전체를 콘1솔에 출력
    일치하는 객체가 없으면 "상품을 찾을 수 없습니다." 출력
*/

let products2 = [
  {
    id: 1,
    name: "사과",
  },
  {
    id: 2,
    name: "바나나",
  },
  {
    id: 3,
    name: "포도",
  },
  {
    id: 4,
    name: "딸기",
  },
];
let a = false;

for (let i = 0; i < products2.length; i++) {
  if (products2[i].id == 3) {
    a = true;
    console.log(products2[i]);
  }
}
if (a == false) console.log("상품을 찾을 수 없습니다.");

/* 
    [문제 5] 객체 배열 필터링하기
    users 배열에서 isActive가 true이 사용자들만으로 구성된
    새로운 배열 activeUsers를 만들고, 이 배열을 콘솔에 출력하시오
*/

const users3 = [
  {
    id: 1,
    name: "유저1",
    isActive: true,
  },
  {
    id: 2,
    name: "유저2",
    isActive: false,
  },
  {
    id: 3,
    name: "유저3",
    isActive: true,
  },
  {
    id: 4,
    name: "유저4",
    isActive: false,
  },
];
let activeUsers = [];

for (let i = 0; i < users3.length; i++) {
  if (users3[i].isActive) {
    activeUsers.push(users3[i]);
  }
}
console.log(activeUsers);

/*
    [문제 6] 객체 배열 데이터 변환하기
    movies 배열에 있는 각 영화 객체에서 title 속성만 추출하여,
    영화 제목들로만 이루어진 새로운 배열 movieTitles를 만들고 콘솔에 출력
*/

const movies = [
  {
    title: "인셉션",
    director: "크리스토퍼 놀란",
  },
  {
    title: "기생충",
    director: "봉준호",
  },
  {
    title: "매트릭스",
    director: "위쇼스키 자매",
  },
];
let movieTitles = [];

for (let i = 0; i < movies.length; i++) {
  movieTitles.push(movies[i].title);
}
console.log(movieTitles);

/*
    [문제 7] 데이터 그룹화하기
    team 배열을 department를 기준으로 그룹화하여, 아래 result와 같은 형태로 만드시오.

    최종 결과 형태(result)
    {
    '개발팀': ['철수','민수'],
    '기획팀': ['영희','지혜']
    }
*/

const team = [
  { name: "철수", department: "개발팀" },
  { name: "영희", department: "기획팀" },
  { name: "민수", department: "개발팀" },
  { name: "지혜", department: "기획팀" },
];

let result = {};
for (let i = 0; i < team.length; i++) {
  if (team[i].department in result) {
    result[team[i].department].push(team[i].name);
    result[개발팀].push(철수); //이름만 추가.
  } else {
    result[team[i].department] = [team[i].name];
  }
}
console.log(result);

// let result = {};

// for (let i = 0; i < team.length; i++) {
//   if (team[i].department === "개발팀") {
//     if (!result.개발팀) {
//       result.개발팀 = [];
//     }

//     result.개발팀.push(team[i].name);
//   }

//   if (team[i].department === "기획팀") {
//     if (!result.기획팀) {
//       result.기획팀 = [];
//     }

//     result.기획팀.push(team[i].name);
//   }
// }

/*
    [문제 8] 장바구니 총액 계산하기
    고객의 장바구니 정보를 담은 cart 배열과 상품 정보를 담은
    productsInfo 배열이 있습니다.
    cart 배열: 각 요소는 고객이 담은 상품의 id와 수량을 가진다.
    productInfo 배열 : 각 요소는 상품의 고유 id와 가격을 가진다.
    cart 배열을 기준으로, 장바구니에 담긴 모든 상품의 총 결제 금액을 계산하여
    콘솔에 출력
*/

const cart = [
  {
    id: 1,
    quantity: 2,
  },
  {
    id: 3,
    quantity: 1,
  },
];

const productInfo = [
  {
    id: 1,
    price: 1000,
  },
  {
    id: 2,
    price: 5000,
  },
  {
    id: 3,
    price: 2500,
  },
];
let price = 0;

for (let i = 0; i < cart.length; i++) {
  for (let j = 0; j < productInfo.length; j++) {
    if (cart[i].id == productInfo[j].id) {
      price += productInfo[j].price * cart[i].quantity;
    }
  }
}
console.log(price);

/*
    [문제 9] 투표 결과 집계하기
    votes 배열은 투표 결과를 나타낸다.
    각 후보가 몇표를 받앗는지 집계하여, 
    후보의 이름이 키이고, 득표수가 값인 객체를 만들어 출력 
*/

// const votes = ["A", "B", "B", "C", "A", "B", "A"];

// let result = {};

// for (let i = 0; i < votes.length; i++) {
//   if (votes[i] in result) {
//     result[votes[i]]++;
//   } else result[votes[i]] = 1;
// }
// console.log(result);

/*
    [문제 10] 웹툰 평점 시각화하기
    webtoons 배열의 데이터를 이용하여, 각 웹툰의 평점을
    별로 시각화 하여 HTML에 출력해라
    ★☆
    조건 1: 평점(rating)은 10점 만점이다.
    조건 2: 평점의 정수 부분만큼 꽉 찬 별을, 10 - 정수만큼 빈 별을 출력
    조건 3: HTML에 웹툰 제목과 변환된 별점을 한줄씩 출력한다.
*/

const webtoons = [
  {
    title: "나 혼자만 레벨업",
    rating: 9.8,
  },
  {
    title: "유미의 세포들",
    rating: 9.9,
  },
  {
    title: "전지적 독자 시점",
    rating: 9.7,
  },
];

let html = " ";

for (let i = 0; i < webtoons.length; i++) {
  html += `${webtoons[i].title} `;
  for (let j = 0; j < parseInt(webtoons[i].rating); j++) {
    html += "★";
  }
  for (let k = 0; k < 10 - parseInt(webtoons[i].rating); k++) html += "☆";
  html += "<br />";
}
document.querySelector("div").innerHTML += html;

/*
    [문제 11] 공공 데이터 포털 : 인천 부평구 맛집 현황 테이블 만들기
    구현조건 
    1. 공공데이터 포털에서 '인청광역시 부평구_맛있는 집(맛집) 현황
    의 openAPI 신청하여 결과를 복사하여 'response' 변수에 저장
    let response = {}
    2. response 객체 안의 data 배열을 반복문을 사용하여 순회
    3. 각 동(행)의 정보를 표시할 HTML <table> 태그를 문자열로 만든다.
    4. 테이블의 각 셀에는 '업 소 명', '세대수', '소재지', '지정메뉴'
    '전화번호','업태' 정보가 순서대로 포함되어야한다.
    5. 최종적으로 완성된 HTML 테이블 문자열을 document.write() 사용하여 화면에 출력
*/

/*
    인천광역시 부평구_맛있는 집(맛집) 현황
    맛집의 업소명, 소재지, 지정메뉴, 전화번호, 업태 등을 수록한 데이터.
    지역의 대표 음식점을 발굴·홍보하고, 관광객 유치, 지역 상권 활성화, 외식산업 지원 및 음식문화 개선 정책 등에 활용 가능하다.

    활용 목적 및 특징
    – 업소별 지정 메뉴 및 업태(한식, 중식, 양식, 일식 등) 분석
    – 맛집 분포 현황을 통한 관광·상권 활성화 자료 활용
    – 음식문화 개선 및 지역 외식산업 지원 근거 제공
    – 주민·관광객 대상 맛집 안내 서비스 활용 가능

    주요 항목 설명
    ● 연번: 데이터의 고유 번호
    ● 업소명: 등록된 맛집의 공식 명칭
    ● 소재지: 업소가 위치한 주소
    ● 지정메뉴: 대표적으로 지정된 메뉴
    ● 전화번호: 업소 문의·예약을 위한 연락처
    ● 업태: 업소의 영업형태(한식, 중식, 양식, 일식 등)
*/

let response = {
  currentCount: 10,
  data: [
    {
      소재지: "인천광역시 부평구 동암산로 10 (십정동)",
      "업 소 명": "(주)온누리푸드온누리장작구이",
      업태: "한식",
      연번: 1,
      전화번호: "032-526-9292",
      지정메뉴: "오리훈제",
    },
    {
      소재지: "인천광역시 부평구 안남로417번길 20, 2층 (청천동)",
      "업 소 명": "1982삼계정",
      업태: "한식",
      연번: 2,
      전화번호: "032-512-1982",
      지정메뉴: "녹두삼계탕",
    },
    {
      소재지: "인천광역시 부평구 부평대로 301 (청천동,남광센트렉스 111호)",
      "업 소 명": "갈비가",
      업태: "한식",
      연번: 3,
      전화번호: "032-363-3787",
      지정메뉴: "속초코다리냉면",
    },
    {
      소재지: "인천광역시 부평구 평천로 553(삼산동)",
      "업 소 명": "경복궁삼계탕",
      업태: "한식",
      연번: 4,
      전화번호: "032-511-1494",
      지정메뉴: "들깨삼계탕",
    },
    {
      소재지: "인천광역시 부평구 길주남로 109,1층 (부개동,송현주택)",
      "업 소 명": "곱창마당",
      업태: "한식",
      연번: 5,
      전화번호: "032-271-2292",
      지정메뉴: "한우곱창모듬구이",
    },
    {
      소재지: "인천광역시 부평구 부평대로63번길 10-11 (부평동)",
      "업 소 명": "금강산추어탕",
      업태: "한식",
      연번: 6,
      전화번호: "032-527-8118",
      지정메뉴: "추어탕",
    },
    {
      소재지: "인천광역시 부평구부평대로87번길 4(부평동)",
      "업 소 명": "뉴욕반점",
      업태: "중식",
      연번: 7,
      전화번호: "032-516-4488",
      지정메뉴: "삼선짬뽕,찹쌀탕수육",
    },
    {
      소재지: "인천광역시 부평구 신트리로22번길 15-14 (부평동, 1층 일부)",
      "업 소 명": "더히든키친",
      업태: "양식",
      연번: 8,
      전화번호: "032-272-7276",
      지정메뉴: "바질페스토파스타",
    },
    {
      소재지: "인천광역시 부평구 마장로 402(청천동)",
      "업 소 명": "덕수갈비",
      업태: "한식",
      연번: 9,
      전화번호: "032-517-4070",
      지정메뉴: "왕갈비탕",
    },
    {
      소재지: "인천광역시 부평구 대정로 93, 웰링턴 1층 103호 (부평동)",
      "업 소 명": "동강해물탕",
      업태: "한식",
      연번: 10,
      전화번호: "032-524-9166",
      지정메뉴: "해물탕",
    },
  ],
  matchCount: 70,
  page: 1,
  perPage: 10,
  totalCount: 70,
};

document.write(`<table border='2'> <tr>`);
document.write(
  `<th>연번</th><th>업소명</th><th>소재지</th><th>지정메뉴</th><th>전화번호</th><th>업태</th>`,
);

// let temp = Object.keys(response.data[0]);

// for (let i = 0; i < temp.length; i++) {
//   document.write(`<th>${temp[i]}</th>`);
// }

document.write(`</tr>`);

for (let j = 0; j < response.data.length; j++) {
  document.write(`<tr><td>${response.data[j].연번}</td>
      <td>${response.data[j]["업 소 명"]}</td>
      <td>${response.data[j].소재지}</td>
      <td>${response.data[j].지정메뉴}</td>
      <td>${response.data[j].전화번호}</td>
      <td>${response.data[j].업태}</td>
     
    </tr>`);
}
document.write(`</table>`);
