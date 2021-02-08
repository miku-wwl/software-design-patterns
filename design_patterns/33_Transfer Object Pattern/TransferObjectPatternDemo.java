public class TransferObjectPatternDemo {
    public static void main(String[] args){
        StudentBO studentBusinessObecjt = new StudentBO();

        for (StudentVO student : studentBusinessObecjt.getAllStudents()){
            System.out.println("Student: [RollNo : " + student.getRollNo()+", Name : "+ student.getName()+" ]");

        }

        StudentVO student =studentBusinessObecjt.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObecjt.updateStudent(student);

        studentBusinessObecjt.getStudent(0);
        System.out.println("Student: [RollNo : "+student.getRollNo()+ ", Name : "+ student.getName()+" ]");
    }
}
