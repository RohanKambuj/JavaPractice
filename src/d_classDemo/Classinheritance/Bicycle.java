
package d_classDemo.Classinheritance;

 public class Bicycle {// implements Comparable{//only public or package private
	/*

	 In general, class declarations can include these components, in order:
    - Modifiers such as public, private.
    - The class name, with the initial letter capitalized by convention.
    - The name of the class's parent (superclass), if any, preceded by 
    the keyword extends. A class can only extend (subclass) one parent.
    - A comma-separated list of interfaces implemented by the class, if any, 
    preceded by the keyword implements. A class can implement more than one 
    interface.
    - The class body, surrounded by braces, {}.
	
	There are several kinds of variables:

    - Member variables in a class葉hese are called fields, instance var,.
    - Variables in a method or block of code葉hese are called local variables.
    - Variables in method declarations葉hese are called parameters.
	
	Access Modifiers:
	- Private
	- Public
	- Protected


	 */
	
	
	
    // the Bicycle class has
    // three fields
    private int cadence=20;//4
    private int speed;//5   
    private int gear;//6
    
    
     
   // private static int nb;
   // int originalSpeed;
        
    // the Bicycle class has
    /* two constructors (also serves an example of overload. 
    Overload cannot be with same method and signatures and different 
    return types. 
    // For overload signaure has to be different)
     
     */
    //public Bicycle(int cadence, String startSpeed, int startGear) {
    //public Bicycle(int startGear, String startSpeed, int cadence) {
    //public Bicycle(String cadence, int startSpeed, int startGear) {	
    //public Bicycle(int cadence, int startGear)
    //public Bicycle(int speed, int startGear)
    //public Bicycle(int startSpeed, int cadence, int startGear)
    
    
    //Bicycle (2,5,7),Bicyle(2,"34", 4)  Bicycle("3",4,2) Bicycle(6,3)
 // public Bicycle(int speed, int startCadence, int startGear) {
 //}
  /*  public Bicycle(int startSpeed, int startGear, int cadence) {
    }*/
   // Bicyle(4,5,6)
    //int sum
    //Scanner sc = new Scanner(System.in);
    //Bicycle bike1 = new Bicycle(4,6,7);
    //Bicycle bike1 = new Bicycle(3,4);
    //Bicycle bike1 = new Bicycle();
    //public Bicycle(int gear, int startSpeed, int cadence) {
    public Bicycle(int cadence1, int startSpeed, int gear) {//c=4, ss=5, g = 6
        
    //	int cadence;
    	
    	System.out.println( this.cadence + "-" + this.speed + "-" + this.gear );//20-0-0
    	this.gear = gear;//7
        this.cadence = cadence1;//4
        this.speed = startSpeed;//6
    	System.out.println(this.cadence + "-" + this.speed + "-" + this.gear);//
    }
    
    
   //public getAccountAccess(int pin) {
    // if (pin == adkadasa)


	//public Bicycle(String gear, int cadence) Bicycle(11,23)
    /*public Bicycle(int speed, int startGear) {
    	oldSpeed = 10;
    	startCadence = 15;
    	this.speed = speed;
    	gear = startGear;
    	cadence = 30;
    //	nb++;
    }*/
 //   public int Bicycle(int handleSize, int brakeValue)
    
    //public Bicycle(int gear, int cadence) Bicycle(11,23)
	public Bicycle(int speed, int startGear) {
		this.speed = speed;
		gear = startGear;
		cadence = 30;
	}





	public Bicycle() {
        gear = 1;
        cadence = 10;
        speed = 0;
    }
    
    
    
    /*
     * public Bicycle(String startSpeed,int cadence, int startGear) {
     * 	gear = 3;
     * cadence = 5;
     * speed = 50
     * }
     * 
     */
    
   
    
    // the Bicycle class has
    // four methods
    
    /*
     * 	More generally, method declarations have six components, in order:

    - Modifiers耀uch as public, private.
    - The return type葉he data type of the value returned by the method,
     or void if the method does not return a value.
    - The method name葉he rules for field names apply to method names as well, 
    but the convention is a little different.
    - The parameter list in parenthesis預 comma-delimited list of input 
    parameters, preceded by their data types, enclosed by parentheses, (). 
      If there are no parameters, you must use empty parentheses.
    - An exception list
    - The method body, enclosed between braces葉he method's code, 
    including the declaration of local variables, goes here.

     */
   // public void setGear(int newValue
	//bike1.setCadence(30)
    public void setCadence(int cadence)  {
       if (cadence <= 250)
    	this.cadence = cadence;
    }
    
    public int getCadence()
    {
    	//authenticate user
    	
    	return   cadence;
    //	int i;
    }
    
    public int getGear() {
   // 	originalSpeed = 10;
  		return gear;
  	} 
    
    //setGear(20);
    public void setGear(int newValue) {
    	int originalSpeed=0;//local variable inside setGear()
    	System.out.println(originalSpeed);
        if (newValue<=7)
    	  gear = newValue;
    }
    
    //applyBrake(10);    
    public void applyBrake(int decrement) {
        int originalSpeed;
    	speed -= decrement;//40
        originalSpeed = 10;
      //  increment = 15;
    }
    
   // abstract public void applyBrake1(int decrement);
   // originalSpeed = 10;
    //speedUp(5)
    public void speedUp(int increment) {
    
    	int originalSpeed;
        originalSpeed = speed;
 //       this.originalSpeed = originalSpeed;
    	speed += increment;
    	if (speed > 50)
    	{
    		speed = originalSpeed;
    	}
    }
    
   



	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
    */
}
        