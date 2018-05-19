package Egiants;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class Student{
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
		this.StdId=i;
		this.StdName=string;
	}
	int StdId;
	String StdName;
}
public class References {
	public void strongRefernce() {
		Student s= new Student(101,"ABC");
		//System.gc();
		System.out.println(s);
	}
	public void weakRefernce() {
		Student s= new Student(101,"ABC");
		WeakReference<Student> w= new WeakReference<Student>(s);
		System.out.println(w.get());
		s=null;
		System.gc();
		System.out.println(w.get());
		
	}
	public void softRefernce() {
		Student s= new Student(101,"ABC");
		SoftReference<Student> w= new SoftReference<Student>(s);
		System.out.println(w.get());
		s=null;
		System.gc();
		System.out.println(w.get());
		
	}
    public void phantomReference() throws InterruptedException
    {
           Student s= new Student(101,"ABC");
           ReferenceQueue<Student> queue = new ReferenceQueue<Student>();
           PhantomReference<Student> ex = new PhantomReference<Student>(s,queue);
           System.gc();
           System.out.println("Phantom reference deleted  after");
           System.out.println(ex.get());
    }

public static void main(String[] args) throws InterruptedException {
	References r= new References();
	//r.strongRefernce();
	//r.weakRefernce();
	//r.softRefernce();
	r.phantomReference();
}
}
