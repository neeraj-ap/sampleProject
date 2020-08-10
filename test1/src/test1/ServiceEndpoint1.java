package test1;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

// access param
@ServerEndpoint("/test/{method}")
public class ServiceEndpoint1 {

	@OnOpen
	public void handleOpen() {
		System.out.println("Client is Connected . . . .");
	}
	
	@OnClose
	public void handleClose() {
		System.out.println("Client is DisConnected . . . .");
	}
	
	@OnError
	public void handleError(Throwable throwable) {
		throwable.printStackTrace();
	}
	
	@OnMessage
	public String handleMessage(@PathParam("method") String str , String message) {
		System.out.println("Client sends = "+message+" From server "+str);
		String replyMesg = "from server " + message+" From server "+str;
		System.out.println("server sends = "+replyMesg+" From server "+str);
		return replyMesg;
	}
	
}
