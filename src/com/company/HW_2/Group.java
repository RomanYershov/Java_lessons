package com.company.HW_2;

public class Group {
    private String name;
    private String ganre;
    private String description;

    public Group(String name, String ganre){
        this.name = name;
        this.ganre = ganre;
        description = "...";
    }

    public String getName(){
        return this.name;
    }
}
