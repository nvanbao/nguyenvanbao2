
package lecture3;

import java.util.Scanner;

public class bt23 {
    public static void main(String [] args){
        Scanner Check = new Scanner(System.in);
        System.out.print("Nhap mot gia tri bat ki: ");
        //check gia tri kieu chuoi
        if(Check.hasNext()){
            String stringValue = Check.nextLine();
            System.out.println("gia tri nay kieu chuoi " +stringValue);
         //check gia tri nguyen 
        }else if(Check.hasNextInt()){
            int intValue = Check.nextInt();
            System.out.println("gia tri nay kieu so nguyen " +intValue );
        }
        Check.close();
    }
}