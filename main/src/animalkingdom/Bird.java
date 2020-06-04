package animalkingdom;

public class Bird extends Animal {

	public Bird(String name, int yearNamed, int energy){
		super(name, yearNamed, energy);
	}

	@Override
	public String move(){
		energy--;
		return "Fly";
	}
	@Override
	public String breathe(){
		return "Lungs";
	}
	@Override
	public String reproduce(){
		energy = energy - 10;
		return "Eggs";
	}
}