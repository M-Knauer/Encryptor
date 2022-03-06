package encrypt;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the phrase you want to encrypt: ");
		String s = sc.nextLine();
		
		sc.close();
		
		s = s.replace(" ", "");
		int t = (int) Math.ceil(Math.sqrt(s.length()));
		String[][] grid = new String[t][t];
		
		int begin = 0;
		int end = 1;
		for (int l = 0; l < grid.length; l++) {
			for (int c = 0; c < grid.length; c++) {
				if(begin < s.length()) {
					grid[l][c] = s.substring(begin, end);
					begin++;
					end++;
				}
				else {
					grid[l][c] = s.substring(0, 0);
				}
				
			}
		}
		
		System.out.print("Encrypted: ");
		for (int l = 0; l < grid.length; l++) {
			for (int c = 0; c < grid.length; c++) {
				System.out.print(grid[c][l]);
			}
			System.out.print(" ");
		}
		
		System.out.println();
		
	}
}
