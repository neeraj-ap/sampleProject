package test1;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/test")
public class serviceEndpoint {
	private static final Logger logger = Logger.getLogger("serviceEndpoint");
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
	public String handleMessage(String message) {
        logger.log(Level.INFO, "Sent: {0}", message);
		System.out.println("Client sends = "+message);
		String replyMesg = "from server " + message;
		System.out.println("server sends = "+replyMesg);
		return replyMesg;
	}
	
}
