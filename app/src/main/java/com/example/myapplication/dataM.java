package com.example.myapplication;

public class dataM {

    String names;
    String amounts;
    String exps;
    String desc;
    String id;

    public void dataM(){

    }

    public dataM(String names, String amounts, String exps, String desc, String id) {
        this.names = names;
        this.amounts = amounts;
        this.exps = exps;
        this.desc = desc;
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public String getAmounts() {
        return amounts;
    }

    public String getExps() {
        return exps;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }
}
