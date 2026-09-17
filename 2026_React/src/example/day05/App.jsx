import Lifecycle from "./Lifecycle";
import TopNavi from "./TopNav";
import { Route, Routes } from "react-router-dom";

export default function App4(props) {
  return (
    <>
      <TopNavi></TopNavi>
      <Routes>
        <Route path="/" element={<Lifecycle />} />
      </Routes>
    </>
  );
}
