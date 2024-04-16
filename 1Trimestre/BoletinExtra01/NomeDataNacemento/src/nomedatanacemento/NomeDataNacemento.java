package nomedatanacemento;

import java.util.Scanner;

public class NomeDataNacemento {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your full name: ");
        String name = sc.nextLine();
        System.out.print("Write your birth day: ");
        int birthDay = sc.nextInt();
        System.out.print("Write your birth month: ");
        int birthMonth = sc.nextInt();
        System.out.print("Write your birth year: ");
        int birthYear = sc.nextInt();
        
        System.out.println("\t Full name: " + name);
        System.out.println("\t Birthday: " + birthDay + "/" + birthMonth + "/" + birthYear);
    }
    
}
