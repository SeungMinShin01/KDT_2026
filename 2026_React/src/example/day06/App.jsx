import { Route, Routes } from "react-router-dom";
import TopNavi from "./TopNavi";

export default function App5(props) {
  return (
    <>
      <TopNavi></TopNavi>
      <Routes>
        <Route path="/" element={<useRefExam1 />} />
        <Route path="/use-ref1" element={<useRefExma1 />} />
        <Route path="/use-ref2" element={<useRefExma2 />} />
      </Routes>
    </>
  );
}
