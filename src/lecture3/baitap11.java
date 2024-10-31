package lecture3;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class baitap11 {

    public static void main(String[] args) {
        Scanner information = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = information.nextLine();
        System.out.print("Enter age: ");
        int age = information.nextInt();
        String dateOfBirth = information.nextLine();
        SimpleDateFormat Birth = new SimpleDateFormat("dd/MM/yyyy");
        Birth.setLenient(false);
        Date date = null;
    while(true){
      System.out.print("Enter dateOfBirth (dd/MM/yyyy): ");
      information.nextLine();
      
        try {
           date = Birth.parse(dateOfBirth);
           break ;
        } catch (ParseException e) {
            System.out.println("Invalid date.Please enter again.");
            return ;
 }
}
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
