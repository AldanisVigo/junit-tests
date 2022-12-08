import java.util.ArrayList;
import java.util.Arrays;

public class Student {
//    The Student class should have a constructor that sets both the name and id property,
//    it initializes the grades property as an empty ArrayList.
    private final long id;
    private String name;
    private ArrayList<Integer> grades;
    public Student(long id, String name){
        this.grades = new ArrayList<>();
        this.id = id;
        this.name = name;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        try {
            return (double) this.grades.stream().reduce((a, b) -> a + b).get() / this.grades.size();
        } catch (NullPointerException e){
            throw e;
        }
    }

    // Go ahead and try to add the rest of the CRUD tests and functionality,
    // write the methods for updateGrade() and deleteGrade() in the Student class.
    public void updateGrade(int index, Integer newGrade){
        try {
            this.grades.set(index, newGrade);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteGrade(int index){
        try {
            this.grades.remove(index);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

}
