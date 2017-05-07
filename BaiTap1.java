package bt_day4;

public class BaiTap1 {

	public static void main(String[] args) {
		int []soHoc = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int s = 0;
		BaiTap1 obj = new BaiTap1();
		System.out.println("Các số chẵn trong mảng vừa cho là: ");
		for(int i: soHoc){
			obj.soChan(i);
		}
		for(int i = 0; i < soHoc.length; i++){
			s = obj.sumSoChan(soHoc[i], s);
		}
		System.out.println("Tổng các số chẵn trong mảng là: "+s);
	}

	public void soChan(int a){
		if((a % 2) == 0) System.out.println(a);
	}
	
	public int sumSoChan(int a, int s){
		if((a%2) == 0) s += a;
		return s;
	}
}
