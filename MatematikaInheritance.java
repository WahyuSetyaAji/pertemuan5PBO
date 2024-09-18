package tugasp3;

public class MatematikaInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Matematika2 matematika = new Matematika2();

	        int hasilPertambahan = matematika.pertambahan(20, 10);
	        int hasilPengurangan = matematika.pengurangan(10, 5);
	        int hasilPerkalian = matematika.perkalian(10, 3);
	        int hasilPembagian = matematika.pembagian(21, 2); 
	        int hasilModulus = matematika.modulus(21, 2);

	        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
	        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
	        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
	        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
	        System.out.println("Modulus : 21 % 2 = " + hasilModulus);
	}

}
