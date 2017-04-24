package day4;

public class XuLyNgoaiLeExample {

	public static void main(String[] args) {
		XuLyNgoaiLeExample obj = new XuLyNgoaiLeExample();
		float kq = obj.div(5,0);
		System.out.println("Kết quả: "+kq);
	}
	
	public float div(float a, float b){
		try {
			return (a/b);
		} catch (Exception e) {
			//System.out.println("Lỗi chia cho số 0");
			return 0;
		}
	}

}
