package day08.pracitce;

public class practice10 {
    public static void main(String[] args) {

        // 1번
        Member m1 = new Member();
        m1.setId("admin");
        System.out.println(m1.getId());

        // 2번
        Score s1 = new Score();
        s1.setScore(85);
        s1.setScore(120);

        // 3번
        BankAccount bank1 = new BankAccount("123-456");
        System.out.println(bank1.getAccountNumber());

        // 4번
        CircleCalculator c1 = new CircleCalculator();
        System.out.println(c1.printCircleArea(5));

        // 5번
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();

        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();

        TicketMachine.printTotalTickets();

        // 6번
        System.out.printf("게임 제목: %s\n최대 HP : %d\n최대 레벨 : %d", GameConfig.GAME_TITLE, GameConfig.MAX_HP,
                GameConfig.MAX_LEVEL);
    }

}

class Member {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

class Score {

    private int score;

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else
            System.out.println("유효하지 않은 점수입니다.");
    }

}

class BankAccount {
    private String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}

class CircleCalculator {
    final double PI = 3.14159;

    public double printCircleArea(int 반지름) {
        double result = 반지름 * 반지름 * this.PI;
        return result;
    }
}

class TicketMachine {
    static int totalTickets = 0;

    public void issueTicket() {
        totalTickets += 1;
        System.out.println("티켓 1장을 발권했습니다.");
    }

    static void printTotalTickets() {
        System.out.println(totalTickets);
    }
}

class GameConfig {
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "MY RPG";

}