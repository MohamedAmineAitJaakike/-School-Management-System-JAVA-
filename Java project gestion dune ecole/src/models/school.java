package models;

import java.util.ArrayList;

public class school {
    String name;
    String address;
    double phonenumber;
    ArrayList<student> students;
    ArrayList<teacher> teachers;
    ArrayList<grade> grades;


    public school(String name) {
        this.name = name;
        this. initobject();
    }
private void initobject(){
    this.students= new ArrayList<student>();
    this.teachers= new ArrayList<teacher>();
    this.grades= new ArrayList<grade>();
}
    public school() {
    this.initobject();
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public ArrayList<grade> getGrades() {
        return grades;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(double phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ArrayList<student> getStudents() {
        return students;
    }



    public ArrayList<teacher> getTeachers() {
        return teachers;
    }


}
