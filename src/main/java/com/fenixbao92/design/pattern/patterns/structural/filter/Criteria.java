package com.fenixbao92.design.pattern.patterns.structural.filter;
import java.util.List;
/**
 * Create by fenixbao92 on 2019/3/19.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
