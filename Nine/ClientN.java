package Nine;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientN {
public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost",4564);
			System.out.println("�ͻ������ӳɹ�������");
			OutputStream out  = client.getOutputStream();	
				String nr="��ð�";
				out.write(nr.getBytes());
			client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}