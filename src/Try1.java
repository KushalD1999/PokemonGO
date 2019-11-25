public class Try1 {
	
	public String name;
	public String type;
	public int healthtotal;
	

	
	public Try1(String nam, String types)
	{
		name = nam;
		type = types;
	}

	public String getName ()
	{
		return "Name: " + name + "\n" + " " + "\n" + " " + "\nType: " +type;
	}
		
	
	public String getType ()
	{
		return type;
	}

	
	public String toString()
	{
		return ("NAME : " + name + "\n   TYPE : " + type );
	}
}
