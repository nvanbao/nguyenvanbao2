package lecture3;

import java.util.Scanner;

public class baitap1 {

    public static void main(String[] args) {
        Scanner information = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = information.nextLine();
        System.out.print("enter age: ");
        int age = Integer.parseInt(information.nextLine());
        System.out.print("enter gender(gioi tinh): ");
        String gender = information.nextLine();
        System.out.print("entrer major(chuyen nganh): ");
        String major = information.nextLine();
        System.out.print("Nhap GPA: ");
        double GPA = Double.parseDouble(information.nextLine());
        System.out.print("enter hometown: ");
        String hometown = information.nextLine();

        // hien thi thong tin 
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("hometown: " + hometown);
    }
}
