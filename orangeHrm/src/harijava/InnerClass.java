package harijava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnerClass 
{
	public float bal;
	
	public InnerClass(float bal)
	{
		this.bal=bal;
	}
	public void calculate(float r) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the password");
		String pd=br.readLine();
		
		if(pd.equalsIgnoreCase("harinath"))
		{
			
			
		}
	}
	

}
