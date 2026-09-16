import { useState } from "react";
import "./index.css";

function WriteForm(props) {
  return (
    <>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          let name = e.target.name.value;
          let number = e.target.number.value;
          let age = e.target.age.value;
          props.writeAction(name, number, age);
        }}
      >
        <input
          className="inputBox"
          type="text"
          name="name"
          placeholder="성명"
        />
        <input
          className="inputBox"
          type="text"
          name="number"
          placeholder="연락처 (예: 010-1234-5678)"
        />
        <input className="inputBox" type="text" name="age" placeholder="나이" />
        <input className="submitBtn" type="submit" name="submit" value="등록" />
      </form>
    </>
  );
}

export default function Component3(props) {
  const [array, setArray] = useState([]);

  const 삭제함수 = (index) => {
    array.splice(index, 1);
    setArray([...array]);
  };
  return (
    <>
      <h2>전화번호부</h2>
      <WriteForm
        writeAction={(name, number, age) => {
          if (name !== "" && number !== "" && age !== "") {
            setArray([...array, { name, number, age }]);
          } else {
            alert("빈값");
          }
        }}
      ></WriteForm>
      {array.map((m, index) => {
        return (
          <>
            <div>
              <span>성명 : {m.name}</span>
              <span>연락처 : {m.number}</span>
              <span>나이 : {m.age}</span>
              <button
                onClick={() => {
                  삭제함수(index);
                }}
              >
                삭제
              </button>
            </div>
          </>
        );
      })}
      <div>총 인원 : {array.length}</div>
    </>
  );
}
