package com.masai;
import java.util.Scanner;
class Main {
public static void main(String args[]) {
System.out.println("start of main..");
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1");
try {
	int num1 = sc.nextInt();
	System.out.println("Enter num2");
	int num2 = sc.nextInt();

	
	int num3 = num1 / num2;
	if(num3 > 10){
	System.out.println("Welcome to Exception Handling ");
	}
	else {
		System.out.println("enter num1 vallu grater then num2");
	}
}
catch(NullPointerException ae) {
	System.out.println("enter integer vallu");
}

catch(Exception e){
	
}

String message = null;
System.out.println("Message is :"+ message.toUpperCase());
System.out.println("end of main");
}
}
