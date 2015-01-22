package javaapplication4;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matinal
 */
public class ClienteDatagram {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket socket = new DatagramSocket();
        String mensaje = "Enviado desde el cliente";
        byte[] buf = mensaje.getBytes();

        InetAddress adress = InetAddress.getByName("localhost");
        int port = 6969;
        DatagramPacket packet = new DatagramPacket(buf, buf.length, adress, port);
        socket.send(packet);
        socket.close();
        
    }
}
