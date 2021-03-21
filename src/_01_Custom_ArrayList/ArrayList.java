package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] memberArr;

	public ArrayList() {
		memberArr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return memberArr[loc];
	}
	public void add(T val) {
		
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {

	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {

	}

	public void remove(int loc) throws IndexOutOfBoundsException {

	}

	public boolean contains(T val) {

		return false;
	}
}