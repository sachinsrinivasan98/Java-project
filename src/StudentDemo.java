import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String ...arg) {
        long rollno=0;
        int n=0;
        String subject=null;



        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms=new StudentManagementSystem();
        do {
            System.out.println("Add Student ------Enter 1");
            System.out.println("Delete Student ------Enter 2");
            System.out.println("List Student---------Enter 3");
            System.out.println("Update Student-------Enter 4");
            System.out.println("Find Topper---------Enter 5");
            System.out.println("For Exit -----------Enter 6");
            System.out.println("Enter Your Choice");
            n = scanner.nextInt();
            if (n == 1) {
                int marks[] = new int[6];
                System.out.println("Enter Your Name");
                String name = scanner.next();
                System.out.println("Enter Your Address");
                String address = scanner.next();
                System.out.println("Enter Subject");
                 subject=scanner.next();
                for (int i = 0; i < marks.length; i++) {
                    System.out.println("Enter " + (i + 1)+"   Mark ");
                    marks[i] = scanner.nextInt();
                }
                if (sms.addStudent(new Student(rollno, name, address,subject, marks))) {
                    System.out.println("New Student Added");
                    System.out.println("Roll no  :" + (rollno++));

                } else
                    System.out.println("Student Admission closed");


            } else if (n==2) {
                System.out.println("Enter Roll No");
                rollno= scanner.nextLong();
                try {
                    if (sms.deleteStudent(rollno))
                        System.out.println("Successfully Deleted");
                }catch(StudentDoesntExist sde){
                    System.out.println(sde);
                }

            } else if (n==3) {
                sms.listStudents();

            } else if (n==4) {
                int marks[] = new int[6];
                System.out.println("Enter roll no");
                long rn=scanner.nextLong();
                System.out.println("Enter Your Name");
                String name = scanner.next();
                System.out.println("Enter Your Address");
                    String address = scanner.next();
                System.out.println("Enter Subject");
                subject=scanner.next();

                    for (int i = 0; i < marks.length; i++) {
                    System.out.println("Enter " + (i + 1)+"   Mark ");
                    marks[i] = scanner.nextInt();}
                try{
                    if(sms.updateStudent(rn,new Student(rn,name,address,subject,marks)))
                        System.out.println("Successfully Updated ");
                }catch(StudentDoesntExist sde){
                    System.out.println(sde);
                }

                } else if (n==5)
                System.out.println(sms.findTopper().getName());
                else
                    System.out.println("Invalid Input");
                

        }
        while (n!=6);


    }
}
