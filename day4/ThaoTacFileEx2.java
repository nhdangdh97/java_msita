package day4;

import java.io.File;

public class ThaoTacFileEx2 {

	public void fileMethod(String path, String name){
		try {
			//tạo thư mục abc trên ổ đĩa D
			File file = new File("D:/abc/");
			if(file.exists()){
				file.delete();
			} else{
				file.mkdir();
			}
			
			//viết chương trình hiển thị file trong thư mục
			File dir = new File(path); //khởi tạo thư mục đường dẫn chỉ định
			File []files = dir.listFiles(); //lấy về danh sách của thư mục
			
			//duyệt danh sách file trong thư mục bằng vòng lặp for
			for(File f: files){
				if(f.isFile()){ //kiểm tra xem là file hay thư mục
					//f.delete();
					//System.out.println("Đường dẫn: "+f.getPath()+"\nTên file: "+f.getName()+"\n");
					if(f.getName().equals(name)){
						//nếu là file có tên cần tìm thì in thông tin file
						System.out.println("Đường dẫn: "+f.getPath()+"\nTên file: "+f.getName()+"\n");
						break; //thoát vòng lặp và không hiển thị nữa
					}
				} else{
					fileMethod(f.getPath(), name);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		ThaoTacFileEx2 obj = new ThaoTacFileEx2();
		//obj.fileMethod("D:/abc/");
		obj.fileMethod("D:/abc/", "New Microsoft Word Document.docx");
	}

}
