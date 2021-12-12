/* W.A.P. to create a class employee and calculate gross and net salary.*/
package a03.q5;
import java.io.IOException;

class demo {

    public static void main(String[] args) throws IOException{
        
        employee e = new employee();
        e.read();
        e.calculate();
        e.show();
    }
}
