package org.ME.Learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
//    Shapes shapes =new Shapes();   second way but you can not use var here
      Shapes shapes ;
    @BeforeEach
    void init(){

        shapes= new Shapes();
        System.out.println("before the test");
    }


    @Test
    void computeSquareArea() {
//        var shapes = new Shapes();   first way and the best

        assertEquals(9, shapes.computeSquareArea(3),"it did not  pass   the Test");
        System.out.println("during the test");

    }

    @AfterEach
    void end(){
        System.out.println("end of the test");
    }

}