getBoard();

function getBoard() {
  const url = new URLSearchParams(location.search);
  // const url = new URLsearchparams(location.search)
  //   console.log("함수실행");
  const selectNo = url.get("no");
  //   console.log(selectNo);
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else {
    boardList = JSON.parse(boardList);
  }
  for (let i = 0; i < boardList.length; i++) {
    const object = boardList[i];
    if (object.no == selectNo) {
      document.querySelector("#title").innerHTML = object.title;
      document.querySelector("#content").innerHTML = object.content;
      return;
    }
  }
}

function boardDelete() {
  const url = new URLSearchParams(location.search);
  console.log("삭제 함수 실행");
  const selectNo = url.get("no");

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);
  console.log(boardList);
  for (let i = 0; i < boardList.length; i++) {
    const object = boardList[i];
    console.log(object);
    console.log(selectNo);
    if (object.no == selectNo) {
      const confirm = prompt("비밀번호 입력");
      if (confirm == object.pwd) {
        boardList.splice(i, 1);
        localStorage.setItem("boardList", JSON.stringify(boardList));
        alert("삭제 성공");
        location.href = "list.html";
      } else {
        console.log(boardList.pwd);
        alert("수정불가 비밀번호 불일치");
      }
    }
  }
}

// function boardUpdateView() {
//   const url = new URLSearchParams(location.search);

//   const selectNo = url.get("no");

//   let boardList = localStorage.getItem("boardList");
//   if (boardList == null) boardList = [];
//   else boardList = JSON.parse(boardList);

//   for (let i = 0; i < boardList.length; i++) {
//     const object = boardList[i];
//     if (object.no == selectNo) {
//       const confirm = prompt("비밀번호 입력");
//        if(object.pwd = confirm) {
//         lo
//        }
//     }

//   }
// }
