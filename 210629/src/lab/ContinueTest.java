package lab;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		int total = 0;
		
		for(num = 1; num <= 100; num++) {
			if(num%2==0) { continue; }  // Ư�������� �ǳʶ� (����)  -> ���ǹ��� �����Ұ�� �ǳʶ�
			total += num;
		}
		System.out.println("1-100���� Ȧ���l �� : " + total);
	}

}
