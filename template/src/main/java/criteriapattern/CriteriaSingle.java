package criteriapattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        if (persons == null || persons.size() == 0) {
            return null;
        }
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
