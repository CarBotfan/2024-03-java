package com.green.day22;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//Member 테이블용 Data Access Object
public class MemberDao {
    private MyConnection conn;
    public MemberDao() {
        this.conn = new MyConnection();
    }
    public int insMember (MemberEntity entity) {
        String sql = String.format("INSERT INTO member" + " (mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date)" +
                " VALUES " +
                "('%s', '%s', '%d', '%s' , '%s', '%s', '%d', '%s') "
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate()
        );
        System.out.println(sql);
        Connection myConn = null;
        Statement stat = null;
        int result = 0;
        try {
            myConn = conn.getConn();
            stat = myConn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close(stat, myConn);
        }
        return result;
    }
    public List<MemberEntity> selMemberList() {
        List<MemberEntity> list = new ArrayList();
        String sql = "SELECT mem_id, mem_name, debut_date FROM member ORDER BY debut_date DESC";
        System.out.println(sql);

        try (Connection myConn = conn.getConn()){
            Statement stat = myConn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()) {
                MemberEntity member = new MemberEntity();
                String memId = rs.getString("mem_id");
                String memName = rs.getString("mem_name");
                String debutDate = rs.getString("debut_date");
                member.setMemId(memId);
                member.setMemName(memName);
                member.setDebutDate(debutDate);
                list.add(member);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public int updMember(MemberEntity entity) {
        String mid = "";
        if(entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s' ", entity.getMemName());
        }
        if(entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d ", entity.getMemNumber());
        }
        if(entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s' ", entity.getAddr());
        }
        if(entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s' ", entity.getPhone1());
        }
        if(entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s' ", entity.getPhone2());
        }
        if(entity.getHeight() > 0) {
            mid += String.format(", height = %d ", entity.getHeight());
        }
        mid = mid.substring(1);
        String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());
        System.out.println(sql);
        Connection myConn = null;
        Statement stat = null;
        int result = 0;
        try {
            myConn = conn.getConn();
            stat = myConn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close(stat, myConn);
        }
        return result;
    }

    public int delMember(MemberEntity entity) {
        String sql = String.format("DELETE FROM member WHERE mem_id = '%s'", entity.getMemId());
        System.out.println(sql);
        Connection myConn = null;
        Statement stat = null;
        int result = 0;
        try {
            myConn = conn.getConn();
            stat = myConn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close(stat, myConn);
        }
        return result;
    }

}
class SubStringTest {
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.substring(3));
    }
}
class memberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(member);
        System.out.println("affectedRow: " + affectedRow);
    }
}
class memberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDao memberdao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");

        int affectedRow = memberdao.updMember(member);
        System.out.println("affectedRow: " + affectedRow);
    }
}

class delMemberTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow = memberDao.delMember(member);
        System.out.println("affectedRow: " + affectedRow);
    }
}

class selMemberTest {
    public static void main(String[] args) {
        MemberDao memberdao = new MemberDao();
        System.out.println(memberdao.selMemberList());
    }
}