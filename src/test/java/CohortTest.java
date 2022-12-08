import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CohortTest {

    private Cohort myCohort;
    @Before
    public void setUp(){
        myCohort = new Cohort();
    }

    // A Cohort instance can add a Student to the List of students.
    @Test
    public void addStudentTest(){
        this.myCohort.addStudent(new Student(1,"Aldanis Vigo"));
        assertEquals(1,this.myCohort.getStudents().size());
    }

    // A Cohort instance can get the current List of students.
    @Test
    public void getListTest(){
        //Get the student's list
        List<Student> myList = this.myCohort.getStudents();

        //Assert that the list is empty initially
        assertTrue(myList.size() == 0);

        //Add a student to the list
        this.myCohort.addStudent(new Student(2,"John Krsak"));

        //Assert that the list has one item
        assertTrue(myList.size() == 1);
    }

    // A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testCohortAverage(){
        //Create a student with a grade of 80
        Student studentOne = new Student(1,"Aldanis Vigo");
        studentOne.addGrade(80);

        //Create a student with a grade of 70
        Student studentTwo = new Student(2, "John Krsak");
        studentTwo.addGrade(70);

        //Add both students to the cohort
        this.myCohort.addStudent(studentOne);
        this.myCohort.addStudent(studentTwo);

        //Assert that the cohorts average is 75
        assertTrue(75.0 == this.myCohort.getCohortAverage());
    }

    @Test
    public void testFindStudentById(){
        //Create a couple of students
        Student studentOne = new Student(1,"Aldanis Vigo");
        studentOne.addGrade(80);
        Student studentTwo = new Student(2, "John Krsak");
        studentTwo.addGrade(70);

        //Add them to the cohort
        this.myCohort.addStudent(studentOne);
        this.myCohort.addStudent(studentTwo);

        //Check if we can find the student by it's id
        Student found = this.myCohort.findStudentById(1);

        //Make sure that the found students name is Aldanis Vigo
        assertEquals(studentOne.getName(),found.getName());
    }
}
