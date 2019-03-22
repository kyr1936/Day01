import java.util.Scanner;

public class Day_01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 키보드 입력 대기
		/*System.out.println("이름을 입력하세요");
		String name = sc.next(); // 이름 입력
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("Your Name : " + name);
		System.out.println("Your Age : " + age); */
		
		//////////////////////////////////
		
		// 희망 월급을 입력받기
		// 국민연금 : 0.3% 
		// 고용보험 : 0.5%
		// 의료보험 : 2%
		// 산재보험 : 1.2%
		
		// 각 세금의 금액 
		// 총 세금의 합계
		// 실 수령액
		
		System.out.println("희망 월급을 입력하세요");
		int pay = sc.nextInt();
		System.out.println(pay);
		
		double t1 = (pay*0.003);
		double t2 = (pay*0.005);
		double t3 = (pay*0.02);
		double t4 = (pay*0.012);
		
		
		System.out.println("국민연금 : " + t1 + "원");
		System.out.println("고용보험 : " + t2 + "원");
		System.out.println("의료보험 : " + t3 + "원");
		System.out.println("국민연금 : " + t4 + "원");
		
		double total = t1+t2+t3+t4;
		System.out.println("총 세금의 합계 : " + total + "원");
		
		double p = pay-total;
		System.out.println("실 수령액 : " + p + "원");
		  
		
		
		
		
		
		
	}

}
