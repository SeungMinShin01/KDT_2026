// *
console.log("INDEX2.JS 열림");

// [1] 전체조회
async function waitingFindAll() {
  console.log("waitingFindAll 열림");
  let tbody = document.querySelector(".boardList");
  let html = "";
  const response = await axios.get("http://127.0.0.1:8080/waiting/findall");
  const waitingList = response.data;
  for (let index = 0; index <= waitingList.length - 1; index++) {
    const waiting = waitingList[index];
    html += `<tr>
                <td> ${waiting.wno} </td> <td> ${waiting.pNumber} </td> 
                <td> ${waiting.hCount} </td> 
                <td> <button onclick="waitingUpdate()">수정</button> <button onclick="waitingDelete()">삭제</button> </td> 
            </tr>`;
  }
  tbody.innerHTML = html;
}
waitingFindAll();

// [2] 등록
async function waitingInsert() {
  const pNumber = document.querySelector(".pNumber").value;
  const hCount = document.querySelector(".hCount").value;
  const response = await axios.post(
    `/waiting/insert?pNumber=${pNumber}&hCount=${hCount}`,
  );

  if (response.data == true) {
    alert("저장 성공");
    waitingFindAll();
  } else {
    alert("저장 실패");
  }
}

// [3] 수정
async function waitingUpdate() {
  const pNumber = prompt("전화번호 입력: ");
  const hCount = prompt("수정할 인원수:");

  const response = await axios.put(
    `/waiting/update?pNumber=${pNumber}&hCount=${hCount}`,
  );

  if (response.data == true) {
    alert("수정 성공");
    waitingFindAll();
  } else {
    alert("수정 실패");
  }
}

// [4] 삭제
async function waitingDelete() {
  const pNumber = prompt("전화번호 입력: ");
  const response = await axios.delete(`/waiting/delete?pNumber=${pNumber}`);
  if (response.data == true) {
    alert("삭제 성공");
    waitingFindAll();
  } else {
    alert("삭제 실패");
  }
}
