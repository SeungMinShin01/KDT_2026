package day09.종합예제.dto;

public class WaitingDto {
    private String pNumber; // 전화번호
    private int hCount; // 인원수

    // 기본생성자
    public WaitingDto() {
    }

    public WaitingDto(String pNumber, int hCount) {
        this.pNumber = pNumber;
        this.hCount = hCount;
    }

    // 삭제 생성자
    public WaitingDto(String pNumber) {
        this.pNumber = pNumber;
    }

    // setter / getter / toString
    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public int gethCount() {
        return hCount;
    }

    public void sethCount(int hCount) {
        this.hCount = hCount;
    }

    @Override
    public String toString() {
        return "WaitingDto [pNumber=" + pNumber + ", hCount=" + hCount + "]";
    }

}
