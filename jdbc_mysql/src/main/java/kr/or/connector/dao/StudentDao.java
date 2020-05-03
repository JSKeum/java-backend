package kr.or.connector.dao;

import kr.or.connector.dto.Student;

import java.sql.*;

public class StudentDao {

    private String dbUrl = "";
    private String dbUser = "";
    private String dbPassward ="";


    public Student getStudent(String studentName) {

        Student student = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPassward);

            String sql = "SELECT student_id, year, name, major From student WHERE name =?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, studentName);
            result = ps.executeQuery();

            if(result.next()) {
                Integer studentId = result.getInt("student_id");
                Integer year = result.getInt("year");
                String name = result.getString("name");
                String major = result.getString("major");

                student = new Student(name, major, studentId, year);
            }

        } catch (Exception e) {
            System.out.println("error: " + e);
            e.printStackTrace();
        } finally {
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;
    }
}

