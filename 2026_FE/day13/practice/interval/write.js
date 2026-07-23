function boardWrite() {
  const title = document.querySelector("#titleInput").value;
  const content = document.querySelector("#contentinput").value;
  const pwd = document.querySelector("#pwdInput").value;

  const object = {
    title,
    content,
    pwd,
  };

  let boardList = localStorage.getItem("boardList");

  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  console.log(boardList);
  object.no =
    boardList.length == 0 ? 1 : boardList[boardList.length - 1].no + 1;
  boardList.push(object);

  localStorage.setItem("boardList", JSON.stringify(boardList));
  console.log(boardList);
  alert("등록성공");
  location.href = "list.html";
}
