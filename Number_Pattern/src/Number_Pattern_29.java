import java.util.Scanner;


public class Number_Pattern_29 {
	// Test
	public static void main(String[] args) {
		int i, j, k;
		int intInpVal;
		// Take the user Input
		Scanner obsc = new Scanner(System.in);
		intInpVal =obsc.nextInt();
		if(intInpVal>=1 && intInpVal <= 1000){
			// First Loop for column indexing
			for(i=intInpVal;i>=1;i--){
				// Second loop for blank spaces
				for(j=intInpVal;j>i;j--){
					System.out.print("  ");
				}
				// Print the Star
				for(k=1;k<=i;k++){
					System.out.print("*");
					// Match First and Second loop index to include the space
					// and Exclude for last End 
					if(j!=k){
						System.out.print(" ");
					}
				}
				// Print values in next line and if it reaches to final line then Stop
				if(i!=1){
					System.out.println();
				}
			}	
		}else{
			System.out.println("Input value should between 1 and 1000");
		}
		
		
	}

}
