package files;


import java.io.*;
import java.net.*;

public class Fileclient {

	public static void main(String[] args) throws Exception
	{
		byte []b=new byte[20004];
		Socket sr=new Socket("localhost",6776);
		InputStream is=sr.getInputStream();
		FileOutputStream fr=new FileOutputStream("E:\\kkpatel.txt");
		is.read(b,0,b.length);
		fr.write(b,0,b.length);

	}

}
