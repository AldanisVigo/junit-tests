import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findStudentById(long id){
        Student match = null;
        for(Student student : this.students){
            if(student.getId() == id){
                match = student;
                break;
            }
        }
        if(match != null){
            return match;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}