package abstractionDemo;

public interface Interface2 {
	
	int age = 25;
	
	public void test();
	
	default void test2() {
	  //not implemented	
	}

}
