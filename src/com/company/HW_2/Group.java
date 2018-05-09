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

    @Override
    public int hashCode(){
        return name.hashCode()+ganre.hashCode();
    }

    public boolean equals(Object object){
        if(object == null)
            return false;
        if (this.getClass() != object.getClass())
            return false;
        if (this == object)
            return true;

        Group group = (Group)object;
        return name.equals(group.name) && ganre.equals(group.ganre);
    }
}
