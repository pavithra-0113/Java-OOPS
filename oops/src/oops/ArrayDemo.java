package oops;

public class ArrayDemo {
    public static void main(String[] args) {
    	int abc[];
    	
    	int xyz[]= {10,20,30,40,50};
    	System.out.println("First value"+xyz[0]);
    	System.out.println("Second value"+xyz[1]);
    	System.out.println("-----------");
    	System.out.println("Retrieve value using for loop");
    	System.out.println("Array length:"+xyz.length);
    	for(int i=0;i<xyz.length-1;i++) {
    		System.out.println("value using forloop "+xyz[i]);
    	}
    	System.out.println("-------------");
    	System.out.println("Retrieve using for each loop");
    	for(int n:xyz) {
    		System.out.print(n+" ");
    	}
    	
    }
}
