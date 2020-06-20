package client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandleResolver implements HandlerResolver{

	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();
		HeaderHandle  hh = new HeaderHandle();
		handlerChain.add(hh);
		return handlerChain;
	}

}
