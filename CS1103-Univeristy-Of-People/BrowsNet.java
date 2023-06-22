
package example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowsNet {
	public static void main(String[] args)  {
		OutputStream out = null;
		InputStream in = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Input the URL starting with http://");
		String urlString = input.nextLine();
		System.out.println("Input the file name");
		String filename = input.nextLine();
		URL url = null;
		try {
			url = new URL(urlString);
		}catch(MalformedURLException e) {
			System.out.println("Input correct URL");
		}
		try {
			in = url.openStream();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		try {
			out = new FileOutputStream(filename);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			copyStream(in, out);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (in != null) in.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		try {
			if (out != null) out.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	};
	private static void copyStream(InputStream in, OutputStream out)
			throws IOException {
		int oneByte = in.read();
		while (oneByte >= 0) { // negative value indicates end-of-stream
			out.write(oneByte);
			oneByte = in.read();
		}
	}
}
