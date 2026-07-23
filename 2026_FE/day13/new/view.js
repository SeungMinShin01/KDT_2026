viewfunc();

function viewfunc() {
  const url = new URLSearchParams(location.search);

  let selectNo = url.get("no");
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  let titleview = document.querySelector(".titleview");
  let content = document.querySelector(".content2");

  console.log(selectNo);
  for (let i = 0; i < boardList.length; i++) {
    const object = boardList[i];
    if (selectNo == object.no) {
      console.log("if문 진입");
      console.log(object.content);
      console.log(content);
      titleview.innerHTML = object.title;
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
    const object = boardList[i];
    if (object.no == selectNo) {
      let confirm = prompt("비밀번호 입력");
      if (confirm == object.pwd) {
        boardList.splice(i, 1);
        localStorage.setItem("boardList", JSON.stringify(boardList));
        alert("삭제 완료");

        location.href = "list.html";
      } else {
        alert("삭제실패: 비밀번호 불일치");
        return;
      }
    }
  }
}
