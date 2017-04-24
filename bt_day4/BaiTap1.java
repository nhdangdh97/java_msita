package bt_day4;

public class BaiTap1 {

	public static void main(String[] args) {
		int []soHoc = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		BaiTap1 obj = new BaiTap1();
		System.out.println("Các số chẵn trong mảng vừa cho là: ");
		for(int i: soHoc){
			obj.soChan(i);
		}
	}

	public void soChan(int a){
		if((a % 2) == 0) System.out.println(a);
	}
}
