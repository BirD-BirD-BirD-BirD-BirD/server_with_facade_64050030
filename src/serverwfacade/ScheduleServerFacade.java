/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwfacade;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class ScheduleServerFacade {
    private final ScheduleServer scheduleServer;
    public ScheduleServerFacade(ScheduleServer scheduleServer){
	this.scheduleServer = scheduleServer;
    }
    public void startServer(){
	scheduleServer.startBooting();
	scheduleServer.readSystemConfigFile();
	scheduleServer.init();
	scheduleServer.initializeContext();
	scheduleServer.initializeListeners();
	scheduleServer.createSystemObjects();
    }
    public void stopServer(){
        scheduleServer.releaseProcesses();
	scheduleServer.destory();
	scheduleServer.destroySystemObjects();
	scheduleServer.destoryListeners();
	scheduleServer.destoryContext();
	scheduleServer.shutdown();
    }
}
