package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 13;
		int kalan = sayi & 2;
		
		boolean asalmı = true;
		
		for (int i=2; i<sayi;i++) {
			if(sayi % i==0) {
				asalmı =false;
			}
		}
		
		if(asalmı) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
		

	}

}
