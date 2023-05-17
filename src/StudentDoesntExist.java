public class StudentDoesntExist extends Exception{
    String message;

    public StudentDoesntExist(String message)
    {
        this.message=message;
    }

    @Override
    public String toString() {
        return "Student Doesnt Exist"+ message;
    }
}
