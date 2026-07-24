readfunc();
function readfunc() {
  //배열 가져오기
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  //html
  let html = "";
  //tbody 객체
  let tbody = document.querySelector("#tableTbody");

  //배열넣기
  for (let i = 0; i < boardList.length; i++) {
    const object = boardList[i];
    html += `<tr><td>${object.no}</td><td><a href="view.html?no=${object.no}">
    ${object.title}</a></td></tr>`;
  }
  console.log(html);
  tbody.innerHTML = html;
}
