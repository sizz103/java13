package iducs.java.b;

public abstract class Mammal implements Animals {
	public abstract void move();
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	public abstract void sound();
	
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� : ��������");
	}

}
