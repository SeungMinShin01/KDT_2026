updatereadfunc();

function updatereadfunc() {
  // url 가져와서 no 뽑기
  const url = new URLSearchParams(location.search);
  let selectNO = url.get("no");
  //   console.log(selectNO);

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);
  //   console.log(boardList);
  //   console.log(boardList[2].no);

  let newTitle = document.querySelector("#updateTitle");
  let content = document.querySelector("#updateContent");

  for (let i = 0; i < boardList.length; i++) {
    let object = boardList[i];
    if (object.no == selectNO) {
      //글을 찾았으면 기존 정보 대입
      //   console.log(boardList[i]);
      //   console.log(object.title);
      //   console.log(object.content);
      //   console.log(title); //제목이 안나옴

      //   console.log(document.querySelector("#updateTitle").value);
      newTitle.value = object.title;
      content.value = object.content;
      //   console.log(document.querySelector("#updateContent").value);
    }
  }
}

function updatefunc() {
  const url = new URLSearchParams(location.search);
  let selectNO = url.get("no");

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  let title = document.querySelector("#updateTitle");
  let content = document.querySelector("#updateContent");
  let pwd = document.querySelector("#newPwd");

  for (let i = 0; i < boardList.length; i++) {
    let object = boardList[i];
    if (object.no == selectNO) {
      if (title.value != "") {
        boardList[i].title = title.value;
        boardList[i].content = content.value;
        boardList[i].pwd = pwd.value;

        localStorage.setItem("boardList", JSON.stringify(boardList));
        alert("수정 성공");
        location.href = "list.html";
      } else alert("비밀번호 미입력");
    }
  }
}
