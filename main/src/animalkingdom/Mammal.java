package animalkingdom;

public class Mammal extends Animal {

	public Mammal(String name, int yearNamed, int energy){
		super(name, yearNamed, energy);
	}

	@Override
	public String move(){
		energy--;
		return "Walk";
	}
	@Override
	public String breathe(){
		return "Lungs";
	}
	@Override
	public String reproduce(){
		energy = energy - 10;
		return "Live Birth";
	}
}
