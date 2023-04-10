import java.io.*;

class UserNotFoundException extends Exception
{
	public UserNotFoundException()
	{
		System.out.println(" From unf excep");
	}

}



class MyMainClass
{
	public static void main(String[] args) throws IOException
	{
	
		try{
		String uname=null;
		String pwd = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Username:");
		uname=br.readLine();
		System.out.println("Enter password:");
		pwd= br.readLine();

		if(uname.equals("deeps") && pwd.equals("pass"))
		{
			System.out.println("Welcome " + uname);
		}
		else{
			throw new UserNotFoundException();
		
		}
		}
		catch(UserNotFoundException unf)
		{
			System.out.println(unf);
		}

	}
}
