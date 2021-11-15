package Codes;

public class Dog extends Animal {

	@Override
	void eat() {
//		super.eat(); // Animal이 물려준 내용을 그대로 실행 
		System.out.println("개가 사료를 먹습니다.");
	}

	@Override
	public String toString() {

		String message = this.name + " / " + this.birthYear;
		return message;

	}

}
