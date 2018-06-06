package criteriapattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        if (persons == null || persons.size() == 0) {
            return null;
        }
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
