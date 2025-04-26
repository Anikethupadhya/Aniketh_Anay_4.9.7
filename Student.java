public class Student {
    private String name;
    private String id;
    private String yearInSchool;

    public Student(String name, String id, String yearInSchool) {
        this.name = name;
        this.id = id;
        this.yearInSchool = yearInSchool;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Year: " + yearInSchool;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.id.equals(other.id);
    }
}