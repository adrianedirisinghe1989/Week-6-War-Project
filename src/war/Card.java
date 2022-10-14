package war;

public class Card {

	//1A and 1B.
	 int  value;
	 String name;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("The card name is:"+ this.name);
		System.out.println(" The value of this card is:"+ this.value);
		System.out.println();
	}

	
	
}
