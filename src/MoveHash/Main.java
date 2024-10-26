package MoveHash;


//Problem Statement –
//
//        You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
//
//
//
//        char* moveHash(char str[],int n);
//
//
//
//        example :-
//
//        Sample Test Case
//
//        Input:
//
//        Move#Hash#to#Front
//
//        Output:
//
//        ###MoveHashtoFront

import java.util.Scanner;
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
