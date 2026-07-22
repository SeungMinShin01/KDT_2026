/*
    [  인사 관리 대시보드 ] * 제출
1. 목표
부서, 사원, 그리고 휴가 신청 정보를 하나의 웹 페이지에서 통합적으로 관리하는 대시보드를 제작합니다.
사용자는 부서 등록/삭제/수정, 사원 등록/삭제/수정, 휴가 신청/취소 기능을 직관적으로 사용할 수 있어야 합니다.
2. 화면 구성
페이지는 '부서 관리(왼쪽)', '사원 관리(가운데)', '휴가 관리(오른쪽)' 라는 3개의 명확한 컬럼으로 구성되어야 합니다.
부서 관리 영역:
부서 등록:  새로운 부서의 이름을 텍스트로 입력할 수 있는 입력창과 "추가" 버튼이 있어야 합니다.
부서 목록: 
등록된 모든 부서 정보를 보여주는 표(테이블)가 있어야 합니다.
표는 "부서명"과 "관리" 열로 구성됩니다.
각 부서 항목마다 해당 부서를 수정하고 삭제할 수 있는 버튼이 제공되어야 합니다.
사원 관리 영역:
사원 등록:
사원의 이름과 직급을 입력하는 텍스트 필드가 있어야 합니다.
등록된 부서 목록에서 소속될 부서를 선택할 수 있는 드롭다운 메뉴가 있어야 합니다.
사원의 사진을 등록할 수 있는 파일 선택 버튼이 있어야 합니다.
    사원 목록:
등록된 모든 사원 정보를 보여주는 표(테이블)가 있어야 합니다.
표는 "사진", "이름", "부서", "직급", "관리" 순서의 열로 구성됩니다.
각 사원 항목마다 해당 사원의 이름과 직급을 수정하고, 사원 정보를 삭제할 수 있는 버튼이 제공되어야 합니다.
  휴가 관리 영역:
휴가 신청:
등록된 사원 목록에서 휴가를 신청할 사원을 선택하는 드롭다운 메뉴가 있어야 합니다.
휴가 시작일과 종료일을 선택할 수 있는 날짜 입력 필드가 있어야 합니다.
휴가 사유를 텍스트로 간단히 기입할 수 있는 입력창이 있어야 합니다.
휴가 신청 전체 목록:
제출된 모든 휴가 신청 내역을 보여주는 목록이 있어야 합니다.
각 항목에는 신청한 사원의 이름, 휴가 기간, 사유가 표시되어야 합니다.
각 휴가 신청 항목마다 해당 신청을 취소할 수 있는 "신청취소" 버튼이 제공되어야 합니다.
3. 핵심 기능
  초기 데이터 표시:
모든 데이터(부서, 사원, 휴가)는 웹 페이지가 실행되는 동안에만 유지되는 전역 배열을 통해 관리됩니다. 페이지를 새로고침하면 데이터는 초기 샘플 상태로 돌아갑니다.
사용자가 처음 페이지에 접속했을 때, 시스템 사용법을 쉽게 파악할 수 있도록 부서, 사원, 휴가 신청에 대한 예시 데이터가 기본적으로 화면에 표시되어 있어야 합니다.
  부서 관리 기능:
등록: "추가" 버튼 클릭 시, 입력된 부서가 부서 목록과 사원 등록의 부서 선택 메뉴에 즉시 반영되어야 합니다. 이미 존재하는 부서명은 등록되지 않아야 합니다.
수정: "수정" 버튼 클릭 시, prompt 대화상자가 나타나 새로운 부서명을 입력받고, 입력 완료 시 목록에 즉시 반영되어야 합니다.
삭제: "삭제" 버튼 클릭 시, 해당 부서가 목록에서 제거되어야 합니다. 단, 해당 부서에 소속된 사원이 한 명이라도 있을 경우, 삭제할 수 없다는 경고 메시지를 표시해야 합니다.
  사원 관리 기능:
등록: 사원 정보를 입력하고 "등록" 버튼 클릭 시, 사원 목록과 휴가 신청의 사원 선택 메뉴에 즉시 추가되어야 합니다. 사진을 첨부하면 해당 사진이, 첨부하지 않으면 기본 이미지가 표시되어야 합니다.
수정: "수정" 버튼 클릭 시, prompt 대화상자를 통해 새로운 이름과 직책을 입력받아 해당 사원의 정보를 수정하고 목록을 즉시 갱신해야 합니다.
삭제: "삭제" 버튼 클릭 시, 해당 사원이 목록에서 제거되며, 관련된 모든 휴가 신청 기록도 함께 삭제되어야 합니다.
  휴가 관리 기능:
신청: 휴가 정보를 입력하고 "신청" 버튼 클릭 시, 휴가 신청 목록에 즉시 추가되어야 합니다.
취소: "신청취소" 버튼 클릭 시, 해당 휴가 신청 내역이 목록에서 제거되어야 합니다.
*/

let departmentList = [
  { dcode: 1, dname: "개발팀" },
  { dcode: 2, dname: "디자인팀" },
  { dcode: 3, dname: "기획팀" },
];

let employeeList = [
  {
    ecode: 1,
    dcode: 1,
    ename: "김민준12",
    eposition: "선임 개발자",
    eimg: "https://placehold.co/100x100",
  },
  {
    ecode: 2,
    dcode: 2,
    ename: "이서연12",
    eposition: "수석 디자이너",
    eimg: "https://placehold.co/100x100",
  },
  {
    ecode: 3,
    dcode: 3,
    ename: "박도윤",
    eposition: "팀장",
    eimg: "https://placehold.co/100x100",
  },
];
let lastEmployeeCode = employeeList.length; // 최근 발급된 마지막 사원 코드

let vacationList = [
  {
    vcode: 1,
    ecode: 1,
    "휴가 시작일": "2025-08-04",
    "휴가 종료일": "2025-08-04",
    "휴가 사유": "병원 진료",
  },
  {
    vcode: 2,
    ecode: 2,
    "휴가 시작일": "2025-07-21",
    "휴가 종료일": "2025-07-25",
    "휴가 사유": "여름 휴가",
  },
];

//조회 함수
employeePrint();
function employeePrint() {
  console.log("함수호출 시작");
  // JS가 처음 열릴떄, 등록, 수정, 삭제 시 호출
  let tbody = document.querySelector(".employee-table tbody");
  let html = "";

  for (let i = 0; i < employeeList.length; i++) {
    // 사원 배열 순회하면서 정보 추출
    let employee = employeeList[i];
    let dname = "";
    for (let j = 0; j < departmentList.length; j++) {
      //부서 배열을 순회하면서 같은 부서코드 인덱스 찾기
      if (employee.dcode == departmentList[j].dcode) {
        dname = departmentList[j].dname; //같은 인덱스의 부서 배열에 있는 부서명 가져오기
        break; //찾았으면 종료
      }
    }
    html += `<tr>
                <td>
                  <img src=${employee.eimg} />
                </td>
                <td>${employee.ename}</td>
                <td>${dname}</td>
                <td>${employee.eposition}</td>
                <td class="action-links align-right">
                  <a href="#" class="link-edit" onclick="employeeUpdate(${employee.ecode})">수정</a>
                  <a href="#" class="link-delete" onclick="employeeDelete(${employee.ecode})">삭제</a>
                </td>
              </tr>`;
  }
  tbody.innerHTML = html;
}

//삭제 함수

function employeeDelete(ecode) {
  for (let i = 0; i < employeeList.length; i++) {
    if (employeeList[i].ecode == ecode) {
      employeeList.splice(i, 1);

      alert("사원 삭제 성공");
      employeePrint();
      return;
    }
  }
}

//수정 함수

function employeeUpdate(ecode) {
  for (let i = 0; i < employeeList.length; i++) {
    let change = 0;
    if (employeeList[i].ecode == ecode) {
      let newname = prompt("수정할 이름 입력");
      // let newdepartment = prompt("수정할 부서 입력");
      let newposition = prompt("수정할 직급 입력");
      // let changeDepartment = [];
      // for (let j = 0; j < departmentList.length; j++) {
      //   changeDepartment = Object.values(departmentList[j]);
      // }
      // console.log(changeDepartment);
      // if (!employeeList[i].eposition.includes(newposition)) {
      //   alert("존재하지 않는 직급입니다.");
      //   return;
      // }
      employeeList[i].ename = newname;
      // employeeList[i].dcode = newdepartment;
      employeeList[i].eposition = newposition;

      employeePrint();
      return;
    }
  }
}

//등록 함수

function employeeAdd() {
  let name = document.querySelector(".e-name").value;
  let position = document.querySelector(".e-position").value;
  let department = document.querySelector(".e-department").value;
  let image = document.querySelector(".e-image").files[0];

  if (department == "disabled") {
    alert("카테고리를 선택해주세요.");
    return;
  }

  let object = {
    ecode: lastEmployeeCode + 1,
    ename: name,
    dcode: department,
    eposition: position,
    eimg:
      image == undefined
        ? "https://placehold.co/100"
        : URL.createObjectURL(image),
  };
  employeeList.push(object);
  lastEmployeeCode += 1;
  alert("등록성공");
  employeePrint();
}
