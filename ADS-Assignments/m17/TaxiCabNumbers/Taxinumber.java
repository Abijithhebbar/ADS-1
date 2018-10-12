class Taxinumber {
	Taxinumber() {

	}
	public void get(int num, int num2) {
		int sum = 0, sumCheck = 0, count = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 2; j < 1000; j++) {
				sum = i * i * i + j * j * j;
				for (int k = 0; k < 1000; k++) {
					if (k != i) {
						for (int l = 0; l < 1000; l++) {
							if ( l != j) {
								sumCheck = k * k * k + l * l * l;
							}
							if (sum == sumCheck) {
								count++;
							}
							if (count == num2) {
								System.out.println(sum);
							}
						}
					}
				}
			}
		}
	}
}