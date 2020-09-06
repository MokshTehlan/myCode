package com.company;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	// write your code here
//     Harry sir thanku very much for providing these interesting courses for free
        
        Scanner marks = new Scanner(System.in);

        System.out.println("Percentage calculator :)");
        System.out.println("Write down your maximum marks here (of one suject): ");
        int maxmarks = marks.nextInt();
        int totalmarks = 5 * maxmarks;
        System.out.print("First subject marks out of  "+maxmarks+":-  " );
        int m1 = marks.nextInt();
        System.out.print("Second subject marks out of "+maxmarks+":-  " );
        int m2 = marks.nextInt();
        System.out.print("Third subject marks out of  "+maxmarks+":-  " );
        int m3 = marks.nextInt();
        System.out.print("Fourth subject marks out of "+maxmarks+":-  " );
        int m4 = marks.nextInt();
        System.out.print("Fifth subject marks out of  "+maxmarks+":-  " );
        int m5 = marks.nextInt();
        int tm = m1+m2+m3+m4+m5;
        float perc = ((tm*100)/totalmarks);
        System.out.println("The total percentage of your marks is :- " +perc+ "%");
    }
}
