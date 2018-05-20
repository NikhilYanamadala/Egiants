
public class CustomExceptions extends Exception{
	public CustomExceptions(String string) {
		super(string);
	}
	public static void vote(int age) throws CustomExceptions {
		if(age>18) {
			System.out.println("eligeble for vote");
		}else {
			throw new CustomExceptions("Not eligeble for vote");
		}
	}
public static void main(String[] args) throws CustomExceptions {
	vote(2);
}
}
