package day4;

public class VongLapExample {

	public static void main(String[] args) {
		String []dsSinhVien = {"A", "B", "C", "D"};
		
		/*//dùng vòng lặp for cách 1: cần tình toán đến chỉ số index
		System.out.println("\nVòng lặp for cách 1");
		for(int i = 0; i < dsSinhVien.length; i++){
			System.out.println("Sinh viên thứ "+i+": "+dsSinhVien[i]);
		}
		
		//dùng vòng lặp for cách 2: không cần tính toán đến chỉ số index
		System.out.println("\nVòng lặp for cách 2");
		for(String objSinhVien: dsSinhVien){
			System.out.println("Sinh viên: "+objSinhVien);
		}*/
		
		//vòng lặp không xác định
		int j = 0;
		while(j < dsSinhVien.length){
			System.out.println("Sinh viên: "+dsSinhVien[j]);
			j++;
		}
	}
}
