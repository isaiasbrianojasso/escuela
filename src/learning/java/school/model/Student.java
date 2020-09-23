package learning.java.school.model;

public class Student {
    private String name;
    private String code;

    public Student(String name, String code){      //Creacion del contructor
        this.name=name;
        this.code=code;
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