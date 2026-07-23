readfunc();

function readfunc() {
  let boardList = localStorage.getItem("boardList");
  if (boardList == null) boardList = [];
  else boardList = JSON.parse(boardList);

  let html = "";
  let tbody = document.querySelector("#readTbody");
  for (let i = 0; i < boardList.length; i++) {
    console.log(i);
    let object = boardList[i];
    console.log(object);
    html += `<tr><td>${object.no}</td> <td> <a href="view.html?no=${object.no}">
    ${object.title}</a></td></tr>`;
  }
  console.log(html);
  tbody.innerHTML = html;
}
