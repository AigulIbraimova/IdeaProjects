package objectCreations;

public class Apple {
	
        int size;
		String type;
		String color;
		String taste;
		
		
		public void setValues(int sizeValue, String typeValue, String colorValue, String tasteValue) {
			size = sizeValue;
			type = typeValue;
			color = colorValue;
			taste = tasteValue;
			
		}
		
	
		public void info() {
			if(size != 0) {
			System.out.println("Size:" + size);	
			}
			if(type != null) {
				System.out.println("Type:" + type);
			}
			if(color != null) {
				System.out.println("Color:" + color);
			}
			if(taste != null) {
				System.out.println("Taste:" + taste);
			}
		System.out.println("Size:" + size);
		System.out.println("Type:" + type);
		System.out.println("Color:" + color);
		System.out.println("Taste:" + taste);
		
			
	}

}
