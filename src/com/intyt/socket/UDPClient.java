package com.intyt.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP客户端
 * @author twy
 *
 */
public class UDPClient {
	
	public static void main(String[] args)throws IOException{
        DatagramSocket client = new DatagramSocket();
        String toSend = "你好，我是客户端!";
        byte[] sendBuf;
        sendBuf = toSend.getBytes();
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        DatagramPacket sendPacket 
            = new DatagramPacket(sendBuf ,sendBuf.length , addr , 5050);
        client.send(sendPacket);
        byte[] recvBuf = new byte[100];
        DatagramPacket recvPacket
            = new DatagramPacket(recvBuf , recvBuf.length);
        client.receive(recvPacket);
        String recvStr = new String(recvPacket.getData() , 0 ,recvPacket.getLength());
        System.out.println("收到:" + recvStr);
        client.close();
    }

}
