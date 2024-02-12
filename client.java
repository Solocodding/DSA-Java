import java.net.*;
import java.io.*;
class client{
	public static void main(String args[]){
	try{
		Socker s=new Server("localhost",444);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();
		s.close();
		System.out.print("message=",str);
	}
	catch(Exception e){
		System.out.print(e);
	}
	}
}
