import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student myStudent;
    @Before
    public void setUp(){
        this.myStudent = new Student(1,"Aldanis Vigo");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(this.myStudent.getGrades().isEmpty());
    }


    @Test
    public void testSize(){
        //Since we have no grades starting off, we expect the size to equal 0
        assertEquals(0, this.myStudent.getGrades().size());
    }

    @Test
    public void testAdd(){
        //We again assert that the array of grades in our student is empty
        assertTrue(this.myStudent.getGrades().isEmpty());

        // Add a grade to make it not empty anymore
        this.myStudent.addGrade(80);

        // Making sure the student grades isEmpty returns false once we add an element to it
        assertFalse(this.myStudent.getGrades().isEmpty());
    }

    @Test
    public void testRemove(){
        //Starting off the array of grades in our student should be empty
        assertTrue(this.myStudent.getGrades().isEmpty());

        // Add a grade to make it not empty anymore
        this.myStudent.addGrade(80);

        // Making sure the student grades isEmpty returns false once we add an element to it
        assertFalse(this.myStudent.getGrades().isEmpty());

        // Remove the item from the grades
        this.myStudent.deleteGrade(0);

        //Make sure that removing works and the array is empty again
        assertTrue(this.myStudent.getGrades().isEmpty());
    }

    @Test
    public void testContains(){
        //Check that the student's grades does not contain the value 80
        assertFalse(myStudent.getGrades().contains(80));

        //Add the value 80 to it
        this.myStudent.addGrade(80);

        //Check that the student's grades contains 80 now after adding it
        assertTrue(this.myStudent.getGrades().contains(80));
    }

    @Test
    public void testGradesAverage(){
        //Add a grade of 80
        this.myStudent.getGrades().add(80);
        //Add a grade of 70
        this.myStudent.getGrades().add(70);
        //Check that average is 75
        assertTrue(75.0 == this.myStudent.getGradeAverage());
    }

    @Test
    public void testName(){
        //Test that the name is Aldanis Vigo
        assertEquals("Aldanis Vigo",this.myStudent.getName());
    }

    @Test
    public void testId(){
        //Test that the id is equal to 1
        assertTrue(this.myStudent.getId() == 1);
    }

    @Test
    public void testGradeUpdate(){
        //Add a grade of 80
        this.myStudent.addGrade(80);

        //Assert that the value in index 0 is 80
        assertTrue(this.myStudent.getGrades().get(0) == 80);

        //Update the grade at index 0 to 75
        this.myStudent.updateGrade(0,75);

        //Assert that the value of index 0 is 75
        assertTrue(this.myStudent.getGrades().get(0) == 75);
    }
}
