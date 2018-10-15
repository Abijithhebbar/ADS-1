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
}