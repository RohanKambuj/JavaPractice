package samplePractice;

public class Base {

    int no1 = 5;
	
	public int getValue() {
		if(no1>10)
		System.out.println(no1);
		return no1;
	}
	
	public void setValue(int no1) {
		if(no1>10) {
		this.no1 = no1;
	  }
	}
}
