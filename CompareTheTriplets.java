import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

	private int alice = 0;
	private int bob = 0;
	
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2)
	{
        // Complete this function
		
		CompareTheTriplets compT = new CompareTheTriplets();
		return compT.getFinalResultForInput(a0, a1, a2, b0, b1, b2);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
    
    
    
    private int[] getFinalResultForInput(int a0, int a1, int a2, int b0, int b1, int b2)
    {
    	String c0 = compareTheseTwo(a0, b0);
    	String c1 = compareTheseTwo(a1, b1);
    	String c2 = compareTheseTwo(a2, b2);
    	
    	this.addFinalIntsForString(c0);
    	this.addFinalIntsForString(c1);
    	this.addFinalIntsForString(c2);
    	
    	int[] resultInt = new int[2];
    	resultInt[0] = alice;
    	resultInt[1] = bob;
    	
    	return resultInt;
    }
    
    private void addFinalIntsForString(String theString)
    {
    	if(theString != null)
    	{
    		if(theString.equals("a"))
        	{
        		alice++;
        	}
        	else
        	{
        		bob++;
        	}
    	}

    }
    
    private String compareTheseTwo(int comp1, int comp2)
    {
    	if(comp1 > comp2)
    	{
    		return "a";
    	}
    	else if(comp1 < comp2)
    	{
    		return "b";
    	}
    	else if(comp1 == comp2)
    	{
    		return null;
    	}
    	else
    	{
    		return null;
    	}
    	
    }

}
