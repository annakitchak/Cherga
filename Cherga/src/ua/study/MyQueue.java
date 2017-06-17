package ua.study;

import java.security.Permissions;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue extends AbstractQueue<Person>{
	private int capacity;
	private ArrayList<Person> persons = new ArrayList<Person>(capacity);
	
	public MyQueue(int capacity) {
		super();
		this.capacity = capacity;
	}
   
	public void addPerson(){
		System.out.println("Enter person name");
		String name = Main.scanner.next();
		System.out.println("Enter person age");
		int age = Main.scanner.nextInt();
		Person person = new Person(name, age);
		persons.add(person);
	}
	

	@Override
	public boolean offer(Person person) {
		
		if(capacity>persons.size()){
			persons.add(person);
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "MyQueue [capacity=" + capacity + ", persons=" + persons + "]";
	}

	@Override
	public Person peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Person> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
