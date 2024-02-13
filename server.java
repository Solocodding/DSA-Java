import java.net.*;
import java.io.*;
class server {
	public static void main(String args[]) {
		try {
			
			ServerSocket ss=new ServerSocket(123);
			Socket s=ss.accept();
			//
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println(str);
			//
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hey client how are you");
			//
			dos.flush();
			dos.close();
			ss.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}








