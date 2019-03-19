package com.fenixbao92.design.pattern.patterns.behavioral.iterator.main;

import com.fenixbao92.design.pattern.patterns.behavioral.iterator.Iterator;
import com.fenixbao92.design.pattern.patterns.behavioral.iterator.NameRepository;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }

}
