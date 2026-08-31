package day02.Model.Dto;

public class WaitingDto {
    private String pNumber;
    private int hCount;
    private int wno;

    public WaitingDto() {
    }

    public WaitingDto(int wno, String pNumber, int hcount) {
        this.wno = wno;
        this.pNumber = pNumber;
        this.hCount = hcount;
    }

    public String getPNumber() {
        return pNumber;
    }

    public void setPNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public int getHCount() {
        return hCount;
    }

    public void setHCount(int hCount) {
        this.hCount = hCount;
    }

    public int getWno() {
        return wno;
    }

    public void setWno(int wno) {
        this.wno = wno;
    }

    @Override
    public String toString() {
        return "WaitingDto [pNumber=" + pNumber + ", hCount=" + hCount + ", wno=" + wno + "]";
    }

}
