import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import java.io.*;
import sun.audio.*;


import javax.swing.JOptionPane;

public class Try3 {
	public static void main (String[] args) throws Exception{
		Scanner in;
		
		Try2 V1 = new Try2 ();
		Try2 V2 = new Try2 ();
		
		
		String mp3_file = "C:\\Users\fizzy\Desktop\Pokemon GO\TrialFIles\src\Pokemon Theme With Lyrics.wav";
		
		InputStream input = new FileInputStream(mp3_file);
		
		AudioStream audio = new AudioStream(input);
		AudioPlayer.player.start(audio);
		
		
		Try1 winner = null;		

		in = new Scanner(System.in);
		
		
		
		System.out.println("                                                                                                â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•");
		System.out.println("                                                                   .::.                              ");
		System.out.println("                                                                  .;:**'                             ");
		System.out.println("                                                                  `                                  ");
		System.out.println("                                      .:XHHHHk.              db.   .;;.     dH  MX                   ");
		System.out.println("                                    oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN        ");
		System.out.println("                                    QMMMMMb  'MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM   ");
		System.out.println("                                      `MMMM.  )M> :X!Hk. MMMM   XMM.o'  .  MMMMMMM X?XMMM MMM>!MMP   ");
		System.out.println("                                       'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `' MX MMXXMM    ");
		System.out.println("                                        ~MMMMM~ XMM. .XM XM`'MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP    ");
		System.out.println("                                         ?MMM>  YMMMMMM! MM   `?MMRb.    `MM   !L'MMMMM XM IMMM      ");
		System.out.println("                                          MMMX   'MMMM'  MM       ~%:           !Mh.''' dMI IMMP     ");
		System.out.println("                                          'MMM.                                             IMX      ");
		System.out.println("                                           ~M!M                                             IM       ");
		System.out.println("                                                             â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—  â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•— ");        
		System.out.println("                                                            â–ˆâ–ˆâ•”â•�â•�â•�â•�â•� â–ˆâ–ˆâ•”â•�â•�â•�â–ˆâ–ˆâ•—");        
		System.out.println("                                                            â–ˆâ–ˆâ•‘  â–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘");        
		System.out.println("                                                            â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘");        
		System.out.println("                                                            â•šâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•”â•�â•šâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•”â•�");        
		System.out.println("                                                             â•šâ•�â•�â•�â•�â•�â•�  â•šâ•�â•�â•�â•�â•�â•� ");        
		System.out.println("                                                                                                â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•â—•");System.out.println("");        
		System.out.println("");        
		System.out.println("");  

		
		
		
		System.out.println ("***************************************************");
		System.out.println("          List of All pokemon names");  
		System.out.println ("***************************************************");
		System.out.println(V1);
		System.out.println("");  
		
		
		int pokemon1a;
		int pokemon2a;
		int pokemon3a;
		
		
		System.out.println ("***************************************************");
		System.out.println("                      Player 1");
		System.out.println ("***************************************************");
		System.out.print ("Please enter your 1st Pokemon: ");
		pokemon1a = in.nextInt();
		 if (pokemon1a > 9 || pokemon1a < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 1st Pokemon: ");
			 pokemon1a = in.nextInt();
		 }
		V1.Player(pokemon1a);
		V1.setHP(pokemon1a);
		System.out.print ("Please enter your 2nd Pokemon: ");
		 pokemon2a = in.nextInt();
		 if (pokemon2a > 9 || pokemon2a < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 2nd Pokemon: ");
			 pokemon2a = in.nextInt();
		 }
		while (pokemon1a == pokemon2a)
		{
			System.out.print ("Please enter your 2nd Pokemon again: ");
			pokemon2a = in.nextInt();
			 if (pokemon2a > 9 || pokemon2a < 1)
			 {
				 System.out.println("Please Select Pokemon from above list");
				 System.out.print ("Please enter your 2nd Pokemon: ");
				 pokemon2a = in.nextInt();
			 }
		}
		V1.Player(pokemon2a);
		V1.setHP(pokemon2a);
		System.out.print ("Please enter your 3rd Pokemon: ");
		 pokemon3a = in.nextInt();
		 if (pokemon3a > 9 || pokemon3a < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 3rd Pokemon: ");
			 pokemon3a = in.nextInt();
		 }
		while (pokemon1a == pokemon3a || pokemon2a == pokemon3a )
		{
			System.out.print ("Please enter your 3rd Pokemon again: ");
			pokemon3a = in.nextInt();
			if (pokemon3a > 9 || pokemon3a < 1)
			 {
				 System.out.println("Please Select Pokemon from above list");
				 System.out.print ("Please enter your 3rd Pokemon: ");
				 pokemon3a = in.nextInt();
			 }
		}
		V1.Player(pokemon3a);
		V1.setHP(pokemon3a);
		System.out.println ("***************************************************");


		
		int pokemon1b;
		int pokemon2b;
		int pokemon3b;
		
			
		System.out.println("                      Player 2");
		System.out.println ("***************************************************");
		System.out.print ("Please enter your 1st Pokemon: ");
		 pokemon1b = in.nextInt();
		 if (pokemon1b > 9 || pokemon1b < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 1st Pokemon: ");
			 pokemon1b = in.nextInt();
		 }
		V2.Player(pokemon1b);
		V2.setHP(pokemon1b);
		System.out.print ("Please enter your 2nd Pokemon: ");
		 pokemon2b = in.nextInt();
		 if (pokemon2b > 9 || pokemon2b < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 2nd Pokemon: ");
			 pokemon2b = in.nextInt();
		 }
		while (pokemon1b == pokemon2b)
		{
			System.out.print ("Please enter your 2nd Pokemon again: ");
			pokemon2b = in.nextInt();
			 if (pokemon2b > 9 || pokemon2b < 1)
			 {
				 System.out.println("Please Select Pokemon from above list");
				 System.out.print ("Please enter your 2nd Pokemon: ");
				 pokemon2b = in.nextInt();
			 }
		}
		V2.Player(pokemon2b);
		V2.setHP(pokemon2b);
		System.out.print ("Please enter your 3rd Pokemon: ");
		 pokemon3b = in.nextInt();
		 if (pokemon3b > 9 || pokemon3b < 1)
		 {
			 System.out.println("Please Select Pokemon from above list");
			 System.out.print ("Please enter your 3rd Pokemon: ");
			 pokemon3b = in.nextInt();
		 }
		 
		while (pokemon1b == pokemon3b || pokemon2b == pokemon3b )
		{
			System.out.print ("Please enter your 3rd Pokemon again: ");
			pokemon3b = in.nextInt();
			 if (pokemon3b > 9 || pokemon3b < 1)
			 {
				 System.out.println("Please Select Pokemon from above list");
				 System.out.print ("Please enter your 3rd Pokemon: ");
				 pokemon3b = in.nextInt();
			 }
		}
		V2.Player(pokemon3b);
		V2.setHP(pokemon3b);
		System.out.println ("***************************************************");
		



		

		Random rn = new Random();

		System.out.println("");  
		System.out.println("Are you Ready for the Battle (Press 1 for Yes)");
		int button = in.nextInt();
		
		
		if (button == 1)
		{

			
			System.out.println ("***************************************************");
			System.out.println(V1.getPlayer(0) + " \n        Vs \n" + V2.getPlayer(0));
			System.out.println ("***************************************************");

			while (V1.getHP(0) > 0 && V2.getHP(0) > 0)
			{
					int pok1hp1 = rn.nextInt(50) + 1;
					V1.changeHP(0,pok1hp1);
					
					int pok1hp2 = rn.nextInt(50) + 1;
					V2.changeHP(0,pok1hp2);
					
					if ((V1.getHP(0) == 0) && (V2.getHP(0) == 0))
					{
						V2.changeHP(0,pok1hp2 + 5);
					}
					
					System.out.println("Pokemon 1 HP: " + V1.getHP(0));
					System.out.println("Pokemon 2 HP: " + V2.getHP(0));

	
				
			}

			
			
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^			

			if (V1.getHP(0) > V2.getHP(0) )
			{
					System.out.println ("***************************************************");
					System.out.println(V1.getPlayer(0) + " \n        Vs \n" + V2.getPlayer(1));
					System.out.println ("***************************************************");
	
					while (V1.getHP(0) > 0 && V2.getHP(1) > 0)
					{
							int pok1hp1 = rn.nextInt(50) + 1;
							V1.changeHP(0,pok1hp1);
							
							int pok1hp2 = rn.nextInt(50) + 1;
							V2.changeHP(1,pok1hp2);
							
							if ((V1.getHP(0) == 0) && (V2.getHP(1) == 0))
							{
								V2.changeHP(1,pok1hp2 + 5);
							}
							
							System.out.println("Pokemon 1 HP: " + V1.getHP(0));
							System.out.println("Pokemon 2 HP: " + V2.getHP(1));

					}
					

				if (V1.getHP(0) > V2.getHP(1) )
				{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(0) + " \n        Vs \n" + V2.getPlayer(2));
						System.out.println ("***************************************************");
		
						while (V1.getHP(0) > 0 && V2.getHP(2) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(0,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(2,pok1hp2);
								if ((V1.getHP(0) == 0) && (V2.getHP(2) == 0))
								{
									V2.changeHP(2,pok1hp2 + 5);
								}
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(0));
								System.out.println("Pokemon 2 HP: " + V2.getHP(2));

						}
					
						
					
					
					if (V1.getHP(0) > V2.getHP(2) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(0) + " \n        Vs \n" + V2.getPlayer(2));
						System.out.println ("***************************************************");
		
						while (V1.getHP(0) > 0 && V2.getHP(2) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(0,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(2,pok1hp2);
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(0));
								System.out.println("Pokemon 2 HP: " + V2.getHP(2));
								System.out.println("");
								winner = V1.getPlayer(0);
								System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
								System.out.println("WInner : " + winner);
								System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
								AudioPlayer.player.stop(audio);
								break;
						}
						
					}
					
					else if (V1.getHP(0) < V2.getHP(2) )
					{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(1,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									if ((V1.getHP(1) == 0) && (V2.getHP(2) == 0))
									{
										V2.changeHP(2,pok1hp2 + 5);
									}
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(1));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));

							}
						}
						
						if (V1.getHP(1) < V2.getHP(2) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));
									if (V1.getHP(2) > 0 && V2.getHP(2) < 0)
									{
										System.out.println("");
										winner = V1.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
									else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
									{
										System.out.println("");
										winner = V2.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
							}
						}
					
						else if (V1.getHP(1) > V2.getHP(2) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(1,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(1));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));
									System.out.println("");
									winner = V1.getPlayer(1);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									System.out.println("WInner : " + winner);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									AudioPlayer.player.stop(audio);
									break;
									
									
							}
						}
				}
					
				
	// SLOT 1 ENds ...................	SLOT 1 ENds ...................SLOT 1 ENds ...................SLOT 1 ENds ...................SLOT 1 ENds ...................SLOT 1 ENds ...................SLOT 1 ENds ...................		
	
				else if (V1.getHP(0) < V2.getHP(1) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(1));
						System.out.println ("***************************************************");
		
						while (V1.getHP(1) > 0 && V2.getHP(1) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(1,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(1,pok1hp2);
								
								if ((V1.getHP(1) == 0) && (V2.getHP(1) == 0))
								{
									V2.changeHP(1,pok1hp2 + 5);
								}
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(1));
								System.out.println("Pokemon 2 HP: " + V2.getHP(1));
								
						}
					
					
					
					if (V1.getHP(1) > V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(1,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									if ((V1.getHP(1) == 0) && (V2.getHP(2) == 0))
									{
										V2.changeHP(2,pok1hp2 + 5);
									}
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(1));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));
							}
							
						
						
							if (V1.getHP(1) > V2.getHP(2) )
							{
								System.out.println ("***************************************************");
								System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
								System.out.println ("***************************************************");
				
								while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
								{
										int pok1hp1 = rn.nextInt(50) + 1;
										V1.changeHP(1,pok1hp1);
										
										int pok1hp2 = rn.nextInt(50) + 1;
										V2.changeHP(2,pok1hp2);
										
										System.out.println("Pokemon 1 HP: " + V1.getHP(1));
										System.out.println("Pokemon 2 HP: " + V2.getHP(2));
										System.out.println("");
										winner = V1.getPlayer(1);
										System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("WInner: " + winner);
										System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
				
								}
								
							}
						
							else if (V1.getHP(1) < V2.getHP(2) )
							{
								System.out.println ("***************************************************");
								System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
								System.out.println ("***************************************************");
				
								while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
								{
										int pok1hp1 = rn.nextInt(50) + 1;
										V1.changeHP(2,pok1hp1);
										
										int pok1hp2 = rn.nextInt(50) + 1;
										V2.changeHP(2,pok1hp2);
										
										System.out.println("Pokemon 1 HP: " + V1.getHP(2));
										System.out.println("Pokemon 2 HP: " + V2.getHP(2));
										if (V1.getHP(2) > 0 &&  V2.getHP(2) < 0)
										{
											System.out.println("");
											winner = V1.getPlayer(2);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											System.out.println("Winner: " + winner);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											AudioPlayer.player.stop(audio);
											break;
										}
										else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
										{
											System.out.println("");
											winner = V2.getPlayer(2);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											System.out.println("Winner: " + winner);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											AudioPlayer.player.stop(audio);
											break;
										}
				
								}
							
							}
						}
					
						else if (V1.getHP(1) < V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(1,pok1hp2);
									
									if ((V1.getHP(2) == 0) && (V2.getHP(1) == 0))
									{
										V2.changeHP(1,pok1hp2 + 5);
									}
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(1));
							}
							
						
						
						
						if (V1.getHP(2) > V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));
									if (V1.getHP(2) > 0 &&  V2.getHP(2) < 0)
									{
										System.out.println("");
										winner = V1.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
									else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
									{
										System.out.println("");
										winner = V2.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
							}
							
						}
						
						else if (V1.getHP(2) < V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(1,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(1));
									System.out.println("");
									winner = V2.getPlayer(1);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									System.out.println("Winner: " + winner);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									AudioPlayer.player.stop(audio);
										break;
									
								}
								
							}
						}
					}
			}
				
			
			
// Slot 2 over************************* Slot 2 over*************************Slot 2 over*************************Slot 2 over*************************Slot 2 over*************************Slot 2 over*************************
			
			

			else if (V1.getHP(0) < V2.getHP(0) )
			{
					System.out.println ("***************************************************");
					System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(0));
					System.out.println ("***************************************************");
	
					while (V1.getHP(1) > 0 && V2.getHP(0) > 0)
					{
							int pok1hp1 = rn.nextInt(50) + 1;
							V1.changeHP(1,pok1hp1);
							
							int pok1hp2 = rn.nextInt(50) + 1;
							V2.changeHP(0,pok1hp2);
							
							if ((V1.getHP(1) == 0) && (V2.getHP(0) == 0))
							{
								V2.changeHP(0,pok1hp2 + 5);
							}
							
							System.out.println("Pokemon 1 HP: " + V1.getHP(1));
							System.out.println("Pokemon 2 HP: " + V2.getHP(0));
					}
					
				
				
				
				if (V1.getHP(1) > V2.getHP(0) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(1));
							System.out.println ("***************************************************");
			
							while (V1.getHP(1) > 0 && V2.getHP(1) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(1,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(1,pok1hp2);
									
									if ((V1.getHP(1) == 0) && (V2.getHP(1) == 0))
									{
										V2.changeHP(1,pok1hp2 + 5);
									}
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(1));
									System.out.println("Pokemon 2 HP: " + V2.getHP(1));
							}
							
						
						
						
							if (V1.getHP(1) > V2.getHP(1) )
							{
								System.out.println ("***************************************************");
								System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
								System.out.println ("***************************************************");
				
								while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
								{
										int pok1hp1 = rn.nextInt(50) + 1;
										V1.changeHP(1,pok1hp1);
										
										int pok1hp2 = rn.nextInt(50) + 1;
										V2.changeHP(2,pok1hp2);
										
										if ((V1.getHP(1) == 0) && (V2.getHP(2) == 0))
										{
											V2.changeHP(2,pok1hp2 + 5);
										}
										
										System.out.println("Pokemon 1 HP: " + V1.getHP(1));
										System.out.println("Pokemon 2 HP: " + V2.getHP(2));
								}
								
							
							
							
							
							
								if (V1.getHP(1) > V2.getHP(2) )
								{
									System.out.println ("***************************************************");
									System.out.println(V1.getPlayer(1) + " \n        Vs \n" + V2.getPlayer(2));
									System.out.println ("***************************************************");
					
									while (V1.getHP(1) > 0 && V2.getHP(2) > 0)
									{
											int pok1hp1 = rn.nextInt(50) + 1;
											V1.changeHP(1,pok1hp1);
											
											int pok1hp2 = rn.nextInt(50) + 1;
											V2.changeHP(2,pok1hp2);
											
											System.out.println("Pokemon 1 HP: " + V1.getHP(1));
											System.out.println("Pokemon 2 HP: " + V2.getHP(2));
											System.out.println("");
											winner = V1.getPlayer(1);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											System.out.println("Winner: " + winner);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											AudioPlayer.player.stop(audio);
											break;
									}
									
								}	
							
									else if (V1.getHP(1) < V2.getHP(2) )
								{
									System.out.println ("***************************************************");
									System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
									System.out.println ("***************************************************");
					
									while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
									{
											int pok1hp1 = rn.nextInt(50) + 1;
											V1.changeHP(2,pok1hp1);
											
											int pok1hp2 = rn.nextInt(50) + 1;
											V2.changeHP(2,pok1hp2);
											
											System.out.println("Pokemon 1 HP: " + V1.getHP(2));
											System.out.println("Pokemon 2 HP: " + V2.getHP(2));
											if (V1.getHP(2) > 0 &&  V2.getHP(2) < 0)
											{
												System.out.println("");
												winner = V1.getPlayer(2);
												System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
												System.out.println("Winner: " + winner);
												System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
												AudioPlayer.player.stop(audio);
												break;
											}
											else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
											{
												System.out.println("");
												winner = V2.getPlayer(2);
												System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
												System.out.println("Winner: " + winner);
												System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
												AudioPlayer.player.stop(audio);
												break;
											}
					
										}
									
									}	
							}
							
			
									
						
							else if (V1.getHP(1) < V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(1,pok1hp2);
									
									if ((V1.getHP(2) == 0) && (V2.getHP(1) == 0))
									{
										V2.changeHP(1,pok1hp2 + 5);
									}
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(1));
							}
							
						
						
						
						if (V1.getHP(2) < V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(1,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(1));
									System.out.println("");
									winner = V2.getPlayer(1);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									System.out.println("Winner: " + winner);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									AudioPlayer.player.stop(audio);
									break;
									
							}
							
						}
						
						
						else if (V1.getHP(2) > V2.getHP(1) )
						{
							System.out.println ("***************************************************");
							System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
							System.out.println ("***************************************************");
			
							while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
							{
									int pok1hp1 = rn.nextInt(50) + 1;
									V1.changeHP(2,pok1hp1);
									
									int pok1hp2 = rn.nextInt(50) + 1;
									V2.changeHP(2,pok1hp2);
									
									System.out.println("Pokemon 1 HP: " + V1.getHP(2));
									System.out.println("Pokemon 2 HP: " + V2.getHP(2));
									if (V1.getHP(2) > 0 &&  V2.getHP(2) < 0)
									{
										System.out.println("");
										winner = V1.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
									else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
									{
										System.out.println("");
										winner = V2.getPlayer(2);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										System.out.println("Winner: " + winner);
										System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
										AudioPlayer.player.stop(audio);
										break;
									}
									
								}
							
							}
						}
						}
						
			
					
				
	
				
	// SLot 3 ends.............................SLot 3 ends.............................SLot 3 ends.............................SLot 3 ends.............................SLot 3 ends.............................SLot 3 ends.............................
				
					else if (V1.getHP(1) < V2.getHP(0) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(0));
						System.out.println ("***************************************************");
		
						while (V1.getHP(2) > 0 && V2.getHP(0) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(2,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(0,pok1hp2);
								
								if ((V1.getHP(2) == 0) && (V2.getHP(0) == 0))
								{
									V2.changeHP(2,pok1hp2 + 5);
								}
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(2));
								System.out.println("Pokemon 2 HP: " + V2.getHP(0));
						}
						
					
					
		
					
					if (V1.getHP(2) > V2.getHP(0) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
						System.out.println ("***************************************************");
		
						while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(2,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(1,pok1hp2);
								
								if ((V1.getHP(2) == 0) && (V2.getHP(1) == 0))
								{
									V2.changeHP(1,pok1hp2 + 5);
								}
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(2));
								System.out.println("Pokemon 2 HP: " + V2.getHP(1));
						}
						
					
					
					
		
					
					
					if (V1.getHP(2) > V2.getHP(1) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(2));
						System.out.println ("***************************************************");
		
						while (V1.getHP(2) > 0 && V2.getHP(2) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(2,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(2,pok1hp2);
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(2));
								System.out.println("Pokemon 2 HP: " + V2.getHP(2));
								if (V1.getHP(2) > 0 &&  V2.getHP(2) < 0)
								{
									System.out.println("");
									winner = V1.getPlayer(2);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									System.out.println("Winner: " + winner);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									AudioPlayer.player.stop(audio);
									break;
								}
								else if (V1.getHP(2) < 0 &&  V2.getHP(2) > 0)
								{
									System.out.println("");
									winner = V2.getPlayer(2);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									System.out.println("Winner: " + winner);
									System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
									AudioPlayer.player.stop(audio);
									break;
								}
								
						}
						
					}
					
					
					else if (V1.getHP(2) < V2.getHP(1) )
					{
						System.out.println ("***************************************************");
						System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(1));
						System.out.println ("***************************************************");
		
						while (V1.getHP(2) > 0 && V2.getHP(1) > 0)
						{
								int pok1hp1 = rn.nextInt(50) + 1;
								V1.changeHP(2,pok1hp1);
								
								int pok1hp2 = rn.nextInt(50) + 1;
								V2.changeHP(1,pok1hp2);
								
								System.out.println("Pokemon 1 HP: " + V1.getHP(2));
								System.out.println("Pokemon 2 HP: " + V2.getHP(1));
								System.out.println("");
								winner = V2.getPlayer(1);
								System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
								System.out.println("Winner: " + winner);
								System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
								AudioPlayer.player.stop(audio);
								break;	
						}
					}
								
					}
								
					else if (V1.getHP(2) < V2.getHP(0) )
								{
									System.out.println ("***************************************************");
									System.out.println(V1.getPlayer(2) + " \n        Vs \n" + V2.getPlayer(0));
									System.out.println ("***************************************************");
		
									while (V1.getHP(2) > 0 && V2.getHP(0) > 0)
									{
											int pok1hp1 = rn.nextInt(50) + 1;
											V1.changeHP(2,pok1hp1);
											
											int pok1hp2 = rn.nextInt(50) + 1;
											V2.changeHP(0,pok1hp2);
											
											System.out.println("Pokemon 1 HP: " + V1.getHP(2));
											System.out.println("Pokemon 2 HP: " + V2.getHP(0));
											System.out.println("");
											winner = V2.getPlayer(0);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											System.out.println("Winner: " + winner);
											System.out.println ("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
											AudioPlayer.player.stop(audio);
											break;
									}
									
								}
					}

			}
		
			ImageIcon point = null;
			
			if (winner == V1.getPlayer(0))
			{
				
				
				if (pokemon1a == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon1a == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon1a == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon1a == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon1a == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon1a == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon1a == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon1a == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon1a == 9)
				{
					point = new ImageIcon("9.PNG");
				}
				
				String Pokemon1 = V1.getNameandType(pokemon1a);;
				JOptionPane.showMessageDialog(null,"Winner: Player 1\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
			
			
			else if (winner == V1.getPlayer(1))
			{
				if (pokemon2a == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon2a == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon2a == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon2a == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon2a == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon2a == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon2a == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon2a == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon2a == 9)
				{
					point = new ImageIcon("9.PNG");
				}				
				String Pokemon1 = V1.getNameandType(pokemon2a);
				JOptionPane.showMessageDialog(null,"Winner: Player 1\n"+"\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
				
			else if (winner == V1.getPlayer(2))
			{
				if (pokemon3a == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon3a == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon3a == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon3a == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon3a == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon3a == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon3a == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon3a == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon3a == 9)
				{
					point = new ImageIcon("9.PNG");
				}
				String Pokemon1 = V1.getNameandType(pokemon3a);;
				JOptionPane.showMessageDialog(null,"Winner: Player 1\n"+"\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
			
			else if (winner == V2.getPlayer(0))
			{
				if (pokemon1b == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon1b == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon1b == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon1b == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon1b == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon1b == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon1b == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon1b == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon1b == 9)
				{
					point = new ImageIcon("9.jpg");
				}
				String Pokemon1 = V1.getNameandType(pokemon1b);;
				JOptionPane.showMessageDialog(null,"Winner: Player 2\n"+"\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
			else if (winner == V2.getPlayer(1))
			{
				if (pokemon2b == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon2b == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon2b == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon2b == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon2b == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon2b == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon2b == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon2b == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon2b == 9)
				{
					point = new ImageIcon("9.PNG");
				}
				String Pokemon1 = V1.getNameandType(pokemon2b);;
				JOptionPane.showMessageDialog(null,"Winner: Player 2\n"+"\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
			else if (winner == V2.getPlayer(2))
			{
				if (pokemon3b == 1)
				{
					point = new ImageIcon("1.PNG");
				}
				else if (pokemon3b == 2)
				{
					point = new ImageIcon("2.PNG");
				}
				
				else if (pokemon3b == 3)
				{
					point = new ImageIcon("3.PNG");
				}
				else if (pokemon3b == 4)
				{
					point = new ImageIcon("4.PNG");
				}
				else if (pokemon3b == 5)
				{
					point = new ImageIcon("5.PNG");
				}
				else if (pokemon3b == 6)
				{
					point = new ImageIcon("6.PNG");
				}
				else if (pokemon3b == 7)
				{
					point = new ImageIcon("7.PNG");
				}
				else if (pokemon3b == 8)
				{
					point = new ImageIcon("8.PNG");
				}
				else if (pokemon3b == 9)
				{
					point = new ImageIcon("9.PNG");
				}
				String Pokemon1 = V1.getNameandType(pokemon3b);;
				JOptionPane.showMessageDialog(null,"Winner: Player 2\n"+"\n"+Pokemon1, "Winner Box",JOptionPane.INFORMATION_MESSAGE, point);
			}
			
		}
		
		
		
		
	}
}
			
			
			
			
			
			
			


		
		
		
		