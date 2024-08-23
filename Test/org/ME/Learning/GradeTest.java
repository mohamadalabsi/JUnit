package org.ME.Learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void nintyShouldReturnA() {
          var grade = new Grade();

          assertEquals('A', grade.determineLetterGrade(90));
    }

    @Test
    void fiftyNineShouldReturnF() {
        var grade = new Grade();

        assertEquals('F', grade.determineLetterGrade(59));
    }

    @Test
    void eightShouldReturnB() {
        var grade = new Grade();

        assertEquals('B', grade.determineLetterGrade(80));
    }

    @Test
    void minusOneShouldReturnException() {
        var grade = new Grade();

        assertThrows(IllegalArgumentException.class , ()-> {
            grade.determineLetterGrade(-1);
        });
    }
}