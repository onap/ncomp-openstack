
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
package org.openecomp.ncomp.servers.openstack.loc;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;




public class OsOpenStackLocationConsole extends Console {
	public static final Logger logger = Logger.getLogger(OsOpenStackLocationConsole.class);
    protected OsOpenStackLocationClient controller;
    



    public OsOpenStackLocationConsole(String filename, String name) {
            super(filename, name);
            controller = new OsOpenStackLocationClient(filename,name);
            client = controller.client;

    }
    
	public OsOpenStackLocationConsole(AbstractClient c) {
        controller = new OsOpenStackLocationClient(c);
        client = controller.client;
    }


	public void poll() {
		
		try {
			 controller.poll();
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void mergeLocation(org.openecomp.ncomp.openstack.location.OpenStackLocation loc) {
		
		try {
			 controller.mergeLocation(loc);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public org.openecomp.ncomp.openstack.neutron.Network createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest request) {
		org.openecomp.ncomp.openstack.neutron.Network res = null;
		try {
			res =  controller.createNetwork(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.openstack.neutron.Subnet createSubnet(org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest request) {
		org.openecomp.ncomp.openstack.neutron.Subnet res = null;
		try {
			res =  controller.createSubnet(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.openstack.neutron.Port createPort(org.openecomp.ncomp.openstack.neutron.CreatePortRequest request) {
		org.openecomp.ncomp.openstack.neutron.Port res = null;
		try {
			res =  controller.createPort(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.openstack.neutron.Router createRouter(org.openecomp.ncomp.openstack.neutron.CreateRouterRequest request) {
		org.openecomp.ncomp.openstack.neutron.Router res = null;
		try {
			res =  controller.createRouter(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public void deleteNetwork(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deleteNetwork(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deleteSubnet(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deleteSubnet(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deletePort(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deletePort(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deleteRouter(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deleteRouter(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void associateFloatingIp(java.lang.String projectName, java.lang.String ipId, java.lang.String portId) {
		
		try {
			 controller.associateFloatingIp(projectName,ipId,portId);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void createServer(org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer request) {
		
		try {
			 controller.createServer(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deleteServer(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deleteServer(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void createKeyPair(org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair request) {
		
		try {
			 controller.createKeyPair(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void delete(org.openecomp.ncomp.openstack.core.OpenstackRequestDelete request) {
		
		try {
			 controller.delete(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void createFlavor(org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor request) {
		
		try {
			 controller.createFlavor(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void createSecurityGroup(org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup request) {
		
		try {
			 controller.createSecurityGroup(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void serverAction(org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction request) {
		
		try {
			 controller.serverAction(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		
		try {
			 controller.deployVmType(vmTypeName,projectName);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void undeployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		
		try {
			 controller.undeployVmType(vmTypeName,projectName);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void deployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		
		try {
			 controller.deployUser(user,projectName);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void undeployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		
		try {
			 controller.undeployUser(user,projectName);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm createAlarm(org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest request) {
		org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm res = null;
		try {
			res =  controller.createAlarm(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public void deleteAlarm(java.lang.String projectName, java.lang.String name) {
		
		try {
			 controller.deleteAlarm(projectName,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> createAlarm(org.openecomp.ncomp.openstack.ceilometer.SampleRequest request) {
		EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> res = null;
		try {
			res =  controller.createAlarm(request);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

}
