import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.Serializable;
import java.time.temporal.Temporal;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class socketServer extends Thread {

	
	public static void main(String[] args) throws IOException {
		//Get socket # to listen with socketNum()
		//Implement Socket Listener with specified socket #?
		try {
		Socket n = new Socket();
		ServerSocket ss = new ServerSocket(25);
		while(!ss.isClosed()) {
		n = ss.accept();}
		Thread serv = serverHandler(ss);
		serv.start();
		System.out.println("Connection Established" + n.toString());
		n.close();
		}catch(IOException exc) {
			exc.printStackTrace();
		}
		
		}
	
	public static final Thread serverHandler(ServerSocket s) {
		public void run() throws IOException {
		try {
				newHandler(s);
				System.out.printf("%s%n", "Establishing Connection - - -");
		}catch(IOException exc) {
			exc.printStackTrace();
		}
		}}
	
	public void newHandler(ServerSocket s) throws IOException {
		try {
		this.newHandler(s);
		}catch(IOException exc) {
			exc.printStackTrace();
		}}
}