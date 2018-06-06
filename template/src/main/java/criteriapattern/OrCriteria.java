package criteriapattern;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> meetFirst = criteria.meetCriteria(persons);
        List<Person> meetSecond = otherCriteria.meetCriteria(persons);

        if (meetFirst == null) {
            return meetSecond;
        }
        if (meetSecond == null) {
            return meetFirst;
        }
        for (Person person : meetSecond) {
            if (!meetFirst.contains(person)) {
                meetFirst.add(person);
            }
        }
        return meetFirst;
    }
}
