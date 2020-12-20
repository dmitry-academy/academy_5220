package by.academy.lesson18.producerconsumer.example2;

class Consumer implements Runnable {

	private Store store;

	public Consumer(Store store) {
		this.store = store;
	}

	public void run() {
		for (int i = 1; i < 20; i++) {
			store.get();
		}
	}
}