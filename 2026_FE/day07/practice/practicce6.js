/* 
    [문제 1] prompt로 제품 정보 객체 만들기
    prompt를 세번 사용하여 사용자로부터
    '제품명' , '가격', '제조사'을 순서대로 입력
    입력받은 정보로 하나의 product 객체를 생성하고
    생성된 객체를 콘솔에 출력    
*/

// let 제품명1 = prompt("제품명 입력");
// let 가격1 = Number(prompt("가격 입력"));
// let 제조사1 = prompt("제조사 입력");

// let product = { 제품명: 제품명1, 가격: 가격1, 제조사: 제조사1 };
// console.log(product);

/*
    [문제 2] prompt로 회원가입 및 아이디 중복확인 기능
    prompt를 세번 사용하여 사용자로부터
    '아이디', '비밀번호', '이름'을 입력받는다.
    입력받은 정보로 하나의 member 객체를 생성하고,
    members 배열에 저장하여 배열을 콘솔에 출력
    단, 입력받은 아이디가 이미 배열에 존재하면 
    '존재하는 아이디 입니다'를 출력하고 배열에 등록X
*/

// const members = [
//   {
//     id: "user1",
//     password: "pass1",
//     name: "사용자1",
//   },
//   {
//     id: "user2",
//     password: "pass2",
//     name: "사용자2",
//   },
// ];

// let 아이디 = prompt("ID 입력");
// let 비밀번호 = prompt("PW 입력");
// let 이름 = prompt("이름 입력");
// let 중복 = false;

// for (let i = 0; i < members.length; i++) {
//   if (members[i].id == 아이디) {
//     console.log("존재하는 아이디 입니다.");
//     중복 = true;
//     break;
//   }
// }
// if (중복 == false) members.push({ id: 아이디, password: 비밀번호, name: 이름 });

// console.log(members);

/*
    [문제3] 객체 배열의 속성 값 평균 구하기
    scores 배열에 담긴 모든 학생의 수학(math) 점수 평균을 계산하여 콘솔 출력
*/

// const scores = [
//   {
//     name: "A",
//     math: 80,
//     science: 92,
//   },
//   {
//     name: "B",
//     math: 95,
//     science: 88,
//   },
//   {
//     name: "C",
//     math: 76,
//     science: 78,
//   },
// ];
// let 결과 = "";

// for (let i = 0; i < scores.length; i++) {
//   let 평균;
//   평균 = (scores[i].math + scores[i].science) / 2;
//   결과 += `${scores[i].name} 평균: ${평균} \n`;
// }
// console.log(결과);

/*
    [문제 4] 특정 조건 만족하는 객체 찾기
    products 배열에서 id가 3인 상품 객체를 찾아, 해당 객체 전체를 콘솔에 출력
    일치하는 객체가 없으면 "상품을 찾을 수 없습니다." 출력
*/

// let products2 = [
//   {
//     id: 1,
//     name: "사과",
//   },
//   {
//     id: 2,
//     name: "바나나",
//   },
//   {
//     id: 3,
//     name: "포도",
//   },
//   {
//     id: 4,
//     name: "딸기",
//   },
// ];
// let a = false;

// for (let i = 0; i < products2.length; i++) {
//   if (products2[i].id == 3) {
//     a = true;
//     console.log(products2[i]);
//   }
// }
// if (a == false) console.log("상품을 찾을 수 없습니다.");

/* 
    [문제 5] 객체 배열 필터링하기
    users 배열에서 isActive가 true이 사용자들만으로 구성된
    새로운 배열 activeUsers를 만들고, 이 배열을 콘솔에 출력하시오
*/

// const users3 = [
//   {
//     id: 1,
//     name: "유저1",
//     isActive: true,
//   },
//   {
//     id: 2,
//     name: "유저2",
//     isActive: false,
//   },
//   {
//     id: 3,
//     name: "유저3",
//     isActive: true,
//   },
//   {
//     id: 4,
//     name: "유저4",
//     isActive: false,
//   },
// ];
// let activeUsers = [];

// for (let i = 0; i < users3.length; i++) {
//   if (users3[i].isActive) {
//     activeUsers.push(users3[i]);
//   }
// }
// console.log(activeUsers);

/*
    [문제 6] 객체 배열 데이터 변환하기
    movies 배열에 있는 각 영화 객체에서 title 속성만 추출하여,
    영화 제목들로만 이루어진 새로운 배열 movieTitles를 만들고 콘솔에 출력
*/

// const movies = [
//   {
//     title: "인셉션",
//     director: "크리스토퍼 놀란",
//   },
//   {
//     title: "기생충",
//     director: "봉준호",
//   },
//   {
//     title: "매트릭스",
//     director: "위쇼스키 자매",
//   },
// ];
// let movieTitles = [];

// for (let i = 0; i < movies.length; i++) {
//   movieTitles.push(movies[i].title);
// }
// console.log(movieTitles);

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

// const cart = [
//   {
//     id: 1,
//     quantity: 2,
//   },
//   {
//     id: 3,
//     quantity: 1,
//   },
// ];

// const productInfo = [
//   {
//     id: 1,
//     price: 1000,
//   },
//   {
//     id: 2,
//     price: 5000,
//   },
//   {
//     id: 3,
//     price: 2500,
//   },
// ];
// let price;
// for (let i = 0; i < cart.length; i++) {
//   for (let j = 0; j < productInfo.length; j++) {
//     if (cart[i].id == productInfo[j].id) {
//       price = productInfo[j].price * cart[i].quantity;
//     }
//   }
// }
// console.log(price);
