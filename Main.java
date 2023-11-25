package com.java.manoj;

public class Main {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.makeSound();
		System.out.println("Dog :");
		Dog d=new Dog();
		d.makeSound();
		System.out.println("Cat :");
		Cat c=new Cat();
		c.makeSound();

	}

}
