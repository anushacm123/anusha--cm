package anu.anu;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		s=s.toUpperCase();
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		boolean isFlag=true;
		while(i<j) {
			if(c[i]!=c[j])
			{
				isFlag=false;
				break;
				
			}
			i++;
			j--;
		}
		if(isFlag) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

		
			
		}
			

	}


