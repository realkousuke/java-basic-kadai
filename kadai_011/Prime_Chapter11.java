package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		
		boolean [] primeNumber = new boolean[101];
		
		for( int i = 1; i < primeNumber.length; i++ ) {
			primeNumber[i] = true;
		}
		
		int numberDivide = 2;
		while (numberDivide < primeNumber.length) {
			for(int i = numberDivide + 1; i < primeNumber.length; i++) {
				if( i % numberDivide == 0) {
					primeNumber[i] = false;
					continue;
				}
			}
			
			numberDivide += 1;
		}
		
		for( int i =2; i < primeNumber.length; i++) {
			if (primeNumber[i]) {
				System.out.println(i);
			}
		}
	}
}