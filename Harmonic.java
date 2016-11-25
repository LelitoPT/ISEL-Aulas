 /**
Subject: Harmonic function - Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.

Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: November 18, 2016
*/
 
public class Harmonic { 

    // returns 1/1 + 1/2 + 1/3 + ... + 1/n
    public static double harmonic(int n) {
        double sum = 0.0;
        System.out.println("\t sum = " + sum);
        for (int i = 1; i <= n; i++) {//             
            sum += 1.0 / i;
            System.out.println("\t sum = " + sum);
        }
        System.out.println("\t return " + sum);
        return sum;
    }

    public static void main(String[] args) { 
        int decimal = 1, arg = 0;
        for (int i = 0; i < args.length; i++) { //MP: parseInt 
            decimal *= 10;
            arg += ((int)(args[0].charAt(i) - '0') * decimal);
        }
            System.out.println("arg = " + arg );
            System.out.println("harmonic(" + (arg) + ")");
            double value = harmonic(arg);
            System.out.println("value: " + value);
    }
}


/* % ----------
>> javac Harmonic.java
>> java Harmonic 4
2.083333333333333

>> java Harmonic 10
2.9289682539682538

>> java Harmonic 10000
9.787606036044348
*/