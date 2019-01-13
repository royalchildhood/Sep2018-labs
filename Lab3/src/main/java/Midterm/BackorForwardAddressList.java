package Midterm;

import java.util.ArrayList;

public class BackorForwardAddressList {
	private ArrayList<String> history;
	private int currentSize;
	private int lastVisitIndex;

	public BackorForwardAddressList() {
		history = new ArrayList<String>();
		currentSize = 0;
		lastVisitIndex = -1;
	}

	public void visited(String webAddress) {
		if (currentSize < 10) {
			history.add(webAddress);
			currentSize++;
			lastVisitIndex++;
		} else {
			history.remove(0);
			history.add(webAddress);
		}
	}

	public String forward() {
		if (lastVisitIndex >= 0) {
			return history.get(lastVisitIndex--);
		} else {
			return "no more history to go to";
		}
	}

	public String backward() {
		if (lastVisitIndex <= 9) {
			return history.get(lastVisitIndex++);
		} else {
			return "no more history to go to";
		}
	}
}
