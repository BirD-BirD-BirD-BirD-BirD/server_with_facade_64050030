/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwfacade;
public class ServerWFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
	ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();
        System.out.println("Start working......");
	System.out.println("After work done.........");
	facadeServer.stopServer();
    }
    
}
