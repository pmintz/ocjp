package io;

import java.io.Console;

public class FormattedTable {
	
	void line (Console console){
		console.printf("------------------------------------------------\n");
	}

	void printHeader(Console console){
		console.printf("%-15s \t %s \t %s \t %s \n", "Player", "Matches", "Goals", "Goals per match");
	}
	
	void printRow(Console console, String player, int matches, int goals){
		console.printf("%-15s \t %5d \t\t %d \t\t %.1f \n", player, matches, goals, ((float)goals/(float)matches));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormattedTable ft = new FormattedTable();
		Console console = System.console();
		if(console != null){
			ft.line(console);
			ft.printHeader(console);
			ft.line(console);
			ft.printRow(console, "Mike", 10, 23);
			ft.printRow(console, "Laurie", 5, 1);
			ft.printRow(console, "Dinesh", 1, 1);
			ft.line(console);
			String finish = "finish";
			//console.printf("",finish);
			
			
		}

	}

}
