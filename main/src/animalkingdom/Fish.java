package animalkingdom;

public class Fish extends Animal {

	public Fish(String name, int yearNamed, int energy){
		super(name, yearNamed, energy);
	}

	@Override
	public String move(){
		energy--;
		return "Swim";
	}
	@Override
	public String breathe(){
		return "Gills";
	}
	@Override
	public String reproduce(){
		energy = energy - 10;
		return "Eggs";
	}
}