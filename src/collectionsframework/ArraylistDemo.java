package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArraylistDemo ad = new ArraylistDemo();
		ad.iterateList();
	}

	public void wrapperexample() {
		int a = 10;
		Integer i1 = new Integer(a);// autoboxing

		int a2 = i1; // unboxing
	}

	public void arrayListBasic() {
		// default size of arraylist is 16 load factor 0.75
		ArrayList<String> li = new ArrayList<>();

		// List<String > li1 = new LinkedList();
		li.add("Test1");
		li.add("Test2");
		li.add("Test3");
		li.add("Test4");

		System.out.println(li);

		System.out.println(li.size());
		li.add(0, "Java");
		System.out.println(li);

		li.set(0, "Python");
		System.out.println(li);

//		li.clear();
//		System.out.println(li);
		ArrayList<String> lio =( ArrayList<String>) li.clone();

		System.out.println(li.contains("Test"));
		System.out.println(li.get(2));
		System.out.println(li.indexOf("Test4"));
		System.out.println(li.lastIndexOf("Test"));
		System.out.println(li.isEmpty());
	//	li.rem
        System.out.println(li.subList(0, 3));

        ArrayList<String> li1 = new ArrayList<>();
        li.add("Test6");
		li.add("Test7");
		li.add("Test8");
		li.add("Test9");
		
		li.addAll(li1);
		System.out.println(li);
		
		System.out.println(lio);
		
		
	}

	public void iterateList() {
		ArrayList<String> li = new ArrayList<>();

		// List<String > li1 = new LinkedList();
		li.add("Test1");
		li.add("Test2");
		li.add("Test3");
		li.add("Test4");
		System.out.println(li);
		
		System.out.println("====Iterate using for loop====");
		for(int i=0; i< li.size(); i++) {
			System.out.print(li.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("====Iterate using while loop====");
		
		int i=0;
		while(i<li.size()) {
			System.out.print(li.get(i)+" ");
			i++;
		}
		System.out.println();
		System.out.println("====Iterate forEach loop====");
		
		for(String ele:li) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		System.out.println("====Iterate using foreach function with lamda operator====");
		
		li.forEach(x->{System.out.print(x+" ");});
		
		System.out.println();
		System.out.println("====Iterate using stream api====");
		
		li.stream().forEach(x->{System.out.print(x+" ");});
		
		System.out.println();
		System.out.println("====Iterate using Iterator====");
		
		Iterator<String> it= li.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println("====Iterate using List Iterator====");
		 ListIterator<String> lit= li.listIterator(li.size());
		 while(lit.hasPrevious()) {
			 System.out.print(lit.previous()+" ");
		 }
		
		
			
	}
}
