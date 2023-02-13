
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver extends Thread {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
        Network objNetwork = new Network("network");
        Thread networkThread = new Thread(objNetwork);/* Activate the network */
        networkThread.start();
        Server objServer = new Server();
        Thread serverThread = new Thread(objServer);
        serverThread.start();
        Client senderThread = new Client("sending");
        Thread sendThread = new Thread(senderThread);
        Client receiverThread = new Client("receiving");
        Thread receiveThread = new Thread(receiverThread);
        sendThread.start();
        receiveThread.start();
        /* Complete here the code for the main method ...*/
    }
}
