package bt_day4;

public class BaiTap5 {
	
	public static void main(String[] args) {
		BaiTap5 obj = new BaiTap5();
		int []soHoc = {1,2,3,4,5,6,7,8,9};
		for(int a: soHoc){
			for(int b: soHoc){
				for(int c: soHoc){
					obj.sumMang(a, b, c);
				}
			}
		}
	}

	public void sumMang(int a, int b, int c){
		if((a + b == c) && (a <= b)) System.out.println("Tổng của "+a+" và "+b+" là: "+c);
	}
}
