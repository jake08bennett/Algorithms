public class Algorithms {

	public static void main(String[] args) {
		int[] cards = {2, 13, 9, 11, 13, 4, 6};
		System.out.println(max(cards));
	}


	public static int max (int[] a) {
		int max = a[0];

		for (int x : a) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}
}