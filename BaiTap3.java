package bt_day4;

import java.io.File;
import java.io.FileWriter;

public class BaiTap3 {
	
	public static void main(String[] args) {
		try {
			File f = new File("D:/java_msita/laptrinh.txt");
			FileWriter fw = new FileWriter(f);
			
			fw.write("Nguyễn Hữu Đang");
			fw.close();
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
