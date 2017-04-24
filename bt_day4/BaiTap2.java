package bt_day4;

import java.util.Scanner;

public class BaiTap2 {
	
	public static void main(String[] args) {
		int var;
		System.out.println("Mời bạn nhập 1 số: ");
		Scanner sc = new Scanner(System.in);
		var = sc.nextInt();
		switch (var) {
		case 1:
			System.out.println("Hà Nội");
			break;
		case 2:
			System.out.println("TP. Hồ Chí Minh");
			break;
		case 3:
			System.out.println("Đà Nẵng");
			break;
		default:
			System.out.println("Không phải thành phố trung ương!");
			break;
		}
	}

}
