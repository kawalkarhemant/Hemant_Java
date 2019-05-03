import java.util.Scanner;

public class Pattern_Problem_14 {

	public static void main(String[] args) {
		
		int intCol;							// Start the Loop on column Level
		int intInpAlphChr;					// Input the Index of char till End need to print
		int intRowLevLoop;					// Start the Row Level Loop
		
		int intStart64ASCII = 0;				// Start the value to print from A
		
		Scanner obsc = new Scanner(System.in);
		intInpAlphChr =  obsc.nextInt();
		
		if(intInpAlphChr >=1 && intInpAlphChr<=26) {
			// Start the Column level Loop
			for(intCol=1;intCol<=intInpAlphChr;intCol++) {
				// Always Start from 'A'
				intStart64ASCII = 65;
				// Start the Row level Loop to print ASCII value
				for(intRowLevLoop=1;intRowLevLoop<=intCol;intRowLevLoop++) {
					// Print the ASCII value
					char ch = (char) intStart64ASCII++;
					// It will match till end End to eliminate last space
					if(intRowLevLoop < intCol) {
						System.out.print(ch + " ");
					}else {
						System.out.print(ch);
					}
					
				}
				// It will match till end End to eliminate last space
				if(intCol < intInpAlphChr) {
					System.out.println("");
				}
				
			}
		}else{
			System.out.println("Input Value must be between 1 to 26");
		}
		
		
		
		
		
		
		

	}

}
