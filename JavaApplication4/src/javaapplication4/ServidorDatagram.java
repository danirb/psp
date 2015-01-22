package javaapplication4;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matinal
 */
public class ServidorDatagram {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket socket = new DatagramSocket(6969);
        byte[] buffer = new byte[1000];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        byte[] recibido = packet.getData();
        String mensaje = new String(recibido,0,recibido.length);
        System.out.println("Mensaje recibido: "+mensaje);
        socket.close();
        
    }
}
