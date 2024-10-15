public class operatorbit {
	public static void main(String[] args) {
		// Operator AND Bitwise (&)
		int a = 5;  // 0101 dalam biner
		int b = 3;  // 0011 dalam biner
		int result = a & b;  // Hasilnya 0001 (1 dalam desimal)
		System.out.println("Hasil a & b = " + result);

		// Operator OR Bitwise (|)
		result = a | b;  // Hasilnya 0111 (7 dalam desimal)
		System.out.println("Hasil a | b = " + result);
	}
}