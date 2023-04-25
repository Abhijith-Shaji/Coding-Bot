
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal.x = 1000;
Animal a1 = new Animal();
a1.age = 3;
a1.display();

Animal a2 = new Animal();
a2.name ="Cat";
a2.age= 3;
a2.display();

Animal a3 = new Animal("Elephamt",26);
a3.display();

Animal a4 = new Animal("Tiger",12,"Kaduva");
a4.display();




	}

}