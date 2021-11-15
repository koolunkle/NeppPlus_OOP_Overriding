package Codes;

public class Cat extends Animal {

	@Override
	void eat() {
//		super.eat();
		System.out.println("고양이가 생선을 먹습니다.");
	}

	@Override
	public String toString() {

		String message = "이름 : " + this.name + " , " + "출생연도 : " + this.birthYear;
		return message;

	}

	@Override
	public boolean equals(Object obj) {

		Cat otherCat = (Cat) obj;

		if (this.name == otherCat.name && this.birthYear == otherCat.birthYear) {
			return true;
		} else {
			return false;
		}

	}

}