/*
 * Activity 4.9.7
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student("TestName", "12345", "Freshman");
        Student t = new Student("Testname", "12345", "Sophomore");
        Student r = new Student("New Name", "67890", "Junior");

        System.out.println(s.equals(t));
        System.out.println(s.equals(r));

        System.out.println(s);
        System.out.println(t);
        System.out.println(r);
    }
}