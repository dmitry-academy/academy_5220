package by.academy.lesson18.classwork;

public class CharacterChanger extends Thread {

	private StringBuilder sb;

	public CharacterChanger(StringBuilder sb) {
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 10; i++) {
				System.out.println(sb + " " + Thread.currentThread().getName());
				sb.append('a');
			}
		}

	}

}
