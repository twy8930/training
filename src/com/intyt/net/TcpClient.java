package com.intyt.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Tcp客户端
 * @author twy
 *
 */
public class TcpClient {
	
	public static void main(String args[]) {
		try {
			//向本机的5051端口发出客户请求
			Socket socket = new Socket("127.0.0.1", 5051);
			//由系统标准输入设备构造BufferedReader对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in,Charset.forName("utf-8")));
			//由Socket对象得到输出流，并构造PrintWriter对象
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			//由Socket对象得到输入流，并构造相应的BufferedReader对象
			BufferedReader is = new BufferedReader(new InputStreamReader(
					socket.getInputStream(),Charset.forName("utf-8")));
			String readline;
			//从系统标准输入读入一字符串
			readline = sin.readLine(); 
			//若从标准输入读入的字符串为 "bye"则停止循环
			while (!readline.equals("bye")) {
				//将从系统标准输入读入的字符串输出到Server
				printWriter.println(readline);
				//刷新输出流，使Server马上收到该字符串
				printWriter.flush();
				//在系统标准输出上打印读入的字符串
				System.out.println("客户端->:" + readline);
				//从Server读入一字符串，并打印到标准输出上
				System.out.println("->服务端:" + is.readLine());
				readline = sin.readLine(); 
			} 
			printWriter.close(); // 关闭Socket输出流
			is.close(); // 关闭Socket输入流
			socket.close(); // 关闭Socket
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
