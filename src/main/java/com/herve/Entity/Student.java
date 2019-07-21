package com.herve.Entity;

public class Student {
    private int Id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        Id = id;
        this.name = name;
        this.course = course;
    }

    public Student(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

