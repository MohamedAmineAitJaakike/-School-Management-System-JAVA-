package models;

import java.util.ArrayList;

public class grade {
    String code ;
    String name;
    teacher teacher;
    ArrayList<student> students;

    public grade(String code , String name) {
    this.code = code ;
    this.name = name;
    }

    public grade() {
    }

    public models.teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(models.teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<student> getStudents() {
        return students;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
