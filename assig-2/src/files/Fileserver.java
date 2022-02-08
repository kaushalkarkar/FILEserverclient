package files;


import java.io.*;
import java.net.*;

public class Fileserver {
      
	    public static void main(String[] args) throws Exception
	    {
	    	 ServerSocket s=new ServerSocket(6776);
	    	 Socket sr=s.accept();
	    	 FileInputStream fr=new FileInputStream("D:\\kaushal.txt");
	    	 byte b[]=new byte[2004];
	    	 fr.read(b, 0, b.length);
	    	 OutputStream os=sr.getOutputStream();
	    			 os.write(b, 0, b.length);
	    }
}
