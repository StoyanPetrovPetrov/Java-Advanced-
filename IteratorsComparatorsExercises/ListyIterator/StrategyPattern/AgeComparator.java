package StrategyPattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
    }
}
