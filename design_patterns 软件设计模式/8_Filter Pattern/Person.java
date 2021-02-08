public class Person{
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalSatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalSatus;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }
}