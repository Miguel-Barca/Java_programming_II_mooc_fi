

/**
 *
 * @author Miguel
 */
public class Student implements Comparable<Student> {

    private String name;

    /**
     *
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareToIgnoreCase(student.getName());
    }

}
