package day4;

import java.util.Scanner;

public class CauTrucLuaChonExample {

	public static void main(String[] args) {
		String grade;
		System.out.println("Mời bạn nhập loại điểm: ");
		Scanner sc = new Scanner(System.in);
		grade = sc.nextLine();
		switch(grade){
		case "A":
			System.out.println("Xuất sắc!");
			break;
		case "B":
			System.out.println("Tốt");
			break;
		case "C":
			System.out.println("Tạm được");
			break;
		case "D":
			System.out.println("Trung bình");
			break;
		case "F":
			System.out.println("Quá kém");
			break;
		default: System.out.println("Bạn đã nhập sai!");
		}
		System.out.println("Cấp độ của bạn là: "+grade);
	}

}
