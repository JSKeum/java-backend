package kr.or.connector.jdbcexam;

import kr.or.connector.dao.StudentDao;
import kr.or.connector.dto.Student;

public class JDBCExam1 {

    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        Student student = dao.getStudent("jinsup");

        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("student : " + student);
        }
    }
}
