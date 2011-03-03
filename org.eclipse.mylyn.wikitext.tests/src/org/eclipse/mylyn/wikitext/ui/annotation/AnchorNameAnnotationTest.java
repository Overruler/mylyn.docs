/*******************************************************************************
 * Copyright (c) 2007, 2010 David Green and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Green - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.wikitext.ui.annotation;

import junit.framework.TestCase;

import org.eclipse.mylyn.wikitext.tests.HeadRequired;

/**
 * @author David Green
 */
@HeadRequired
public class AnchorNameAnnotationTest extends TestCase {

	public void testSimple() {
		AnchorNameAnnotation annotation = new AnchorNameAnnotation("foo");
		assertEquals("foo", annotation.getText());
		assertEquals(AnchorNameAnnotation.TYPE, annotation.getType());
	}
}
