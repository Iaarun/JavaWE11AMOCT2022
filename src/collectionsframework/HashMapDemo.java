package collectionsframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMapDemo hd = new HashMapDemo();
		hd.hashMapIterate();
	}
	
	public void hashMapIterate() {
HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(101, "Java");
		hmap.put(102, "Ruby");
		hmap.put(103, "JavaScript");
		
		Set<Integer> keys= hmap.keySet();
		for(Integer i: keys) {
			System.out.println(i);
		}
		
		   for(String v: hmap.values()){
			   System.out.print(v+" ");
		   }
		   
		   System.out.println();
		   
		Set<Entry<Integer, String>> entry=   hmap.entrySet();
		for(Entry<Integer, String> x: entry){
			System.out.println (x.getKey()+"|"+x.getValue());
			
		}
		
		hmap.forEach((k, v)->System.out.println(k+"||"+v));
		
		hmap.entrySet().stream().forEach((e)->System.out.println(e.getKey()+"||"+e.getValue()));
		
	    Iterator<Entry<Integer, String>> it= 	hmap.entrySet().iterator();
	    
	    while(it.hasNext()) {
	    	 Entry<Integer, String> entry1=  it.next();
	    	 System.out.println(entry1.getKey()+">>"+entry1.getValue());
	    	
	    }
	}
	
	public void hashMapBasic() {
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(101, "Java");
		hmap.put(102, "Ruby");
		hmap.put(103, "JavaScript");
		
		System.out.println(hmap);
		
		hmap.put(103, "Python");
		System.out.println(hmap);
		
		hmap.putIfAbsent(104, "c++");
		System.out.println(hmap);
		
		hmap.size();
		hmap.isEmpty();
		
		
		System.out.println( hmap.containsKey(104));
		System.out.println( hmap.containsValue("Ruby"));
		
		//hmap.clear();
	  System.out.println(hmap.get(104));
	  
	  hmap.replace(104, "NodeJs");
	  System.out.println(hmap.get(104));
	  
	}

}
