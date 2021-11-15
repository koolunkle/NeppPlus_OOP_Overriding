package Codes;

public class MainDrive {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "바둑이";
		dog1.birthYear = 2015;

		Cat cat1 = new Cat();
		cat1.name = "나옹이";
		cat1.birthYear = 2018;

		Cat cat2 = new Cat();
		cat2.name = "나옹이";
		cat2.birthYear = 2018;

		dog1.eat();
		cat1.eat();

		System.out.println(dog1);
		System.out.println(cat1);

		System.out.println(cat1.equals(cat2));

	}

}
