package org.ME.Learning;

public class Grade {

    public char  determineLetterGrade (int numberGrade){

       if (numberGrade<0)
       {
           throw new  IllegalArgumentException("can not be under 0");
       } else if (numberGrade<60) {
           return 'F';
       }else if (numberGrade<70) {
           return 'D';
       }else if (numberGrade<80) {
           return 'C';
       }else if (numberGrade<90) {
           return 'B';
       }else return 'A';

    }
}
