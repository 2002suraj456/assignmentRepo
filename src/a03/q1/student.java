package a03.q1;
import java.io.*;

class student {

    int roll,
        total_marks;

    String name,
           grade;

    void read() throws IOException {

        System.out.println("Enter roll number and name of the student:");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        roll = Integer.parseInt(br.readLine());
        name = br.readLine();
        
        System.out.println("Enter total marks:");
        total_marks = Integer.parseInt(br.readLine());
    }


    void cal_grade() {

        if(total_marks >= 400)
            grade = "A+";
        else if (total_marks >= 300 && total_marks < 400)
            grade = "A";
        else if (total_marks >= 250 && total_marks < 300)
            grade = "B";
        else
            grade = "C";
    }

    void show() {
        System.out.println("Roll Number :" + roll);
        System.out.println("Name        :" + name);
        System.out.println("Total Marks :" + total_marks);
        System.out.println("Grade 	    :" + grade);
    }
}
