package ArrayClass;
//import Array.java;

public class driver {
	public static void main(String[] args){
		Array array = new Array(5, 'b');
		Array a = new Array();
		
		a = a.setArrayEqual(array);
		a.resize(10);
		
		try{
			char index = a.get(2);
			System.out.println(index);
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}

}
