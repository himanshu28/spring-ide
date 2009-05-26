/*******************************************************************************
 * Copyright (c) 2005, 2009 Spring IDE Developers
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spring IDE Developers - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.beans.core.model;

import java.util.Set;

import org.osgi.framework.Bundle;

/**
 * Represents a Spring namespace created from reading the <code>spring.tooling</code> file in
 * <code>META-INF</code>.
 * @author Christian Dupuis
 * @since 2.2.5
 */
public interface INamespaceDefinition {

	/**
	 * Returns the namespace prefix this namespace is associated with.
	 */
	String getPrefix();

	/**
	 * Returns the namepace name.
	 */
	String getName();

	/**
	 * Returns a path to a namespace icon with the bundle.
	 */
	String getIconPath();

	/**
	 * Returns the namespace uri.
	 */
	String getNamespaceUri();

	/**
	 * Returns all available XSD schema locations.
	 */
	Set<String> getSchemaLocations();

	/**
	 * Returns the default schema location. By default this is the XSD with the highest version in
	 * the file name.
	 */
	String getDefaultSchemaLocation();
	
	/**
	 * Returns the {@link Bundle} that hosts the namespace.
	 */
	Bundle getBundle();

}