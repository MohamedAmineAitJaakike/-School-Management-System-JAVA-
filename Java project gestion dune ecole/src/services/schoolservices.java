package services;
import models.school;
import models.student;
import models.teacher;
import models.grade;
public class schoolservices {
    school school;

    public schoolservices(models.school school) {
        this.school = school;
    }

    public models.school getSchool() {
        return school;
    }
    public void addteacher(teacher teacher ){
        this.school.getTeachers().add(teacher);
    }
    public void removeteacher(teacher teacher ){
        this.school.getTeachers().remove(teacher);
    }
    public void addstudent(student student ){
        this.school.getStudents().add(student);
    }
    public void removestudent(student student ){
        this.school.getStudents().remove(student);
    }
    public void addgrade(grade grade ){
        this.school.getGrades().add(grade);
    }
    public void removegrade(grade grade ){
        this.school.getGrades().remove(grade);
    }


}
