package bt_day4;

public class BaiTap4 {

	public static void main(String[] args) {
		BaiTap4 obj = new BaiTap4();
		obj.inSao();
	}

	public void inSao(){
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				System.out.print("*");
				if(i == j) break;
			}
			System.out.print("\n");
		}
	}
}
