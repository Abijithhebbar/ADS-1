class Check {
	LinkedList list = new LinkedList();
	public static LinkedList refer(LinkedList list1, LinkedList list2) {
		LinkedList result = new LinkedList();
		int a, b = 0, c = 0;
		final int ten = 10;
		while (!list1.isEmpty()) {
			while (!list2.isEmpty()) {
				a = list1.pop() + list2.pop() + b;
				c = a % ten;
				result.push(c);
				b = a / ten;
			}
		}
		if (c > 0) {
			result.push(c);
		}
		return result;
	}
	public static LinkedList refer(LinkedList list1, LinkedList list2, int size) {
		LinkedList result = new LinkedList();
		int a, b = 0, c = 0, len = list2.size();
		final int ten = 10;
		while (len != 0) {
			a = list1.pop() + list2.pop() + b;
			c = a % ten;
			result.push(c);
			b = a / ten;
			len--;
		}
		while (size != 0) {
			a = list1.pop() + b;
			c = a % 10;
			result.push(c);
			b = a / 10;
		}
		if (c > 0) {
			result.push(c);
		}

		return result;

	}
	public static LinkedList refer(LinkedList list1, LinkedList list2, int size, int k) {
		LinkedList result = new LinkedList();
		int a, b = 0, c = 0;
		final int ten = 10;
		while (k != 0) {
			a = list1.pop() + list2.pop() + b;
			c = a % ten;
			result.push(c);
			b = a / ten;
			k--;
		}
		while (size != 0) {
			a = list2.pop() + b;
			c = a % 10;
			result.push(c);
			b = a / 10;
		}
		if (c > 0) {
			result.push(c);
		}

		return result;
	}
}