import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    
    @Override
    public List<Person> meetCriteria(List<Person> persons){
        List <Person> femaPersons = new ArrayList<>();
        for (Person person: persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femaPersons.add(person);
            }
        }
        return femaPersons;
    }
}
