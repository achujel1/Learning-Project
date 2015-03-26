package calc.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA_2_3.portable.OutputStream;

public class NetworkWriting implements FileInterface {

	@Override
	public void fileWriting() {
		try {
			URL url = new URL("http://www.delfi.lt");
			InputStream stream = url.openStream();
			BufferedInputStream buf = new BufferedInputStream(stream);

			StringBuilder sb = new StringBuilder();

			while(true){
				int data = buf.read();

				if (data == -1){
					break;
				}
				else {
					sb.append((char)data);
				}
			}
			
			System.out.println(sb);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
