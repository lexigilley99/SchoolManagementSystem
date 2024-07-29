package school;

/**
 * Created by Lexi on 7/26/2024.
 * This class is responsible for keeping the
 * track of teachers names, id, and
 * salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary (int salary ) {
        this.salary = salary;
    }

    public void recieveSalary (int salary) {
            salaryEarned += salary;
    }
}
