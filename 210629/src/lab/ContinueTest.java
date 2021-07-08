package lab;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		int total = 0;
		
		for(num = 1; num <= 100; num++) {
			if(num%2==0) { continue; }  // 특정조건을 건너뜀 (제외)  -> 조건문에 부합할경우 건너뜀
			total += num;
		}
		System.out.println("1-100까지 홀수릐 합 : " + total);
	}

}
