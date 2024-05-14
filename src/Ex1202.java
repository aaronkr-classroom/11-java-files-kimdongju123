import java.io.File;
import java.io.IOException;

public class Ex1202 {

	public static void main(String[] args) {
		File fileobj = new File("src\\Ex1201.java");//생성자
		
		if(fileobj.exists()) {
			System.out.println("파일의 이름:"+fileobj.getName());
			System.out.println("파일의 경로:"+fileobj.getAbsolutePath());
			System.out.println("파일의 쓰기 가능?"+fileobj.canWrite());
			System.out.println("파일의 읽기 가능?"+fileobj.canRead());
			System.out.println("파일의 크기:"+fileobj.length());
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
		
		
	}

}
