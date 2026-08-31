package day02.Model.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day02.Model.Dto.WaitingDto;

public class WaitingDao extends BaseDao {
    private WaitingDao() {
    }

    private final static WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    // [1] 대기명단 등록
    public boolean InsertList(WaitingDto waitingDto) {
        try {
            String sql = "INSERT INTO WAITING( PHONE_NUMBER , HEAD_COUNT ) VALUES( ? , ? );";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, waitingDto.getPNumber());
            ps.setInt(2, waitingDto.getHCount());
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    // [2] 대기명단 전체 조회
    public ArrayList<WaitingDto> findAll() {
        ArrayList<WaitingDto> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM WAITING";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                WaitingDto waitingDto = new WaitingDto();
                waitingDto.setWno(rs.getInt("WNO"));
                waitingDto.setPNumber(rs.getString("PHONE_NUMBER"));
                waitingDto.setHCount(rs.getInt("HEAD_COUNT"));
                list.add(waitingDto);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // [3] 대기명단 개별 수정
    public boolean updateList(WaitingDto waitingDto) {
        try {
            String sql = "UPDATE WAITING SET HEAD_COUNT = ? WHERE PHONE_NUMBER = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, waitingDto.getHCount());
            ps.setString(2, waitingDto.getPNumber());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    // [4] 개별 삭제
    public boolean deleteList(String pNumber) {
        try {
            String sql = "DELETE FROM WAITING WHERE PHONE_NUMBER = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pNumber);
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}
