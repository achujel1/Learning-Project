package calc.files;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NetworkWriting implements FileInterface {

	/* (non-Javadoc)
	 * @see calc.files.FileInterface#fileWriting()
	 * This is an app for getting the files
	 */
	@Override
	public void fileWriting() {
		try {
			URL url = new URL("http://www.delfi.lt");
			InputStream stream = url.openStream();
			BufferedInputStream buf = new BufferedInputStream(stream);

			StringBuilder sb = new StringBuilder();

			while (true) {
				int data = buf.read();

				if (data == -1) {
					break;
				} else {
					sb.append((char) data);
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

	/**
	 * This is a method which is generating a String values out of your specified webpage
	 * 
	 * @param searchedValue - String value of your search
	 * @param url - url of the web page
	 * 
	 */
	public void networkReading(String searchedValue, String url) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(url);

			NodeList list = doc.getElementsByTagName(searchedValue);
			System.out.println("There are " + list.getLength() + " items");

			for (int i = 0; i < list.getLength(); i++) {
				Element item = (Element) list.item(i);
				System.out.println(item.getFirstChild().getNodeValue());
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
