import java.net.*;
import java.io.*;
class server{
	public static void main(String args[]){
	try{
		ServerSocket ss=new ServerSocket(444);
		Socket s=ss.accept();
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello server");
		dout.flush();
		dout.close();
		ss.close();
	}
	catch(Exception e){
		System.out.print(e);
	}
	}
}

		
