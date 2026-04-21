package it.univaq.disim.bpd.etsservice;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

public class ETSServlet extends CXFNonSpringServlet {
	private static final long serialVersionUID = 1152463856246372604L;
	
	@Override
	public void loadBus(ServletConfig servletConfig) {
		super.loadBus(servletConfig);
		Bus bus = getBus();
		BusFactory.setDefaultBus(bus);
		Endpoint.publish("/etsinterface", new ETSServiceImpl());
	}
}
