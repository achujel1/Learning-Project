package calc.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileWriting implements FileInterface{
	public void fileWriting(){
        try {
			File f1 = new File("newFile.txt");
			File f2 = new File("resultFile.txt");	

			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);

			byte[] buf = new byte[1024];
			int len;
			while((len = in.read(buf)) > 0){
			        out.write(buf, 0, len);
			}

			in.close();
			out.close();

			System.out.println("done with file writing");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
