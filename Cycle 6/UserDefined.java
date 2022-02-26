class UserDefined
{
	public static void main(String[] args )
	{
		try{
			int b = 100;
			if(b<500)
				throw new LowBalance();
		
		}
		catch(LowBalance e)
		{
			System.out.println(e);
		}
	}
}

class LowBalance extends Exception
{
	LowBalance()
	{
	}
}
