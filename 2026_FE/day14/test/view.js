viewfunc();

function viewfunc() {
  // url 가져오기
  const url = new URLSearchParams(location.search);
  // 쿼리스트링 가져오기
  let selectNo = url.get("no");
  //   console.log(selectNo);

  // 배열 가져오기
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  let title = document.querySelector("#viewTitle");
  let content = document.querySelector("#contentTitle");

  //배열 순회
  for (let i = 0; i < boardList.length; i++) {
    let object = boardList[i];
    if (object.no == selectNo) {
      title.innerHTML = object.title;
      content.innerHTML = object.content;
    }
  }
}

function deletefunc() {
  const url = new URLSearchParams(location.search);
  let selectNo = url.get("no");

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  for (let i = 0; i < boardList.length; i++) {
    let object = boardList[i];
    if (object.no == selectNo) {
      let confirm = prompt("비밀번호 입력");
      if (confirm == object.pwd) {
        boardList.splice(i, 1);
        localStorage.setItem("boardList", JSON.stringify(boardList));
        alert("삭제 성공");
        location.href = "list.html";
      } else alert("삭제 실패 비밀번호 불일치");
    }
  }
}

function updatefunc() {
  const url = new URLSearchParams(location.search);
  let selectNo = url.get("no");

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  for (let i = 0; i < boardList.length; i++) {
    let object = boardList[i];
    if (object.no == selectNo) {
      let confirm = prompt("비밀번호 입력");
      if (object.pwd == confirm) {
        location.href = `update.html?no=${object.no}`;
      } else {
        alert("수정 실패 비밀번호 불일치");
      }
    }
  }
}
