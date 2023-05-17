import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentManagementSystem implements StudentManagementInterface {
    ArrayList<Student> studarr = new ArrayList<>(10);
    private int i = 1;

    public boolean addStudent(Student s) {
        if (i <= 10) {
            studarr.add(s);
            i++;
            return true;
        } else
            return false;


    }

    public boolean deleteStudent(long rollno) throws StudentDoesntExist {
        for (Student s : studarr)
            if (s.getRollNo() == rollno) {
                studarr.remove(s);
                return true;
            }
        throw new StudentDoesntExist("Roll no doesnt exist");


    }

    public void listStudents() {
        studarr.stream().forEach(System.out::println);

    }

    public boolean updateStudent(long rollno, Student s) throws StudentDoesntExist {
        for (int j = 0; j < studarr.size(); i++)
            if (studarr.get(j).getRollNo() == rollno) {
                studarr.set(j, s);
                return true;
            }
        throw new StudentDoesntExist("Roll no doesnt exist");



    }

    public Student findTopper() {
        Double max = 0.0;
        Student s1 = studarr.get(0);
        for (Student l : studarr) {

            Double av = Arrays.stream(l.getMarks()).asDoubleStream().average().getAsDouble();
            if (av > max) {
                max = av;
                s1 = l;


            }
        }
            return s1;


    }
}



