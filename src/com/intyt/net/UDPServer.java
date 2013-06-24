package com.intyt.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP服务器端
 * @author twy
 *
 */
public class UDPServer {
	
	public static void main(String[] args)throws IOException{
        DatagramSocket  server = new DatagramSocket(5050);
        byte[] recvBuf = new byte[100];
        DatagramPacket recvPacket 
            = new DatagramPacket(recvBuf , recvBuf.length);
        System.out.println("服务端已启动，等待接收客户端信息...");
        server.receive(recvPacket);
        String recvStr = new String(recvPacket.getData() , 0 , recvPacket.getLength());
        System.out.println("收到:" + recvStr);
        //从DatagramPacket中取到客户端ip地址和端口
        int port = recvPacket.getPort();
        InetAddress addr = recvPacket.getAddress();
        String sendStr = "你好,我是服务端!";
        byte[] sendBuf;
        sendBuf = sendStr.getBytes();
        DatagramPacket sendPacket 
            = new DatagramPacket(sendBuf , sendBuf.length , addr , port );
        server.send(sendPacket);
        server.close();
    }

}
