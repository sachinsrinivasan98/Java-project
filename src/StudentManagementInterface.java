public interface StudentManagementInterface {
    public boolean addStudent(Student s);
    public boolean deleteStudent(long rollno)throws StudentDoesntExist;
    public void listStudents();
    public boolean updateStudent(long rollno,Student s)throws StudentDoesntExist;
    public Student findTopper();

}
