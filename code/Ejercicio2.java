package code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


    public class Ejercicio2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if(n%2!=0){ System.out.println("Weird");
            }
            else if(2 <= n && n <= 5){ System.out.println("Not Weird");
            }
            else if(6 <= n && n <= 20){
                System.out.println("Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
    }
    }

