
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
// Autogenerated
// Do not edit but extend this class as needed
package org.openecomp.ncomp.servers.openstack;

import static org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EFactory;
import org.json.JSONObject;
import org.openecomp.ncomp.sirius.manager.Jetty8Server;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import org.openecomp.ncomp.openstack.OpenStackController;

    
import org.openecomp.ncomp.servers.openstack.loc.OsLocationFactory;





public class OsOpenStackControllerServer implements ISiriusServer, IRequestHandler {
    public static final Logger logger = Logger.getLogger(OsOpenStackControllerServer.class);
    String serverPath;
    ManagementServer server;
    OsOpenStackController controller;
    String directory = "data";
//      LocationControllerApi api ;
    Jetty8Server webServer;
    OsOpenstackFactory f = new OsOpenstackFactory(this);
	
    
    String locPath;
    ManagementServer locServer;


    public OsOpenStackControllerServer(String filename) throws IOException {
		logger.warn("controller restarting");
		OsOpenStackController.ecoreSetup(); 
		props = getPropertiesFromClasspath(filename);
        serverPath = (String) props.get("server.dir");
        server = new ManagementServer(f, "OpenStackController", serverPath, filename);
        ManagementServer.setBuildVersion("ONAP-R2");
        server.addFactory(f);

        server.addRuntimeFactories(this);
        server.start();
    }
    public void runWebserver() throws IOException {
        controller = (OsOpenStackController) server.find("/").o;
        webServer = new Jetty8Server("openstack.properties");
        webServer.add("/resources",server);
        webServer.add("/api",this);


    
		EFactory locFactory = new OsLocationFactory(this);
		locPath = serverPath + "/loc";
		locServer = new ManagementServer(locFactory, "OpenStackLocation", locPath, "loc.properties");
		locServer.start();
		webServer.add("/loc",locServer);



        logger.info("Joining webserver");
        webServer.join();
    }
    static Properties props = null;
    public static void main(String []args) throws IOException {
            // ALWAYS USE GMT.
            TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
            
            OsOpenStackControllerServer s = new OsOpenStackControllerServer("openstack.properties");
            s.runWebserver();
    }
	public OpenStackController getController() {
		return controller;
	}
	public ManagementServer getServer() {
		return server;
	}
	public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context,
			String clientVersion) {
		switch ((String) context.get("path")) {
		case "/api/versions":
			return server.supportedVersions();
		}
		logger.warn("Unknown request action=" + action + " path=" + resourcePath + " context=" + context.toString(2));
		throw new RuntimeException("Unknown request");
	}
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		return null;
	}

}
