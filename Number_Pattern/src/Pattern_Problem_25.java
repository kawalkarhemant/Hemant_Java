import java.util.Scanner;

public class Pattern_Problem_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intLoopCol = 0;				// Start the Loop column level
		int intPrSp = 0;				// Print the spaces
		int intPrNum = 1;				// Print the Number
		int intPrNumCnt = 1;			// Keep the Counter to print Number
		int intInptVal = 0;				// Take the input from End User
		
		// Take the Input from End User
		Scanner obsc = new Scanner(System.in);
		intInptVal = obsc.nextInt();
		
		
		// Print the for loop for column level
		for(intLoopCol=1;intLoopCol<=intInptVal;intLoopCol++) {
			// Print the Spaces
			for(intPrSp=1;intPrSp<=(intInptVal-intLoopCol);intPrSp++) {
				System.out.print("  ");
			}
			// Print the Number Pattern
			for(intPrNum=intPrNumCnt;intPrNum>=1;intPrNum--) {
				System.out.print(intPrNumCnt);
				// Remove the last space
				if(intPrNum!=1) {
					System.out.print(" ");
				}
				
			}
			// If Input Value and Loop of column is matched the stop increamental process
			if(intLoopCol<intInptVal) {
				//Increase the counter
				intPrNumCnt++;
				System.out.println();
			}
			
		}

	}

}
