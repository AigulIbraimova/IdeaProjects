package encapsulation;

public class Iphone {
	
	private String model;
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
		if(memory >= 128) {
		this.memory=memory;
		}else {
			System.out.println("Invalid memory");
		}
	}
	
	public void info() {
		System.out.println("Model " + this.model);
		System.out.println("Memory " + this.memory);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
