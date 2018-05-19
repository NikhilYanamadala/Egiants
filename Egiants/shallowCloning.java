package Egiants;
class Dog{
	int d;

	public Dog(int d) {
		this.d = d;
	}
	
}
public class shallowCloning implements Cloneable {
int i=20;
 Dog dog;
 
public shallowCloning(int i, Dog dog) {
	this.i = i;
	this.dog = dog;
}

public static void main(String[] args) throws CloneNotSupportedException {
	 Dog dog = new Dog(10);
	shallowCloning sh = new shallowCloning(20,dog);
	System.out.println("details of sh(before cloning )"+sh.i+"..."+sh.dog.d);
	shallowCloning shCopy = (shallowCloning)sh.clone();
	shCopy.i=30;
	shCopy.dog.d=40;
	System.out.println("details of sh(after cloning )"+sh.i+"..."+sh.dog.d);

}
}
