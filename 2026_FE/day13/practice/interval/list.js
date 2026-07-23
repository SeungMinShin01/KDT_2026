boardPrint();

function boardPrint() {
  const boardTbody = document.querySelector("#boardTbody");

  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  let html = "";
  for (let i = 0; i < boardList.length; i++) {
    const object = boardList[i];
    html += `<tr><td>${object.no}</td><td><a href="view.html?no=${object.no}">
    ${object.title}</a></td></tr>`;
  }
  boardTbody.innerHTML = html;
}

<a href="view.html?no=${object.no}"></a>;

//
