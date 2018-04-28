//Author: Daniel Lim
import java.util.Scanner;

public class Contest3_ACEjunior_DanielLim {

	public Contest3_ACEjunior_DanielLim() {
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// [1] input map line
		String mapLine = scan.nextLine();
		
		// [2] tokenize map line
		String[] tokens = mapLine.split(", ");
		
		// [3] fill the tokens with 0s
		int len = 0;
		
		for (int t = 0 ; t < tokens.length ; t++) {
		
			len = tokens[t].trim().length();
			
			// System.out.println(t + ":" + tokens[t]);
			
			for (int c = 0 ; c < (4 - len) ; c++) {
				tokens[t] = "0" + tokens[t];
			}
			
		}
		
		// [4] create the map board
		int[][] map = new int[4][4];
		
		// repeat for number of rows (tokens)
		for (int row = 0 ; row < tokens.length ; row++) {
			
			// repeat for number of digits
			for (int col = 0 ; col < 4 ; col++) {
				map[row][col] = Integer.parseInt("" + tokens[row].charAt(col));
			}
			
			// System.out.println(Arrays.toString(map[row]));
			
		}
		
		// [6] input 6 starting points
		String[] start = new String[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			start[i] = scan.nextLine();
		}
		
		// [7] parse the starting points as int walkRow[] and walkCol[]
		int[] walkRow = new int[5];
		int[] walkCol = new int[5];
		String[] strRowCol = null;
		for (int i = 0 ; i < 5 ; i++) {
			strRowCol = start[i].split(", ");
			walkRow[i] = Integer.parseInt(strRowCol[0]) - 1;
			walkCol[i] = Integer.parseInt(strRowCol[1]) - 1;
			
			// System.out.println(walkRow[i] + ", " + walkCol[i]);
		}
		
		// [8] repeat 5 walkers
		
		for (int w = 0 ; w < 5 ; w++) {
			// 1. copy first map to walkMap
			int[][] walkMap = Contest3_ACEjunior_DanielLim.copyMap(map);
			
			// [9] move walker from the starting point
			Contest3_ACEjunior_DanielLim.walk(walkMap, walkRow[w], walkCol[w]);
			// Walker.walk(walkMap, walkRow[0], walkCol[0]);
		}
		
	}
	
	public static int[][] copyMap(int[][] map) {
		int[][] newMap = new int[4][4];
		
		for (int r = 0 ; r < 4 ; r++) {
			for (int c = 0 ; c < 4 ; c++) {
				newMap[r][c] = map[r][c];
			}
		}
		
		return newMap;
	}
	
	public static void walk(int[][] walkMap, int sRow, int sCol) {
		// 0 --> right
		// 1 --> left
		// 2 --> up
		// 3 --> down
		
		int row = sRow;
		int col = sCol;
		int newRow = 0;
		int newCol = 0;
		
		for (int step = 0 ; step < 6 ; step++) {
			
			if(walkMap[row][col] == 0) {
				newRow = row;
				newCol = col + 1;
			}
			else if(walkMap[row][col] == 1) {
				newRow = row;
				newCol = col - 1;
			}
			else if(walkMap[row][col] == 2) {
				newRow = row - 1;
				newCol = col;
			}
			else if(walkMap[row][col] == 3) {
				newRow = row + 1;
				newCol = col;
			}
			
			if (newCol < 0) {
				newCol = newCol + 4;
			}
			else if (newCol > 3) {
				newCol = newCol - 4;
			}
			else if (newRow < 0) {
				newRow = newRow + 4;
			}
			else if (newRow > 3) {
				newRow = newRow - 4;
			}
			
			// System.out.println(row + ", " + col + " : old = " + walkMap[row][col]);
			
			walkMap[row][col] = (walkMap[row][col] + 1) % 4;
			
			// System.out.println(row + ", " + col + " : new = " + walkMap[row][col]);
			
			row = newRow;
			col = newCol;
			
		}
		
		System.out.println((newRow + 1) + ", " + (newCol + 1)); 
	}

}