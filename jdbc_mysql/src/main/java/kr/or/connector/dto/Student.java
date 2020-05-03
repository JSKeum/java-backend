package kr.or.connector.dto;

public class Student {

    private String name;
    private String major;
    private Integer student_id;
    private Integer year;

    public Student() { }

    public Student(String name, String major, Integer student_id, Integer year) {
        this.name = name;
        this.major = major;
        this.student_id = student_id;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", student_id=" + student_id +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
