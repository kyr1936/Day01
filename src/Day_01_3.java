
public class Day_01_3 {

	public static void main(String[] args) {
		int num = 10;
		long l = num; // 자동 형변환
		num = (int)l; // 강제 형변환
	
		System.out.println(l);
		
		double d1 = 2.725;
		num = (int)d1;
		
		System.out.println(num);
		
		int r = num+(int)2.2; //  (int)(num+2.2) 같은 데이터 타입끼리 연산
		System.out.println(r);
		
		int kor = 35;
		int eng = 65;
		int math = 10;
		
		int total = kor+eng+math;
		//int avg = total/3;

		double avg = (double)total/3; // total/(double)3; // total/3.0
		
		System.out.println(avg);
		
		char ch = 'B';
		num = ch;
		System.out.println(num);
		
		
	}

}
