package lab;

public class GugudanContine {

	public static void main(String[] args) {
		int num;
		int dan;
		
//		for(dan = 1; dan <= 9; dan++) {
//			System.out.println("   "+dan+" ´Ü");
//		for(num = 1; num <= 9; num++) {
//			if(dan < num ){ continue; }
//			System.out.println( " "+dan + " * "+ num + " = " + dan*num);
//			}
//		System.out.println("------------");
		
		num = 1; 
		dan = 1;
		
		while(dan <= 9) {
			System.out.println("   "+dan+" ´Ü");
		while(num <= 9) {
			if(dan < num ) {break;}
			System.out.println( " "+dan + " * "+ num + " = " + dan*num);
			num++;
			}num = 1; dan++;
			System.out.println("------------");
		
		}

	}

}
