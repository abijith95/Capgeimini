package MoveHash;


//Q::::::::::::: Move#Hash#to#Front:::::

import java.util.Scanner;

//A::::::::::::: ###MoveHashtoFront
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String s = sc.nextLine();

       StringBuilder sb = new StringBuilder();

       StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#')
            {
                sb.append(s.charAt(i));
            }
            else {
                sb2.append(s.charAt(i));
            }
        }

        System.out.println(sb.append(sb2));


    }


}
