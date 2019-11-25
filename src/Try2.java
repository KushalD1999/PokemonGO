import java.util.ArrayList;

public class Try2 {
	public ArrayList <Try1> Poke;
	public ArrayList <Integer> HP;
	public ArrayList <Try1> player1one = new ArrayList <Try1> ();
	public ArrayList <Integer> PlayerHP = new ArrayList <Integer> ();

	public Try1 P1 = new Try1 ("Pikachu","Electric");
	public Try1 P2 = new Try1 ("Jolteon","Electric");
	public Try1 P3 = new Try1 ("Zapdos","Electric");
	public Try1 P4 = new Try1 ("Squirtle","Water");
	public Try1 P5 = new Try1 ("Blastoise","Water");
	public Try1 P6 = new Try1 ("Vaporeon","Water");
	public Try1 P7 = new Try1 ("Charizard","Fire");
	public Try1 P8 = new Try1 ("Charmander","Fire");
	public Try1 P9 = new Try1 ("Blaziken","Fire");
	
	

	
	public int healthpoint;
	public int hp;
		
	public Try2 () 
	{
		Poke = new ArrayList <Try1> ();
		Poke.add(P1);
		Poke.add(P2);
		Poke.add(P3);
		Poke.add(P4);
		Poke.add(P5);
		Poke.add(P6);
		Poke.add(P7);
		Poke.add(P8);
		Poke.add(P9);
		
		
		HP = new ArrayList <Integer> ();
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);
		HP.add(150);



	} 
		
	
	public void Player (int poknum1 )
	{
		player1one.add(Poke.get(poknum1 - 1));
	}
	

	public Try1 getPlayer (int numb)
	{
		return player1one.get(numb);
	}
	
	public void setHP (int tumb)
	{
		PlayerHP.add(HP.get(tumb - 1));
	}
	
	public void changeHP (int tumb, int quantity)
	{
		healthpoint = PlayerHP.get(tumb)-quantity;
		PlayerHP.set(tumb, healthpoint);
	}
	
	public int getHP (int tumb)
	{
 		return PlayerHP.get(tumb);
	}
	
	public String getNameandType (int numb)
	{
		if (numb == 1)
		{
			return P1.getName();
		}
		if (numb == 2)
		{
			return P2.getName();
		}
		if (numb == 3)
		{
			return P3.getName();
		}
		if (numb == 4)
		{
			return P4.getName();
		}
		if (numb == 5)
		{
			return P5.getName();
		}
		if (numb == 6)
		{
			return P6.getName();
		}
		if (numb == 7)
		{
			return P7.getName();
		}
		if (numb == 8)
		{
			return P8.getName();
		}
		if (numb == 9)
		{
			return P9.getName();
		}
		return null;
		
	}
	
	public String toString()
	{
		return ("1 "+ P1 + "\n2 " + P2 + "\n3 " + P3 + "\n4 " + P4 + "\n5 " +P5 + "\n6 " +P6 + "\n7 " +P7 + "\n8 " +P8 + "\n9 " +P9 );
	}

}

	
	

	

