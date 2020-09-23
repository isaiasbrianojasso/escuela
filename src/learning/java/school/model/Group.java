package learning.java.school.model;

class Group {
    private Professor professor;
    private int availability;
    private Student[] students;

    Group(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

    public Group(int i, Professor professorIvan) {
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getAvailability() {
        return availability;
    }

    public String getEnrolled() {
        return null;
    }

    public void printStudentsList() {
    }

    public void addStudent(Student student) {
    }

    public void setProfessor(Professor professorPaco) {
    }
}
