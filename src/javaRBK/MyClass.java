package javaRBK;
import java.util.*;
public class MyClass {

	public void printMsg (String str) {
		System.out.println(str);
	}
	public void guessMyNumber (int num) {
		Random rand = new Random();
		for(int x=0; x<=3; x++) {
			
		int RandNum = rand.nextInt(10);
		System.out.println(RandNum);
		if(RandNum == num){
		System.out.println("Congratulation!! You win!!");
		} else if(RandNum != num && x == 3){
			System.out.println("Game over");
		}
		}
		
	}
	
}
