/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author matinal
 */
public class ServerConHilos {
    public static void main(String[] args) throws IOException {
        //creamos serversockect
        ServerSocket server = new ServerSocket(3000);
        while(true){
            Socket socket = new Socket();
            socket = server.accept();
        }
    }
}
