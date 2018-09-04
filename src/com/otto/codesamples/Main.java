package com.otto.codesamples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Type 2 numbers");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        int max = Math.max(int1, int2);
	    int min = Math.min(int1, int2);

	    int number = (int)((max-min-1)*Math.random()+min+1);

	    if(number/10 <1){
            System.out.println("Number is: "+ number +", 1 digit");
            }else{
	            if(number/10< 10){
                    System.out.println("Number is: "+ number +", 2 digits");
                        }else{
                            System.out.println("Number is: "+ number +", 3 digits");
                        }
                }
        }
}
