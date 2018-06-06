package criteriapattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        if (persons == null || persons.size() == 0) {
            return null;
        }
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
