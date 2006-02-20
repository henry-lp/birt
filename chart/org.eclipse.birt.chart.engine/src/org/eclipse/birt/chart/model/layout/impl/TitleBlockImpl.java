/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.layout.impl;

import org.eclipse.birt.chart.model.layout.Block;
import org.eclipse.birt.chart.model.layout.LayoutFactory;
import org.eclipse.birt.chart.model.layout.LayoutPackage;
import org.eclipse.birt.chart.model.layout.TitleBlock;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Title Block</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TitleBlockImpl extends LabelBlockImpl implements TitleBlock
{

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleBlockImpl( )
	{
		super( );
	}

	/**
	 * 
	 * Note: Manually written
	 * 
	 * @return
	 */
	public boolean isTitle( )
	{
		return true;
	}

	/**
	 * 
	 * Note: Manually written
	 * 
	 * @return
	 */
	public boolean isCustom( )
	{
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass( )
	{
		return LayoutPackage.Literals.TITLE_BLOCK;
	}

	/**
	 * A convenience method to create an initialized 'TitleBlock' instance
	 * 
	 * @return
	 */
	public static Block create( )
	{
		final TitleBlock tb = LayoutFactory.eINSTANCE.createTitleBlock( );
		( (TitleBlockImpl) tb ).initialize( );
		return tb;
	}
} //TitleBlockImpl
