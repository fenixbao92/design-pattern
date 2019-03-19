package com.fenixbao92.design.pattern.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
