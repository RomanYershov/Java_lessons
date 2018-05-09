package com.company.HW_2;



public  class Track {
    private String title;
    private Group group;
    private String name;
    private String format;
    private int year;
    private double time;

    public Track(String title, String name, String format,Group group, int year, double time){
        this.group = group;
        this.name = name;
        this.time = time;
        this.title = title;
        this.year = year;
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }

    public void info(){
        System.out.print("Title: "+title+" | "
                           +"Name: "+name+" | "
                              +"Group: "+group.getName()+" | "+format
                                 +"\n..................................\n");
    }

    @Override
    public int hashCode(){
        return title.hashCode()+name.hashCode()
                +group.hashCode()+format.hashCode()
                +(int)time+year;
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        if(this == obj)
            return true;
        Track track = (Track)obj;
        return track.title.equals(title)&&track.name.equals(name)
                &&track.group.equals(group)&&track.year == year
                &&track.time == time;
    }
}
