import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

export default function Write(props) {
  const nevigate = useNavigate(); // [1] 화면 이동하기 위한 훅
  // html -> <a> , REACT -> <Link>
  const 등록함수 = async (event) => {
    event.preventDefault();
    console.log(event.target);
    const obj = {
      name: event.target.writer.value,
      subject: event.target.title.value,
      content: event.target.contents.value,
    };
    const response = await axios.post("http://localhost:8080/api", obj);
    const data = response.data;
    if (data == true) nevigate("/list");
  };

  return (
    <>
      <div>
        <Link to="/list">목록</Link>
        <form onSubmit={등록함수}>
          작성자 : <input type="text" name="writer" />
          제목 : <input type="text" name="title" />
          내용 : <textarea name="contents" row="3"></textarea> <br />
          <input type="submit" value="작성" />
        </form>
      </div>
    </>
  );
}
