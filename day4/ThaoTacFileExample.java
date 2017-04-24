package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThaoTacFileExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		//copy nội dung file từ D:/java_msita/Info_Teacher.txt sang D:/java_msita/output.txt
		try {
			in = new FileInputStream("D:/java_msita/Info_Teacher.txt");
			out = new FileOutputStream("D:/java_msita/output.txt");
			int c;
			while((c = in.read()) != -1){
				//ghi xuống biên out
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println("File không tồn tại");
		} finally {
			in.close();
			out.close();
		}
	}

}
