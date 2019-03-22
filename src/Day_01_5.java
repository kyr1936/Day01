import java.util.Scanner;

public class Day_01_5 {

	public static void main(String[] args) {
		/*int n1 = 10;
		int n2 = 3;
		int r1 = n1/n2;
		int r2 = n1%n2;
		
		System.out.println(r1);
		System.out.println(r2);
		*/
		// 편의점 알바
		// 물건의 합계 금액 입력 : 25640
		// 손님이 낸 돈 입력		: 50000
		// 거스름돈 계산		: 24360
		// 만 원 :2장 천원:4장 백원:3 십원:6
		
		//Scanner sc = new Scanner(System.in);
		
	/*
		System.out.println("물건의 합계 금액을 입력하세요");
		int m1 = sc.nextInt();
		System.out.println("손님이 낸 돈을 입력하세요");
		int m2 = sc.nextInt();
		
		int m3 = m2-m1; //24360
		System.out.println("거스름돈 : " + m3);
		
		int c1 = m3/10000; //2
		int c2 = (m3-c1*10000)/1000; //4
		int c3 = (m3-c1*10000-c2*1000)/100;
		int c4 = (m3-c1*10000-c2*1000-c3*100)/10;
		
		/* int c2 = m3/1000-man*10;
		int c2 = (c1*10000-m3)/1000;
		int c2 = m3%10000/1000;
		
		System.out.println("만원 : " + c1 + "장");
		System.out.println("천원 : " + c2 + "장");
		System.out.println("백원 : " + c3 + "개");
		System.out.println("십원 : " + c4 + "개"); 
		*/

		///////////////////////////////////////////////////
		// 951224-1234567
		// 0->0
		// 1 -> 1
		// 3 -> 3
		// 4 -> 10
		// 5 -> 11
		// 8 -> 20
		// 9 -> 21
		// 10 -> 22
		// 11 -> 23
		int n = 3;
		int result = n/4*10 + n%4;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
