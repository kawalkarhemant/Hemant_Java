import java.util.Scanner;


/*Techgig - Number Pattern Problem*/


class Number_Pattern {

	public int intInpVal;			// Set the Variable to get Value as Input
	
	public int intColStart;			// Set the Column value 
	public int intRowStart;			// Set the Row value
	
	public int intNumValueShow;		// Show  the Number Pattern Value
	
	public void Show_Number_Pattern(){
		//Purpose : It will show number pattern
		
		//Assign Input Value
		//intInpVal = 5; 
		// Assign Value from User Input to Num to print
		Scanner obsc = new Scanner(System.in);
		intInpVal = obsc.nextInt(); 
		// Check Input Value is less than 1000
		if (intInpVal >= 1 && intInpVal <= 1000){
			intNumValueShow = intInpVal;
			// Column Level loop 
			for(intColStart=intInpVal;intColStart>=1;intColStart--){
				// Row Level loop 
				for(intRowStart=intNumValueShow;intRowStart>=1;intRowStart--){
					System.out.print(intNumValueShow + " ");
				}
				// Subtract '-1' to print the Number Pattern
				intNumValueShow = intNumValueShow - 1;
				// Move to next line
				System.out.println();
				}
			
		}else{
			System.out.print("Input Value must be between 1 to 1000");
		}
		
		
		}
		
			
	public static void main(String[] args) {
		
		Number_Pattern obnp = new Number_Pattern();
		obnp.Show_Number_Pattern();

	}

}