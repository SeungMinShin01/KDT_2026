package day06.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner scan = new Scanner(System.in);

        for (;;) {
            System.out.println("===커뮤니니===");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println("======");
            System.out.print("선택>");
            int no = scan.nextInt();

            if (no == 1) {
                scan.nextLine();
                System.out.println("내용 입력:");
                String content = scan.nextLine();
                System.out.println("작성자 입력:");
                String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = false;

                for (int i = 0; i < posts.length; i++) {
                    if (posts[i] == null) {
                        posts[i] = post;
                        result = true;
                        break;
                    }
                }

                if (result) {
                    System.out.println("성공");
                } else
                    System.out.println("실패");

            } else if (no == 2) {
                for (Post post : posts) {
                    if (posts != null) {
                        System.out.printf("작성자: %s , 내용 : %s", post.writer, post.content);
                    }
                }
            }
        }

    }
}

class Post {
    String content;
    String writer;

    public Post() {

    }

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}