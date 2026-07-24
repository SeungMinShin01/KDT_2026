// wirte();
function writefunc() {
  // html value값 가져오기
  const title = document.querySelector("#titleInput").value;
  const content = document.querySelector("#contentInput").value;
  const pwd = document.querySelector("#pwdInput").value;
  //가져온 value값으로 객체 만들기
  const object = { title, content, pwd };
  //   console.log(object);
  //localStorage에서 배열 가져오기
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);
  //   console.log(boardList);
  //no 속성 추가
  // 현문제 : 삼항연산자에서 계속 길이가 0이라 뜬다. 해결완 변수 오타
  object.no =
    boardList.length == 0 ? 1 : boardList[boardList.length - 1].no + 1;
  boardList.push(object);
  //   console.log(`배열길이 : ${boardList.length}213`);
  //   console.log(`마지막 인덱스 : ${boardList[boardList.length - 1]}213`);
  //   console.log(`오브젝트.no: ${object.no}`);
  // 로컬스토리지에 저장
  localStorage.setItem("boardList", JSON.stringify(boardList));
  alert("등록 완료");
  location.href = "list.html";
}
