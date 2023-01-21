package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSetDemo hd = new HashSetDemo();
		hd.hashSetIterate();
	}
	
	public void hashSetIterate() {
		HashSet<String> hset = new HashSet<>();
		//	Set<String> hset = new TreeSet<>();
			
			
			hset.add("Test2");
			hset.add("Test3");
			hset.add("Test4");
			hset.add("Test5");
			hset.add("Test1");
			
			System.out.println("Iterate using enahnced for loop");
			for(String x: hset) {
				System.out.print(x+" ");
				
			}
			
			System.out.println();
			System.out.println("Iterate using foreach ");
			
			hset.forEach(x->{System.out.print(x+ " ");});
			
			System.out.println();
			System.out.println("Iterate using streams ");
			
			hset.stream().forEach(x->{System.out.print(x+ " ");});
			
			System.out.println();
			System.out.println("Iterate using Iterator");
			
			Iterator<String> it =  hset.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
		
			
			
			
		
	}
	
	public void hashsetbasic() {
		HashSet<String> hset = new HashSet<>();
	//	Set<String> hset = new TreeSet<>();
		
		
		hset.add("Test2");
		hset.add("Test3");
		hset.add("Test4");
		hset.add("Test5");
		hset.add("Test1");
		
		System.out.println(hset);
		hset.size();
		hset.isEmpty();
		hset.addAll(hset);
		
		hset.contains("Test2");
		String [] obj= (String[])hset.toArray();
		
		HashSet<String> nset = new HashSet<>(Arrays.asList(obj));
		
		//14, 15 ,61, 15
	}

}
