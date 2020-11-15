package q3;

import java.util.Random;

public class matrics {
	public static void main(String[] args) {
		int[] numbers = new int [100];
		for(int i=0;i<100;i++ ) {
			 Random rand = new Random(); 
		     int number = rand.nextInt(1000);
		     
			numbers [i] =  number;
			
		}
		double ort = ortalama(numbers);
		System.out.println("ortalama:"+ort);
	}

	private static double ortalama(int[] dizi) {
		double toplam = 0;
		
		for(int i=0;i<100;i++) {
			toplam = dizi[i];
		}
		return toplam/100;
		
	}
}
