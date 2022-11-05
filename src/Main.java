import java.io.*;
import java.util.Scanner;
public class Main {



        public static void main (String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter word");

            String str = myObj.nextLine();
            String  nstr="";
            char ch;

            System.out.print("Written word: ");
            System.out.println(str);

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }
