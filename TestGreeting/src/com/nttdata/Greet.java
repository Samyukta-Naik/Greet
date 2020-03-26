package com.nttdata;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		System.out.println("WELCOME");
		System.out.println("Please Enter Your Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Hello "+name);
		sc.close();

	}

}
