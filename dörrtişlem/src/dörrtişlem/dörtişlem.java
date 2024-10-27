package dörrtişlem;
import java.util.Scanner;
public class dörtişlem {
	public static void main(String args[]) {
		int sayi1,sayi2,işlemler;
		Scanner oku=new Scanner(System.in);
		System.out.println("*********");
		System.out.println("1-toplama");
		System.out.println("2-çıkartma");
		System.out.println("3-çarpma");
		System.out.println("4-bölme");
		System.out.println("*********");
		
		System.out.println("birinci sayıyı giriniz");
		sayi1=oku.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		sayi2=oku.nextInt();
		System.out.println("bir işlem seçin:");
		işlemler=oku.nextInt();
		if(işlemler==1) {
			System.out.println("toplam işleminin sonucu="+(sayi1+sayi2));
		}
		else if(işlemler==2) {
			System.out.println("çıkarma işleminin sonucu="+(sayi1-sayi2));
			
		}
		else if(işlemler==3) {
			System.out.println("çarpma işlemi sonucu="+(sayi1*sayi2));
		}
		else if(işlemler==4) {
			System.out.println("bölme işlemi sonucu="+((double)sayi1/sayi2));
		}
		else {
			System.out.println("tanımsız işlemler");
		}
		//ondalıklı ifade yazan veri tipi nasıl girilir? double dir ifadenn başına yaman gerekir!!
		
		
		
		
		
	}

}
