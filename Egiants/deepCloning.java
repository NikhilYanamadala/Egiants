package Egiants;

class Dog1{
	int d=10;

	public Dog1(int d) {
		this.d = d;
	}

	public Dog1() {
		// TODO Auto-generated constructor stub
	}
	
}
public class deepCloning implements Cloneable {
int i=20;
 Dog1 dog;
 
public deepCloning(Dog1 dog) {

	this.dog = dog;
}



@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	//return super.clone();
	return new deepCloning(new Dog1());
}

public static void main(String[] args) throws CloneNotSupportedException {
	 Dog1 dog = new Dog1();
	deepCloning sh = new deepCloning(dog);
	System.out.println("details of sh(before cloning )"+sh.i+"..."+sh.dog.d);
	deepCloning shCopy = (deepCloning)sh.clone();
	shCopy.i=30;
	shCopy.dog.d=40;
	System.out.println("details of sh(after cloning )"+sh.i+"..."+sh.dog.d);
	System.out.println("details of shCopy(after cloning )"+shCopy.i+"..."+shCopy.dog.d);

}
}
