class Search {
	private float[] keys;
	private String[] values;
	private int size = 0;
	Search(int length) {
		keys = new float[length];
		values = new String[length];
	}
	public int rank(final float key) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (keys[mid] < key) {
                low = mid + 1;
            } else if (keys[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
    public void put(final float key, final String value) {
        int i = rank(key);
        if (i < size && keys[i] == key) {
            keys[i] = key;
            values[i] = value;
            return;
        }
        if (size == 0) {
            keys[size] = key;
            values[size] = value;
            size++;
            return;
        }
        for (int j = size; j > i; j--) {
            values[j] = values[j - 1];
            keys[j] = keys[j - 1];
        }
        values[i] = value;
        keys[i] = key;
        size++;
    }
    public boolean contains(final float key) {
        int i = rank(key);
        return keys[i] == key;
    }
    public float floor(final float key) {
        int i = rank(key);
        if (keys[i] == key) {
            return keys[i];
        } else if (i == 0) {
            return 0;
        } else {
            return keys[i - 1];
        }
    }
    public String get(final float key) {
        int i = rank(key);
        if (keys[i] == key) {
            return values[i] + "";
        } else {
            return null;
        }
    }
    public void keys() {
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + " " + values[i]);
        }
    }
    public String max() {
        return values[size - 1] + " " + keys[size - 1];
    }
    public String max(int i) {
        size--;
        return values[size - 1] + " " + keys[size - 1];
    }
    public String min() {
        return values[0] +" "+ keys[0];
    }
    public void deleteMin() {
        for (int j = 0; j < size - 1; j++) {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        keys[size] = 0;
        values[size] = null;
        size--;
    }
}