package polymorphism.exam;

public class Main {
	public static void main(String[] args) {
		Animal[] zoo = {new Animal(),new Dog(),new Cat()};
		
		for(Animal animal : zoo) {
			animal.sound();
		}
		
		AnimalTrainer at = new AnimalTrainer();
		
		at.train(new Dog());
		at.train(zoo[2]);
		
		
		
		
		
		
		
	}
	
	
	
	
}
