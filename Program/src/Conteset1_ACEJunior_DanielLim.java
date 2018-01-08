//Author:DanielLim
import java.util.Scanner;

public class Conteset1_ACEJunior_DanielLim {
	public static void main(String args[]) {
		
Scanner scan = new Scanner(System.in);
		
		String inputLine = scan.nextLine();
		
		
		
		String[] numStr = inputLine.split("[,]");
		
		
		
		// converts numStr[] into int[] num
		

		int[] num = new int[numStr.length];
		
		/**
		 * int num[0] <- Integer.parseInt(numStr[0].trim())
		 * num[1] <- numStr[1]
		 * ...
		 */
		for (int i = 0; i < numStr.length ; i++) {
			// System.out.println(i + " " + numStr[i]);
			//
			num[i] = Integer.parseInt(numStr[i].trim());
			
			
		}
		
		/**
		 * num[0][1][2][3][4][5][6][7][8][9][10]
		 * num[0] --> initial point
		 * num[1] --> playerCard[0]
		 * num[2] --> playerCard[1]
		 * num[3] --> playerCard[2]
		 * num[4, 6, 8, 10] --> playerPick
		 * num[5, 7, 9] --> dealerPick
		 */
		
		int point = 0;
		int[] playerCard = new int[3];
		int downCard = 0;
		// playerPick = even number (i) > 3
		// deelerPick = odd number (i) > 3
		for (int i = 0 ; i < num.length ; i++) {
			
			//System.out.println(num[i]);
			
			// [1] prepares game
			if (i == 0) {
				point = num[i];
			}
			else if (i > 0 && i < 4) {
				playerCard[i-1] = num[i];
			}
			
			// [2] begins game
			else if (i > 3) {
				
				
				
				// even number > 3
				if (i%2 == 0) {
					
					downCard = playerCard[0];
					// check downCard's type
					// according to the card type
					// -- do what it says --> calculate 'point'
					if(downCard==9) {
						point=point+0;
					}
					else if(downCard==4) {
						point=point-10;
					}
					else if(downCard==0) {
						if(point +11 > 99) {
							point = point + 0;
						}
						else {
							point = point + 11;
						}
					}
					else {
						point=point+downCard;
					}
					
					// shift cards
					// playerCard[0] <-- playerCard[1]
					// playerCard[1] <-- playerCard[2]
					// playerCard[2] <-- num[i]
					playerCard[0]=playerCard[1];
					playerCard[1]=playerCard[2];
					playerCard[2]=num[i];
				}
				// odd number > 3
				else if (i%2 == 1) {
					downCard = num[i];
					
					// check downCard's type
					// according to the card type
					// -- do what it says --> calculate 'point'
					if(downCard==9) {
						point=point+0;
					}
					else if(downCard==4) {
						point=point-10;
					}
					else if(downCard==0) {
						if(point+11>99) {
							point=point+1;
						}
						else {
							point=point+11;
						}
					}
					else {
						point=point+downCard;
					}
					
					// checking point
					// -- point > 99 --> lose game
					// -- point < 100 --> continue game (next round / looping)
									}
				
				//System.out.println("point = " + point);
				
				if (point > 99) {
					System.out.println(point + ", DEALER");
					System.exit(0);
				}

				
			} // end of for loop
			//87, 5, 8, 9, 7, 4, 6, 3, 9, 0, 2
			
			
			
		}//
		
		scan.close();
		if (point < 100) {
			System.out.println(point + ", PLAYER");
		}
	}
}
