package de.danielrajic.controller;

import de.danielrajic.model.Coach;
import de.danielrajic.model.Goalkeeper;
import de.danielrajic.model.MatchLeagueModus;
import de.danielrajic.model.Player;
import de.danielrajic.model.Team;



public class FootballGameDemo {

	public static void main(String[] args) {
		//Mannschaft 1:
		
				Coach c1 = new Coach("Jupp Heynckes",68,10);
				Goalkeeper gk1 = new Goalkeeper("M.Neuer",27,9,5,10,10,10);
				
				Player [] players = new Player [10];
				
				players[0] = new Player ("Dante", 28, 9, 7, 10);
				players[1] = new Player ("P.Lahm",28,9,6,8);
				players[2] = new Player ("Badstuber",23,8,6,10);
				players[3] = new Player ("D.Alaba",19,10,8,7);
				players[4] = new Player ("B.Schweinsteiger",28,8,9,10);
				players[5] = new Player ("J.Martinez",23,9,7,8);
				players[6] = new Player ("F.Ribery",29,10,10,9);
				players[7] = new Player ("T.Mueller",22,7,9,8);
				players[8] = new Player ("T.Kroos",23,8,9,6);
				players[9] = new Player ("M.Mandzukic",25,9,9,8);
				
				//Mannschaft 2: 
				
				Coach c2 = new Coach("Jürgen Klopp",45,7);
				Goalkeeper gk2 = new Goalkeeper("R.Weidenfeller",31,7,5,10,7, 5);
				
				Player [] players2 = new Player [10];
				
				players2[0] = new Player ("M.Hummels", 23, 8, 7, 10);
				players2[1] = new Player ("N.Subotic",29,6,6,10);
				players2[2] = new Player("M.Schmelzer",21,5,7,10);
				players2[3] = new Player ("L.Piszcek",23,6,8,6);
				players2[4] = new Player ("S.Kehl",31,7,7,9);
				players2[5] = new Player ("I.Gündogan",21,9,9,8);
				players2[6] = new Player ("M.Götze",20,10,6,10);
				players2[7] = new Player ("M.Reus",23,7,10,8);
				players2[8] = new Player("J.Blaszczykowski",25,7,8,6);
				players2[9] = new Player ("R.Lewandowski",25,10,10,9);
				
				Team m1 = new Team ("Fc Bayern München",c1, gk1,players);
				Team m2 = new Team("BV Borussia 09 Dortmund", c2,gk2,players2);
				
				MatchLeagueModus l1 = new MatchLeagueModus();
				
				System.out.println("----------------------");
				System.out.println("Start des Freundschaftsspiel zwischen");
				System.out.println();
				System.out.println(m1.getName());
				System.out.println("Trainer: "+ m1.getCoach().getName());
				System.out.println();
				System.out.println("  und  ");
				System.out.println();
				System.out.println(m2.getName());
				System.out.println("Trainer: "+ m2.getCoach().getName());
				System.out.println("----------------------");
				
				l1.startGame(m1, m2);
				
				System.out.println();
				System.out.println("----------------------");
				System.out.println(l1.getResultText());
				System.out.println("----------------------");

	}

}
