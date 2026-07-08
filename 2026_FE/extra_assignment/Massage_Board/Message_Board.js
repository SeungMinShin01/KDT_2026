/*
    게시글은 10개까지 생성 가능
    id : 게시글의 고유 번호 
    -> 게시글 삭제할때 ID를 기준으로 Title, Description 삭제

    index : 게시글 정렬 기준 
    -> index가 높을수록 최신글 
    -> 최신글이 Title1부터 시작

    currentindex 
    -> 가장 최근에 만들어진 index
    -> index = currentIndex +1 을 통해 index 기준잡기

    정렬 
    - 버블정렬 9회전
*/

let currentIndex = 0;

let sortcycle;

let index1;
let index2;
let index3;
let index4;
let index5;
let index6;
let index7;
let index8;
let index9;
let index10;

let title1;
let title2;
let title3;
let title4;
let title5;
let title6;
let title7;
let title8;
let title9;
let title10;

let Description1;
let Description2;
let Description3;
let Description4;
let Description5;
let Description6;
let Description7;
let Description8;
let Description9;
let Description10;

//게시글 생성

function saved() {}

//게시글 삭제

function deleted() {}

//게시글 정렬

function Sorted() {}

function Sortedctycle() {
  for (i = 1; i < 10; i++) {}
}
