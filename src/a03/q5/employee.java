package a03.q4;
import java.io.*;

class employee {

    int empId;
    String empName;
    float basicSal,
          hra,
          da,
          pf,
          gross,
          net;

    void read() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        System.out.println("Enter employee ID, name , and basic salary :");
        empId = Integer.parseInt(br.readLine());
        empName = br.readLine();
        basicSal  = Float.parseFloat(br.readLine());
    }

    void calculate(){

        hra = basicSal * 0.15F;
        da = basicSal * 0.10F;
        pf = basicSal * 0.08F;
        gross = basicSal + da + hra;
        net = gross - pf;
    }

    void show(){

        System.out.println("Employee Id             : "+ empId);
        System.out.println("Employee Name           : "+ empName);
        System.out.println("Employee Basic salary   : "+ basicSal);
        System.out.println("Employee Hra            : "+ hra);
        System.out.println("Employee Da             : "+ da);
        System.out.println("Employee Gross Salary   : "+ gross);
        System.out.println("Employee PF             : "+ pf);
        System.out.println("Employee Net Salary     : "+ net);
    }
}
