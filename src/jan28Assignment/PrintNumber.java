package jan28Assignment;

public class PrintNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				System.out.println(i+"abc");
			}
		}
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.println(i+"def");
			}
		}
		for(int i=1;i<=50;i++) {
			if(i%10==0) {
				System.out.println(i+"abcdef");
			}
		}
	}
}
