package criteriapattern;

import java.util.List;

/**
 * interface for different criteria
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
