package model;

public class koongDTO {
	private String id;
	private int num;
	private String name;
	private int power;
	
	public koongDTO(String id, int num, String name, int power) {
		
		this.id = id;
		this.num = num;
		this.name = name;
		this.power = power;
		
	}

	public String getId() {
		return id;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

}
