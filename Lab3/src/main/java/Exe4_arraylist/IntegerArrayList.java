package Exe4_arraylist;

public class IntegerArrayList {

	// monitor the current array size
	private int currentSize;
	private int totalArraySize = 20;
	private Integer[] store;

	public IntegerArrayList(){
		currentSize = 0;
		store = new Integer[totalArraySize];
	}

	public void add(Integer input) {
		if (currentSize < totalArraySize) {
			store[currentSize] = input;
			// Don't forget increment the size
			currentSize++;
		} else {
			// expending the current array x 2
			totalArraySize *= 2;
			Integer[] newStore = new Integer[totalArraySize];
			// COPY all elements in old store to new
			for (int i = 0; i < store.length; i++) {
				newStore[i] = store[i];
			}
			// Assign old store to new
			store = newStore;
			// add the new element
			store[currentSize] = input;
			// Don't forget increment the size
			currentSize++;
		}
	}

	public void remove(int index) {
		if (index > currentSize || index < 0) {
			System.out.println("Invalid index");
		} else {
			store[index] = null;
			for (int i = index; i < currentSize - 1; i++) {
				store[i] = store[i+1];
			}
			store[currentSize - 1] = null;
			// Don't forget decrement the size
			currentSize--;
		}

		if (totalArraySize > 20 && currentSize < totalArraySize/2) {
			// shrink the current array to half
			totalArraySize /= 2;
			Integer[] newStore = new Integer[totalArraySize];
			// COPY all elements in old store to new
			for (int i = 0; i < newStore.length; i++) {
				newStore[i] = store[i];
			}
			// Assign old store to new
			store = newStore;
		}

	}

	public Integer get(int index) {
		return store[index];
	}

	public int getCurrentSize() {
		return currentSize;
	}
}
