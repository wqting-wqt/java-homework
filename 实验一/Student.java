package homework.实验一;//import jdk.internal.foreign.abi.Binding;

import java.util.List;

public class Student {
    // public Binding.Allocate classNum;
    private String name;
    private String number;
    private List<Course> courses;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
