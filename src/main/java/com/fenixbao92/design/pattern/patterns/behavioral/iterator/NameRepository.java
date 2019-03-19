package com.fenixbao92.design.pattern.patterns.behavioral.iterator;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class NameRepository implements Iterable{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {

        public int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
