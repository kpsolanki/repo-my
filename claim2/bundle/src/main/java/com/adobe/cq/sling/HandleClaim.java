package com.adobe.cq.sling;

import java.io.PrintWriter;
import java.util.Set;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SlingServlet(methods="GET",
metatype=true,
resourceTypes={"services/powerproxy"},
selectors={"groups"},
extensions="pdf")

public class HandleClaim extends SlingAllMethodsServlet {
	
	/*@Reference
	private SlingSettingsService settingsService;*/

	private static final long serialVersionUID = 1360745195286088370L;
	private static final Logger LOGGER=LoggerFactory.getLogger("HandleClaim.class");
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {
		try {
			
			LOGGER.info(" This is the get method of slingservletResourceType/components/page/slingRComponent");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println("<h1>This value was returned by an AEM Sling Servlet bound by using a Sling ResourceTypes property</h1>");
			out.print("</html></body>");
			
			//final Set<String> runmodes=settingsService.getRunModes();
		} catch (Exception e) {
			LOGGER.info(e.getMessage(),e);
		}
	}
}
