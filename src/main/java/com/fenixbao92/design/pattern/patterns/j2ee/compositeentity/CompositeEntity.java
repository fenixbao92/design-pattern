package com.fenixbao92.design.pattern.patterns.j2ee.compositeentity;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
