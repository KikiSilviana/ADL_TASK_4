import java.util.Iterator;
import java.util.Scanner;

public class BelajarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BelajarArray array = new BelajarArray();
//		array.belajarArray();
		array.latihan1();
		array.latihan2();
	}
		
	public void belajarArray() {
		int [] myarray ; 
		//deklarasi variabelhanya size arraynya saja tanpa isi 
		myarray = new int[10];
		//deklarasi dengan isi dari array 
		int myarray1[]= {3,4,5,6,7,8,9};
		myarray[0]=1;
		myarray[4]=1;
		System.out.println("");
				for (int i = 0; i < myarray.length; i++) {
					System.out.println(myarray[i]+" ");
				}
				System.out.println("\\n\\ print array secara manual");
				for (int angka : myarray1) {
					System.out.println(angka+"");
				}
				
				System.out.println("=======Address Sebelum passing reference=====");
				System.out.println(myarray);
				System.out.println(myarray1);
				myarray = myarray1;
				System.out.println("=======Addres setelah passing reference=====");
				System.out.println(myarray);
				System.out.println(myarray1);
	}
	
	public void latihan1() {
		
		// soal apabila user ingin mengiput nama barang sesuai dengan jumlah barang 
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Masukan jumlah barang :");
		int jml =scan.nextInt();
		String[]barang = new String[jml];
		for (int i = 0; i < barang.length; i++) {
			System.out.println("Masukan nama barang : ");
			barang[i]=scan.next();
		} 
		
		for (String namaBarang : barang) {
			System.out.println(namaBarang);
		}
		
	}
	
	public void latihan2() {
		Scanner scan = new Scanner (System.in);

		System.out.println("Masukan data mahasiswa = :");
		int jml =scan.nextInt();
		String[]namaMhs = new String[jml];
		int[]nilaiMhs = new int	[jml];
		for (int i = 0; i < jml; i++) {
			System.out.println("Masukan nama barang : ");
			namaMhs[i]=scan.next();
			System.out.println("Masukan nama barang : ");
			nilaiMhs[i]=scan.nextInt();
		} 
		
		for (int i = 0; i < jml; i++) {
			System.out.println("Nama : " + namaMhs[i]);
			System.out.println("Nilai : "+ nilaiMhs[i]);
			if(nilaiMhs[i]>=80) {
				System.out.println("Grade A");
//			} else if (nilaiMhs[i]>=)
//			
		}
		}}}

		

	