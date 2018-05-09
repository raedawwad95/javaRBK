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
		break;
		} else if(RandNum != num && x == 3){
			System.out.println("Game over");
		}
		}
		
	}
	
	public void acceptAndReverse (int []n){
		
		int newArr[]=new int[n.length];
		int count =0;
		for(int i =n.length-1;i>=0;i--){
			newArr[count] =n[i];
			count++;
			
		}
		System.out.println(Arrays.toString(newArr));
		
	}
	
	public void acceptAndReversMe (int []n){
		//ArrayUtils.addAll
		
		int newArr[]=new int[n.length];
		int count =0;
		for(int i =n.length-1;i>=0;i--){
			newArr[count] =n[i];
			count++;
			
		}
		int[] result = new int[n.length + newArr.length];	
		
        System.arraycopy(n, 0, result, 0, n.length);
        System.arraycopy(newArr, 0, result, n.length, newArr.length);

        System.out.println(Arrays.toString(result));
		}

	
}
