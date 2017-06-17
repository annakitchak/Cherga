package ua.study;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(3);
		System.out.println("Enter 1 to add person");
		System.out.println("Enter 2 to print queue");
		System.out.println("Enter 3 to exit");
		String user="";

		do{
			user = scanner.next();
		switch (user){
		case "1":{
			myQueue.offer(person);
			break;
		}
		case "2":{
			System.out.println(myQueue);
			break;
		}
		case "3":{
			System.exit(0);
			break;
		}
		default:{
			break;
		}
		}}while(!user.equals("3"));
		
		
		
	}

}
