package gitPractise;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

ArrayList mylist=new ArrayList();

mylist.add(100);
mylist.add(null);
mylist.add("Welcome");
mylist.add(1.2);
mylist.add(true);
mylist.add(4,"BTS");
System.out.println(mylist);
System.out.println(mylist.size());

for (Object index: mylist)
{
	//System.out.println(index);

	 int retval=mylist.indexOf(index);
     System.out.println(retval+" "+index);
	}
mylist.remove(3);
System.out.println("After remove"+mylist);
}
}
