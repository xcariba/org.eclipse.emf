/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDBooleanType.java,v 1.5 2006/12/29 18:16:22 marcelop Exp $
 */
package org.eclipse.xsd.impl.type;

public class XSDBooleanType extends XSDAnySimpleType
{

  @Override
  public Object getValue(String literal)
  {
    if ("true".equals(literal) || "1".equals(literal))
    {
      return Boolean.TRUE;
    }
    else if ("false".equals(literal) || "0".equals(literal))
    {
      return Boolean.FALSE;
    }
    return null;
  }
}