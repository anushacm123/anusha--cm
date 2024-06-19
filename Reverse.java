package anu.anu;

import java.util.Scanner;

public class Reverse {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		 System.out.println("enter the String");
		 String s=scn.next();
		char[] c= s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		String rev=new String(c);
		System.out.println(rev);
		
		}
}

		 
		
		