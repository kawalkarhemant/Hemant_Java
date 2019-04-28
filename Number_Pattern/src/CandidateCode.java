import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class CandidateCode
{
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	int rows = in.nextInt();
    	for (int i = rows; i >= 1; i--) {
    	int c = rows;
    	for(int j = 0; j < i; j++) {
    	System.out.print(c--);
    	if (j != i - 1)
    	System.out.print(" ");
    	}
    	if (i > 1)
    	System.out.println();
    	}
    }
}