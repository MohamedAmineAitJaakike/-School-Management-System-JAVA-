package models;

public class student extends person{
    int parentnumberphone;

    public student(String name, int age, int numberphone) {
        super(name, age);
        this.parentnumberphone = numberphone;
    }

    public student() {
    }

    public int getNumberphone() {
        return parentnumberphone;
    }

    public void setNumberphone(int numberphone) {
        this.parentnumberphone = numberphone;
    }
}
