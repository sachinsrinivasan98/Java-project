import java.util.Arrays;

public class Student {
    private long rollNo;
    private String name;
    private String address;
    private String subject;
    private int marks[] = new int[6];

    public Student(long rollNo, String name, String address,String subject, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject=subject;
        this.address = address;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}


