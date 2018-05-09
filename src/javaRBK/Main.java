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
		myClass.guessMyNumber(number);
		
		System.out.println("input 5 number :");
		int arr[] =new int[5];
		for(int i=0;i<arr.length;i++){
			int num =render.nextInt();
			arr[i]=num;
		}
		myClass.acceptAndReverse(arr);
		myClass.acceptAndReversMe(arr);
		System.out.println("input counter :");
	    int count = render.nextInt();
	    System.out.println("input string :");
	    String str = render.next();
	    myClass.repeatString(str, count);
	}
	

}
