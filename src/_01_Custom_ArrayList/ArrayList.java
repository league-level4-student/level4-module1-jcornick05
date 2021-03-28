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
		T memberArr2[] = (T[]) new Object[memberArr.length + 1];
		for (int i = 0; i < memberArr.length; i++) {
			memberArr2[i] = memberArr[i];
		}
		memberArr2[memberArr.length] = val;
		memberArr = memberArr2;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > memberArr.length - 1) {
			throw new IndexOutOfBoundsException();
		}
		int counter = 0;
		T memberArr2[] = (T[]) new Object[memberArr.length + 1];
		for (int i = 0; i < memberArr2.length; i++) {
			if (i == loc) {
				memberArr2[loc] = val;
			} else {
				memberArr2[i] = memberArr[counter++];
			}
		}
		memberArr = memberArr2;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		memberArr[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T memberArr2[] = (T[]) new Object[memberArr.length];
		T memberArr3[] = (T[]) new Object[memberArr.length - 1];
		for (int i = 0; i < memberArr2.length; i++) {
			memberArr2[i] = memberArr[i];
		}
		for (int i = 0; i < memberArr2.length; i++) {
			if (i > loc) {
				memberArr2[i - 1] = memberArr2[i];
			}
		}
		for (int i = 0; i < memberArr3.length; i++) {
			memberArr3[i] = memberArr2[i];
		}
		memberArr = memberArr3;
	}

	public boolean contains(T val) {
		for (int i = 0; i < memberArr.length; i++) {
			if (memberArr[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return memberArr.length;
	}
}