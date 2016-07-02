/**
 * This class represents a Course, which will provide us with a place where all
 * our other classes (Person, Professor, Student, GradStudent,
 * UndergradStudent, and TA) can interact.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Course {
    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] tas;
    private Student[] students;
    /**
     * Creates a Course, assigning values to Course's private values.
     * @param title The name of the Course.
     * @param professor The Professor teaching the Course.
     * @param headTA The head TA for the Course.
     * @param tas An array of TAs.
     * @param students An array of the Students in the classes.
     */
    public Course(String title, Professor professor, TA headTA, TA[] tas,
        Student[] students) {
        this.title = title;
        this.professor = professor;
        this.headTA = headTA;
        if (tas.length > 300) {
            System.out.println("You cannot have more than 15 TAs!");
            System.out.println("So I'll give you the first 15.");
            this.tas = new TA[15];
            for (int i = 0; i < 15; i++) {
                this.tas[i] = tas[i];
            }
        } else if (tas.length == 0) {
            System.out.println("Critical Error! No TAs detected! Abort!");
            System.exit(0);
        } else {
            this.tas = tas;
        }
        if (students.length > 300) {
            System.out.println("You cannot have more than 300 students!");
            System.out.println("So I'll give you the first 300.");
            this.students = new Student[300];
            for (int i = 0; i < 300; i++) {
                this.students[i] = students[i];
            }
        } else if (students.length == 0) {
            System.out.println("Critical Error! No students detected! Abort!");
            System.exit(0);
        } else {
            this.students = students;
        }
    }
    /**
     * Returns the Course's title.
     * @return The Course's title.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns the Course's Professor.
     * @return The Course's Professor.
     */
    public Professor getProfessor() {
        return professor;
    }
    /**
     * Returns the Course's head TA.
     * @return The Course's head TA.
     */
    public TA getHeadTA() {
        return headTA;
    }
    /**
     * Returns the Course's TAs.
     * @return The Course's TAs.
     */
    public TA[] getTAs() {
        return tas;
    }
    /**
     * Returns the Course's Students.
     * @return The Course's Students.
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * Returns the average of all the Student's average study percentage.
     * @return The average of all the Student's average study percentage.
     */
    public double getAverageStudyPercentage() {
        double total = 0, average = 0;
        for (int i = 0; i < students.length; i++) {
            total = total + students[i].getStudyPercentage();
        }
        average = total / students.length;
        return average;
    }
    /**
     * Adds a student to the Course.
     * @param s The Student that will be added to the course.
     */
    public void addStudent(Student s) {
        if (students.length == 300) {
            System.out.println("No more students allowed in this course!");
        } else {
            Student[] placeholder = new Student[students.length];
            for (int i = 0; i < placeholder.length; i++) {
                placeholder[i] = students[i];
            }
            students = new Student[placeholder.length + 1];
            for (int j = 0; j < students.length; j++) {
                if (j == students.length - 1) {
                    students[j] = s;
                } else {
                    students[j] = placeholder[j];
                }
            }
        }
    }
}