/**
 * <copyright> 
 *
 * Copyright (c) 2006 IBM Corporation and others.
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
 * $Id: GenJDKLevel.java,v 1.1 2006/12/05 20:30:17 emerks Exp $
 */
package org.eclipse.emf.codegen.ecore.genmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gen JDK Level</b></em>',
 * and utility methods for working with them.
 * @since 2.3
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenJDKLevel()
 * @model
 * @generated
 */
public final class GenJDKLevel extends AbstractEnumerator
{
  /**
   * The '<em><b>JDK14</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JDK14</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JDK14_LITERAL
   * @model literal="1.4"
   * @generated
   * @ordered
   */
  public static final int JDK14 = 0;

  /**
   * The '<em><b>JDK50</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JDK50</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JDK50_LITERAL
   * @model literal="5.0"
   * @generated
   * @ordered
   */
  public static final int JDK50 = 1;

  /**
   * The '<em><b>JDK60</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JDK60</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JDK60_LITERAL
   * @model literal="6.0"
   * @generated
   * @ordered
   */
  public static final int JDK60 = 2;

  /**
   * The '<em><b>JDK14</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JDK14
   * @generated
   * @ordered
   */
  public static final GenJDKLevel JDK14_LITERAL = new GenJDKLevel(JDK14, "JDK14", "1.4");

  /**
   * The '<em><b>JDK50</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JDK50
   * @generated
   * @ordered
   */
  public static final GenJDKLevel JDK50_LITERAL = new GenJDKLevel(JDK50, "JDK50", "5.0");

  /**
   * The '<em><b>JDK60</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JDK60
   * @generated
   * @ordered
   */
  public static final GenJDKLevel JDK60_LITERAL = new GenJDKLevel(JDK60, "JDK60", "6.0");

  /**
   * An array of all the '<em><b>Gen JDK Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GenJDKLevel[] VALUES_ARRAY =
    new GenJDKLevel[]
    {
      JDK14_LITERAL,
      JDK50_LITERAL,
      JDK60_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Gen JDK Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Gen JDK Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenJDKLevel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GenJDKLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gen JDK Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenJDKLevel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GenJDKLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gen JDK Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenJDKLevel get(int value)
  {
    switch (value)
    {
      case JDK14: return JDK14_LITERAL;
      case JDK50: return JDK50_LITERAL;
      case JDK60: return JDK60_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private GenJDKLevel(int value, String name, String literal)
  {
    super(value, name, literal);
  }

} //GenJDKLevel
