package com.intyt.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp服务端
 * @author twy
 *
 */
public class TcpServer {
	
	public static void main(String args[]) {
		try {
			ServerSocket server = null;
			try {
				server = new ServerSocket(5051);
				// 创建一个ServerSocket在端口5050监听客户请求
			} catch (Exception e) {
				System.out.println("无法监听5051端口" + e);
			}
			Socket socket = null;
			try {
				socket = server.accept();
				// 使用accept()阻塞等待客户请求，有客户请求到来则产生一个Socket对象，并继续执行
			} catch (Exception e) {
				System.out.println(e);
			}
			String line;
			BufferedReader is = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			// 由Socket对象得到输出流，并构造PrintWriter对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			// 由系统标准输入设备构造BufferedReader对象
			System.out.println("客户端:" + is.readLine());
			// 在标准输出上打印从客户端读入的字符串
			line = sin.readLine();
			// 从标准输入读入一字符串
			while (!line.equals("bye")) {
				// 如果该字符串为 "bye"，则停止循环
				printWriter.println(line);
				// 向客户端输出该字符串
				printWriter.flush();
				// 刷新输出流，使Client马上收到该字符串
				System.out.println("服务端:" + line);
				// 在系统标准输出上打印读入的字符串
				System.out.println("客户端:" + is.readLine());
				// 从Client读入一字符串，并打印到标准输出上
				line = sin.readLine();
				// 从系统标准输入读入一字符串
			}// 继续循环
			printWriter.close(); // 关闭Socket输出流
			is.close(); // 关闭Socket输入流
			socket.close(); // 关闭Socket
			server.close(); // 关闭ServerSocket
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
