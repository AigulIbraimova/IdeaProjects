package youtube;

import java.util.Scanner;

public class Practice1 {
	public static void main (String [] args) {
		
		int luna,c=1,k,i,j;
	    System.out.print("Enter numbers: ");
	    Scanner in = new Scanner(System.in);
			    luna = in.nextInt();
	    for(i=0;i<luna;i++)
	    {
	        for(k=1;k<=luna-i;k++)
	        System.out.print(" ");
	        for(j=0;j<=i;j++)
	        {
	            if (j==0||i==0)
	                c=1;
	            else
	               c=c*(i-j+1)/j;
	            System.out.print(" "+c);
	        }
	        System.out.print("\n");
	    }
	
		
	 
	
}

}
