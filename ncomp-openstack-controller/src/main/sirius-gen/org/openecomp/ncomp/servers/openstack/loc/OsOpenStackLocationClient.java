
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
// Do not edit. No need to extend this class.
package org.openecomp.ncomp.servers.openstack.loc;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.servers.openstack.loc.logging.OpenStackLocationOperationEnum;
import org.openecomp.ncomp.servers.openstack.loc.logging.OpenStackLocationMessageEnum;


import org.openecomp.ncomp.servers.openstack.OsOpenStackController; 



 
@SuppressWarnings("unchecked")
public class OsOpenStackLocationClient extends OpenStackLocationImpl {
	public static final Logger logger = Logger.getLogger(OsOpenStackLocationClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public OsOpenStackLocationClient(String file, String name) {
		OsOpenStackController.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/loc", this);
	}

	public OsOpenStackLocationClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/loc", this);
	}
	
	public OsOpenStackLocationClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	@Override
	public void poll() {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_poll);
		
		try {
		  client.operationPath("/loc", c, "poll", null);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_poll, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@poll: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void mergeLocation(org.openecomp.ncomp.openstack.location.OpenStackLocation loc) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_mergeLocation);
		
		try {
		  client.operationPath("/loc", c, "mergeLocation", null, loc);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_mergeLocation, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@mergeLocation: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.openecomp.ncomp.openstack.neutron.Network createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createNetwork);
		org.openecomp.ncomp.openstack.neutron.Network res;
		try {
		  res = (org.openecomp.ncomp.openstack.neutron.Network) client.operationPath("/loc", c, "createNetwork", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createNetwork, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createNetwork: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.openstack.neutron.Subnet createSubnet(org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createSubnet);
		org.openecomp.ncomp.openstack.neutron.Subnet res;
		try {
		  res = (org.openecomp.ncomp.openstack.neutron.Subnet) client.operationPath("/loc", c, "createSubnet", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createSubnet, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createSubnet: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.openstack.neutron.Port createPort(org.openecomp.ncomp.openstack.neutron.CreatePortRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createPort);
		org.openecomp.ncomp.openstack.neutron.Port res;
		try {
		  res = (org.openecomp.ncomp.openstack.neutron.Port) client.operationPath("/loc", c, "createPort", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createPort, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createPort: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.openstack.neutron.Router createRouter(org.openecomp.ncomp.openstack.neutron.CreateRouterRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createRouter);
		org.openecomp.ncomp.openstack.neutron.Router res;
		try {
		  res = (org.openecomp.ncomp.openstack.neutron.Router) client.operationPath("/loc", c, "createRouter", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createRouter, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createRouter: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void deleteNetwork(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deleteNetwork);
		
		try {
		  client.operationPath("/loc", c, "deleteNetwork", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deleteNetwork, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deleteNetwork: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deleteSubnet(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deleteSubnet);
		
		try {
		  client.operationPath("/loc", c, "deleteSubnet", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deleteSubnet, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deleteSubnet: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deletePort(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deletePort);
		
		try {
		  client.operationPath("/loc", c, "deletePort", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deletePort, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deletePort: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deleteRouter(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deleteRouter);
		
		try {
		  client.operationPath("/loc", c, "deleteRouter", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deleteRouter, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deleteRouter: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void associateFloatingIp(java.lang.String projectName, java.lang.String ipId, java.lang.String portId) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_associateFloatingIp);
		
		try {
		  client.operationPath("/loc", c, "associateFloatingIp", null, projectName,ipId,portId);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_associateFloatingIp, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@associateFloatingIp: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void createServer(org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createServer);
		
		try {
		  client.operationPath("/loc", c, "createServer", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createServer, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createServer: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deleteServer(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deleteServer);
		
		try {
		  client.operationPath("/loc", c, "deleteServer", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deleteServer, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deleteServer: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void createKeyPair(org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createKeyPair);
		
		try {
		  client.operationPath("/loc", c, "createKeyPair", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createKeyPair, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createKeyPair: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void delete(org.openecomp.ncomp.openstack.core.OpenstackRequestDelete request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_delete);
		
		try {
		  client.operationPath("/loc", c, "delete", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_delete, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@delete: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void createFlavor(org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createFlavor);
		
		try {
		  client.operationPath("/loc", c, "createFlavor", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createFlavor, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createFlavor: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void createSecurityGroup(org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createSecurityGroup);
		
		try {
		  client.operationPath("/loc", c, "createSecurityGroup", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createSecurityGroup, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createSecurityGroup: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void serverAction(org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_serverAction);
		
		try {
		  client.operationPath("/loc", c, "serverAction", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_serverAction, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@serverAction: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deployVmType);
		
		try {
		  client.operationPath("/loc", c, "deployVmType", null, vmTypeName,projectName);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deployVmType, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deployVmType: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void undeployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_undeployVmType);
		
		try {
		  client.operationPath("/loc", c, "undeployVmType", null, vmTypeName,projectName);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_undeployVmType, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@undeployVmType: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void deployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deployUser);
		
		try {
		  client.operationPath("/loc", c, "deployUser", null, user,projectName);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deployUser, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deployUser: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void undeployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_undeployUser);
		
		try {
		  client.operationPath("/loc", c, "undeployUser", null, user,projectName);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_undeployUser, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@undeployUser: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm createAlarm(org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createAlarm);
		org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm res;
		try {
		  res = (org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm) client.operationPath("/loc", c, "createAlarm", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createAlarm, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createAlarm: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void deleteAlarm(java.lang.String projectName, java.lang.String name) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_deleteAlarm);
		
		try {
		  client.operationPath("/loc", c, "deleteAlarm", null, projectName,name);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_deleteAlarm, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deleteAlarm: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> createAlarm(org.openecomp.ncomp.openstack.ceilometer.SampleRequest request) {
		EClass c = LocationPackage.eINSTANCE.getOpenStackLocation(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackLocationOperationEnum.REMOTE_createAlarm);
		EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> res;
		try {
		  res = (EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample>) client.operationPath("/loc", c, "createAlarm", null, request);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackLocationMessageEnum.REMOTE_createAlarm, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@createAlarm: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

}