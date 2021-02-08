import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = RetrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }
    private static Student RetrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
