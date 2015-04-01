package calc.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;

public class FileWriting implements FileInterface{
	/* (non-Javadoc)
	 * @see calc.files.FileInterface#fileWriting()
	 * This is an app
	 */
	public void fileWriting(){
        try {
			File f1 = new File("newFile.txt");
			File f2 = new File("resultFile.txt");	

			FileUtils.copyFile(f1, f2);

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
