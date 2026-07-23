// let memberList = [];
// lastNum = 0;
// 이걸 전역변수로 하면 F5시 사라진다

function signup() {
  let ID = document.querySelector(".signId").value;
  let PW = document.querySelector(".signPw").value;

  let memberList = JSON.parse(localStorage.getItem("memberList"));

  if (memberList == null) memberList = [];

  let no =
    memberList.length == 0 ? 1 : memberList[memberList.length - 1].no + 1;

  let object = { no: no, id: ID, pw: PW };
  memberList.push(object);

  localStorage.setItem("memberList", JSON.stringify(memberList));
  //   lastNum++;

  console.log(localStorage);
}

function login() {
  let ID = document.querySelector(".loginId").value;
  let PW = document.querySelector(".loginPw").value;
  let memberList = JSON.parse(localStorage.getItem("memberList"));
  let loginUser = "";
  for (let i = 0; i < memberList.length; i++) {
    if (memberList[i].id == ID) {
      loginUser = memberList[i];
      break;
    }
  }
  if (loginUser == "") {
    console.log("로그인 실패. 아이디 불일치");
  } else if (loginUser.pw != PW) {
    console.log("로그인 실패. 비밀번호 불일치");
  } else console.log("로그인 성공");
}
