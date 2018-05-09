package javaRBK;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Helllo");
		MyClass myClass = new MyClass();
		myClass.printMsg("\n Faris");
		
		Scanner render = new Scanner(System.in);
		
		System.out.println("Input Number :");
		int number = render.nextInt();
		System.out.println(number);
		myClass.guessMyNumber(number);
	}

}
