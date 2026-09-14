export default function FrontComp() {
  return (
    <>
      <li>프론트엔드</li>
      <ul>
        <li>HTML</li>
        <li>CSS3</li>
        <li>Javascript</li>
        <li>jQuery</li>
      </ul>
    </>
  );
}

const BackComp = ({ onMyEvent2 }) => {
  return (
    <>
      <li>
        <a
          href="/"
          onClick={(event) => {
            event.preventDefault();
            onMyEvent2("백엔드 클릭됨(자식전달)");
          }}
          백엔드
        ></a>
      </li>
      <ul>
        <li>Java</li>
        <li>Oracle</li>
        <li>JSP</li>
        <li>Spring Boot</li>
      </ul>
    </>
  );
};
export default BackComp;