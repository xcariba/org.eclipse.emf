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
 * $Id: C3.java,v 1.2 2006/12/30 03:43:25 marcelop Exp $
 */
package org.eclipse.emf.test.models.ref;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.ref.C3#getD <em>D</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.ref.C3#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.test.models.ref.RefPackage#getC3()
 * @model
 * @generated
 */
public interface C3 extends EObject
{
  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.test.models.ref.D}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference list.
   * @see org.eclipse.emf.test.models.ref.RefPackage#getC3_D()
   * @model type="org.eclipse.emf.test.models.ref.D" containment="true"
   * @generated
   */
  EList<D> getD();

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(C)
   * @see org.eclipse.emf.test.models.ref.RefPackage#getC3_C()
   * @model containment="true" required="true"
   * @generated
   */
  C getC();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.ref.C3#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(C value);

} // C3
