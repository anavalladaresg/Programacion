package notasprogramacion;

import java.util.Scanner;

public class NotasProgramacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Subject name: ");
        String subject = sc.nextLine();
        
        System.out.print("First midterm grade: ");
        float firstGrade = sc.nextFloat();
        System.out.print("Second midterm grade: ");
        float secondGrade = sc.nextFloat();
        
        float finalGrade = (firstGrade+secondGrade)/2;
        System.out.println("The final grade of " + subject + " is: " + finalGrade);
    }
    
}
