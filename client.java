import java.net.*;
import java.io.*;
class client{
	public static void main(String args[]) {
		try {
			Socket s=new Socket("localhost",123);
			//
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello Server here's Client");
			//
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println(str);
			//
			dos.flush();
			dos.close();
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	
	
	
	
	
	
	
	
	
