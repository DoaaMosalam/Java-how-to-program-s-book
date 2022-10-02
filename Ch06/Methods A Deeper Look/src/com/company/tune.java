package com.company;

public enum tune {
    bucky("nice","22"),
    Kelsey("Cuite","10"),
    julia("bigmistake","12");

    private final String desc;
    private final String year;

    tune(String description,String birthday){
        desc = description;
        year = birthday;

    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }


}
