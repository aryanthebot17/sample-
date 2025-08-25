package core;

public class Student {
    private int regno;
    private String stdname;

    public Student(int regno, String stdname) {
        this.regno = regno;
        this.stdname = stdname;
    }

    public Student() {
        // No-arg constructor required by Spring for setter-based injection
    }

    public int getRegno() {
        return this.regno;
    }

    public String getStdname() {
        return this.stdname;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }
}
