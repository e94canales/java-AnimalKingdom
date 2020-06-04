package animalkingdom;

abstract class Animal {
	protected static int maxId = 0;
	protected int id;
	protected String name;
	protected int yearNamed;
	protected int energy;

	public Animal(String name, int yearNamed, int energy){
		maxId++;
		id = maxId;
		this.name = name;
		this.yearNamed = yearNamed;
		this.energy = energy;
	}

	abstract String move();
	abstract String breathe();
	abstract String reproduce();

	protected int getId(){
		return id;
	}
	protected String getName(){
		return name;
	}
	protected int getYear(){
		return yearNamed;
	}
	protected int getEnergy(){
		return energy;
	}
	protected String eat(){
		this.energy = this.energy + 5;
		return name + " just ate and regained some energy. Energy is now: " + energy;
	}

	// @Override
	// public String toString(){
	// 	return "Animal{id=" + id + ", name='" + name + "', yearNamed=" + yearNamed + "}";
	// }

	@Override
	public String toString(){
		return "{" + name + ", id: " + id + ", yearNamed: " + yearNamed + ", moveType: " + move() + ", breatheType: " + breathe() + ", reproduceType: " + reproduce() + "}";
	}

}