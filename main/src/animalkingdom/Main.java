package animalkingdom;
import java.util.*;

public class Main {

	public static void executeCode(){
		List<Animal> animalList = new ArrayList<>();

		// MAMMALS
		Mammal panda = new Mammal("Panda", 1869, 45);
		Mammal zebra = new Mammal("Zebra", 1778, 35);
		Mammal koala = new Mammal("Koala", 1816, 10);
		Mammal sloth = new Mammal("Sloth", 1804, 1);
		Mammal armadillo = new Mammal("Armadillo", 1758, 10);
		Mammal racoon = new Mammal("Racoon", 1758, 10);
		Mammal bigfoot = new Mammal("Big Foot", 2021, 50);

		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(racoon);
		animalList.add(bigfoot);

		// BIRDS
		Bird pigeon = new Bird("Pigeon", 1837, 15);
		Bird peacock = new Bird("Peacock", 1821, 30);
		Bird toucan = new Bird("Toucan", 1758, 25);
		Bird parrot = new Bird("Parrot", 1824, 30);
		Bird swan = new Bird("Swan", 1758, 20);

		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);

		// FISH
		Fish salmon = new Fish("Salmon", 1758, 10);
		Fish catfish = new Fish("Catfish", 1817, 15);
		Fish perch = new Fish("Perch", 1758, 10);

		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println("\n\n-- animals in descending order by year --");
		animalList.sort(Comparator.comparing(a1 -> a1.getYear(), Comparator.reverseOrder()));

		for (Animal a : animalList){
			System.out.println(a);
		}

		System.out.println("\n\n-- animals alphabetically --");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		for (Animal a : animalList){
			System.out.println(a);
		}

		System.out.println("\n\n-- animals order by how they move --");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		for (Animal a : animalList){
			System.out.println(a);
		}

		System.out.println("\n\n-- animals that breathe with lungs --");
		for (Animal a : animalList){
			if (a.breathe() == "Lungs"){
				System.out.print("\n" + a);
			}
		}

		System.out.println("\n\n-- animals that breathe with lungs and were named in 1758 --");
		for (Animal a : animalList){
			if (a.breathe() == "Lungs" && a.getYear() == 1758){
				System.out.print("\n" + a);
			}
		}

		System.out.println("\n\n-- animals that lay eggs and breathe with lungs --");
		for (Animal a : animalList){
			if (a.breathe() == "Lungs" && a.reproduce() == "Eggs"){
				System.out.print("\n" + a);
			}
		}

		System.out.println("\n\n-- animals that were named in 1758 listed alphabetically --");
		List<Animal> filteredList = new ArrayList<>();
		for (Animal a : animalList){
			if (a.getYear() == 1758){
				filteredList.add(a);
				filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
			}
		}
		for (Animal a : filteredList){
			System.out.print("\n" + a);
		}

		System.out.println("\n\n-- *STRETCH* alphabetically animals that are mammals --");
		for (Animal a : animalList){
			if (a.reproduce() == "Live Birth"){
				System.out.print("\n" + a);
			}
		}
	}

	public static void main(String[] args){
		executeCode();
	}
}