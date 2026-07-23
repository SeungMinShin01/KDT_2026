function writefunc() {
  const title = document.querySelector("#titleInput").value;
  const content = document.querySelector("#contentInput").value;
  const pwd = document.querySelector("#pwdInput").value;

  const object = { title, content, pwd };

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  // 보드리스트를 로컬스토리지에 가져옴 [{title : 111, contetn ... , pwd} ]
  // no 속성을 추가해야됨  배열의 길이가 0이면 1 0이상이면 마지막 인덱스.no 의 +1
  // no 속성 추가 위치가 object면 ->  object = { title, content, pwd, no }
  object.no =
    boardList.length == 0 ? 1 : boardList[boardList.length - 1].no + 1;

  boardList.push(object);
  console.log(boardList);
  // console.log(object.no);
  // console.log(boardList.no);
  localStorage.setItem("boardList", JSON.stringify(boardList));
  alert("등록 완료");
  location.href = "list.html";
}
