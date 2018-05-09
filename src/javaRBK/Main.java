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
		
		System.out.println("input 5 number :");
		int arr[] =new int[5];
		for(int i=0;i<5;i++){
			int num =render.nextInt();
			arr[i]=num;
		}
		System.out.println(Arrays.toString(arr));
		myClass.acceptAndReverse(arr);
		myClass.acceptAndReversMe(arr);
	}

}
