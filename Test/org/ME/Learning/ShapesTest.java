package org.ME.Learning;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //without this if you have like constructor it will be executed twice (if you have 2 tests) and will be after the BeforeAll method but with it only once and  before the BeforeAll method
class ShapesTest {
//    Shapes shapes =new Shapes();   second way but you can not use var here
      Shapes shapes ;      // other way from  the second way

    @BeforeAll
    static void theStart(){
        System.out.println("before all  tests ");
    }

    @AfterAll
    static void theEnd(){  // u can here delete static because of the Annotation uo there , and this means it will make sure that this methode will be executed once
        System.out.println("after all  tests ");
    }


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