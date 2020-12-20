package by.academy.lesson19.harbor;

import java.util.concurrent.atomic.AtomicInteger;

public class _Harbor {
	private AtomicInteger containers = new AtomicInteger();
	private int maximumContainers;

	public _Harbor(int containersInHarbor, int maximumContainers) {
		this.containers.set(containersInHarbor);
		this.maximumContainers = maximumContainers;
	}

	public boolean addContainer() {
		if (containers.get() < maximumContainers) {
			return true;
		} else
			return false;
	}

	public void getContainer() {
		containers.decrementAndGet();
	}

	public void fillContainer() {
		containers.incrementAndGet();
	}

	public boolean hasContainer() {
		return containers.get() > 0;
	}

	public int containersInHarbor() {
		return containers.get();
	}
}
