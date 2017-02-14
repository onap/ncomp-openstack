
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
package org.openecomp.ncomp.servers.openstack;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl;
import org.openecomp.ncomp.openstack.OpenstackPackage;
import org.openecomp.ncomp.servers.openstack.logging.OpenStackControllerOperationEnum;
import org.openecomp.ncomp.servers.openstack.logging.OpenStackControllerMessageEnum;





 
@SuppressWarnings("unchecked")
public class OsOpenStackControllerClient extends OpenStackControllerImpl {
	public static final Logger logger = Logger.getLogger(OsOpenStackControllerClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public OsOpenStackControllerClient(String file, String name) {
		OsOpenStackController.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/resources", this);
	}

	public OsOpenStackControllerClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/resources", this);
	}
	
	public OsOpenStackControllerClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	@Override
	public void uploadOpenstackConfiguration(org.json.JSONObject cx, org.openecomp.ncomp.openstack.location.OpenStackLocation loc) {
		EClass c = OpenstackPackage.eINSTANCE.getOpenStackController(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(OpenStackControllerOperationEnum.REMOTE_uploadOpenstackConfiguration);
		
		try {
		  client.operationPath("/resources", c, "uploadOpenstackConfiguration", cx != null && cx.has("timeout") ? cx.getLong("timeout") : null, cx,loc);
		}
		catch (Exception e) {
			ecomplogger.warn(OpenStackControllerMessageEnum.REMOTE_uploadOpenstackConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@uploadOpenstackConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

}