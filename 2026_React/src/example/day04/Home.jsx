import { Outlet } from "react-router-dom";
import TopNavi from "./TopNavi";

export default function Home(props) {
  return (
    <>
      <TopNavi />
      <h2> 메인페이지/본문 </h2>
      {/* 자식 Route 가 렌더링되는 자리 */}
      <Outlet />
    </>
  );
}
