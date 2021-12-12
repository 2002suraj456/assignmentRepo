/*  W.A.P. to initialize the student class instance variable in demo class.
 *  create a method to calculate variable */
package a03.q1;
import java.io.*;

class demo {
    public static void main(String[] args) throws IOException {

        student s = new student();

        s.read();
        s.cal_grade();
        s.show();
    }
}
