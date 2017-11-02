import java.util.Scanner;

public class Program30 {
	public static void main(String args[]) {
		int year;
		int month;
		int day;
		int second;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the year you lived: ");
		year = scanner.nextInt();
		
		System.out.print("Enter the month you lived: ");
		month = scanner.nextInt();
		
		System.out.print("Enter the days you lived: ");
		day = scanner.nextInt();
		
		////////////////////////////////////////////////////////////// 년
		year = year * 12; // 년 -> 달
		if (year%2 > 0) {
			year = (year / 2) * 61 + 31;  // 달 -> 일
		}
		
		else {
			year = (year/2 * 61);  
		}
		
		year = year * 24; //일 -> 시간
		year = year * 60; // 시간 -> 분
		year = year * 60; //분 -> 초
		////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////// 달
		
		if (month%2 > 0) {
			month = (month/2) * 61 + 31; // 달 -> 일
		}
		
		else {
			month = (month/2) * 61; 
		}
		
		month = month * 24;
		month = month * 60;
		month = month * 60;
		/////////////////////////////////////////////////////////////// 
		
		/////////////////////////////////////////////////////////////// 일
		
		day = day * 24;
		day = day * 60;
		day = day * 60;
		
		////////////////////////////////////////////////////////////////
		
		second = year + month + day;
		
		System.out.println("you lived total " + second + " seconds");
	}
	

}
