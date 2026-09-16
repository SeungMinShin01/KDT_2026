import "../../index.css";
import log from "../../assets/logo9.jpg";

const myStyle = {
  color: "white",
  backgroundColor: "DodgerBlue",
  padding: "10px",
  fontFamily: "굴림",
};
const iWidth = { maxWidth: "300px" };
export default function Component1(props) {
  return (
    <>
      <h2> 리액트 스타일 </h2>
      <ol>
        <li style={{ color: "red" }}>프론트엔드</li>
        <ul>
          <li>
            <img src="/img/logo9.jpg" style={iWidth} />
          </li>
          <li>
            <img src={log} style={iWidth} />
          </li>
          <li>
            <img src="http://nakja.co.kr/images/reactks.png" />
          </li>
        </ul>
        <li className="backEnd"> 백엔드 </li>
        <ul>
          <li id="backEndSub">Java</li>
          <li class="warnings">Oracle</li>
          <li style={myStyle}>JSP</li>
        </ul>
      </ol>
    </>
  );
}
