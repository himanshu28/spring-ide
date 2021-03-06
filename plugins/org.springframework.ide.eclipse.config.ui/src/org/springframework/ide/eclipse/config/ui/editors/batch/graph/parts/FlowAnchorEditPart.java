/*******************************************************************************
 *  Copyright (c) 2012 VMware, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      VMware, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.config.ui.editors.batch.graph.parts;

import org.eclipse.gef.EditPolicy;
import org.springframework.ide.eclipse.config.graph.parts.SimpleActivityWithContainerPart;
import org.springframework.ide.eclipse.config.ui.editors.batch.graph.StepNodeEditPolicy;
import org.springframework.ide.eclipse.config.ui.editors.batch.graph.model.FlowAnchorElement;


/**
 * @author Leo Dos Santos
 */
public class FlowAnchorEditPart extends SimpleActivityWithContainerPart {

	public FlowAnchorEditPart(FlowAnchorElement flow) {
		super(flow);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new StepNodeEditPolicy());
	}

	@Override
	public FlowAnchorElement getModelElement() {
		return (FlowAnchorElement) getModel();
	}

}
