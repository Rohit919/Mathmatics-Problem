package Mathmatics;

import java.util.*;
public class CheckPrime {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				flag = true;
			}
		}
		if(flag == false) {
			System.out.print("Prime");
		} else {
			System.out.print("Not Prime");
		}
		sc.close();
    }
}