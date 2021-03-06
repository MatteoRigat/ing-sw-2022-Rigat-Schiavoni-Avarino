package it.polimi.ingsw.model.gameboard;

import it.polimi.ingsw.model.Parameters;
import it.polimi.ingsw.model.player.Student;
import it.polimi.ingsw.model.enumeration.Colour;
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.Test;

public class CloudTest{

    @Test
    public void testCloud(){
        Cloud cloud = new Cloud();
        Parameters.setParameters(3,false);
        Student student1 = new Student(Colour.Green);
        Student student2 = new Student(Colour.Red);
        Student student3 = new Student(Colour.Blue);
        Student student4 = new Student(Colour.Pink);
        Student student5 = new Student(Colour.Yellow);
        boolean thrown = false;

        ArrayList<Student> stud =  cloud.getStudents();
        assertEquals(stud.size(),0);

        cloud.addStudent(student1);
        cloud.addStudent(student2);
        cloud.addStudent(student3);
        cloud.addStudent(student4);


        stud= cloud.getStudents();
        assertEquals(stud.size(),4);
        stud= cloud.getStudents();
        assertEquals(stud.size(),0);

        cloud.addStudent(student1);

        cloud.addStudent(student2);
        cloud.addStudent(student3);
        cloud.addStudent(student4);
        cloud.addStudent(student5);

        stud = cloud.seeStudents();
        assertEquals(stud.size(),4);
        stud = cloud.seeStudents();
        assertEquals(stud.size(),4);

        cloud.setTaken(false);
        assertFalse(cloud.isTaken());

        stud = cloud.getStudents();
        assertEquals(stud.size(),4);
        stud = cloud.getStudents();
        assertEquals(stud.size(),0);

        assertTrue(cloud.isTaken());
        cloud.setTaken(false);
        assertFalse(cloud.isTaken());

    }
}
