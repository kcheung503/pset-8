public class Exercises {

/*
** Exercise 1
*/

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		} else if(a.length < 1 || b.length < 1) {
			return false;
		} else if(a[0] == b[0]) {
			return true;
		} else if(a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}
		return false;	// default return value to ensure compilation
	}

	/*
	** Exercise 2
	*/

	public String[] endsMeet(String[] values, int n) {
		String[] empty = new String[0];
			if(values == null) {
				return empty;
			} else if(values.length < n) {
				return empty;
			} else if(n < 0) {
				return empty;
			}
			String[] a = new String[(2 * n)];
			for(int i = 0; i < n; i ++) {
				a[i] = values[i];
				a[a.length - i] = values[values.length - i];
				}
				return a;
	}
		return null;	// default return value to ensure compilation
	}

	/*
	** Exercise 3
	*/

	public int difference(int[] numbers) {
		if(numbers == null) {
			return 1/0;
		} else if(numbers.length < 1) {
			return 1/0;
		}
		int max = numbers[0];
		int mininum = numbers[0];

		return -1;		// default return value to ensure compilation
	}

	/*
	** Exercise 4
	*/

	public double biggest(double[] numbers) {


		return -1;		// default return value to ensure compilation
	}

	/*
	** Exercise 5
	*/

	public String[] middle(String[] values) {


		return null;	// default return value to ensure compilation
	}

	/*
	** Exercise 6
	*/

	public boolean increasing(int[] numbers) {


		return false;	// default return value to ensure compilation
	}

	/*
	** Exercise 7
	*/

	public boolean everywhere(int[] numbers, int x) {


		return false;	// default return value to ensure compilation
	}

	/*
	** Exercise 8
	*/

	public boolean consecutive(int[] numbers) {


		return false;	// default return value to ensure compilation
	}

	/*
	** Exercise 9
	*/

	public boolean balance(int[] numbers) {


		return false;	// default return value to ensure compilation
	}

	/*
	** Exercise 10
	*/

	public int clumps(String[] values) {


		return -1;		// default return value to ensure compilation
	}
}
