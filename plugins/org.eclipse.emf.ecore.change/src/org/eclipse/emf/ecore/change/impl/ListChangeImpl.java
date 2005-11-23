/**
 * <copyright>
 *
 * Copyright (c) 2003-2004 IBM Corporation and others.
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
 * $Id: ListChangeImpl.java,v 1.8 2005/11/23 13:57:00 emerks Exp $
 */
package org.eclipse.emf.ecore.change.impl;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.change.ChangeFactory;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.ChangePackage;
import org.eclipse.emf.ecore.change.FeatureMapEntry;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getDataValues <em>Data Values</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getMoveToIndex <em>Move To Index</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getReferenceValues <em>Reference Values</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.ListChangeImpl#getFeatureMapEntryValues <em>Feature Map Entry Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListChangeImpl extends EObjectImpl implements ListChange
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ChangeKind KIND_EDEFAULT = ChangeKind.ADD_LITERAL;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ChangeKind kind = KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataValues() <em>Data Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataValues()
   * @generated
   * @ordered
   */
  protected EList dataValues = null;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = -1;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getMoveToIndex() <em>Move To Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveToIndex()
   * @generated
   * @ordered
   */
  protected static final int MOVE_TO_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMoveToIndex() <em>Move To Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveToIndex()
   * @generated
   * @ordered
   */
  protected int moveToIndex = MOVE_TO_INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferenceValues() <em>Reference Values</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceValues()
   * @generated
   * @ordered
   */
  protected EList referenceValues = null;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature feature = null;
  
  /**
   * The cached value of the '{@link #getFeatureMapEntryValues() <em>Feature Map Entry Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureMapEntryValues()
   * @generated
   * @ordered
   */
  protected EList featureMapEntryValues = null;

  /**
   * The data value delegating list is used to ensure that the elements
   * are properly converted to and from strings when added and removed
   * from the dataValues list. 
   */
  protected EList dataValueDelegatingList = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListChangeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return ChangePackage.eINSTANCE.getListChange();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ChangeKind newKind)
  {
    ChangeKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.LIST_CHANGE__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDataValues()
  {
    if (dataValues == null)
    {
      dataValues = new EDataTypeUniqueEList(String.class, this, ChangePackage.LIST_CHANGE__DATA_VALUES);
    }
    return dataValues;
  }

  /**
   * Creates the data value delegating list
   */
  protected EList createDataValueDelegatingList()
  {
    if (FeatureMapUtil.isFeatureMap(getFeature()))
    {
      return 
        new DelegatingEList()
        {
          protected List delegateList()
          {
            return getFeatureMapEntryValues();
          }
          
          protected Object validate(int index, Object object)
          {
            if (object instanceof FeatureMapEntry)
            {
              return object;
            }
            else
            {
              FeatureMap.Entry entry = (FeatureMap.Entry)object;
              return createFeatureMapEntry(entry.getEStructuralFeature(), entry.getValue());
            }
          }
        };
    }
    else
    {
      return 
        new DelegatingEList()
        {
          protected List delegateList()
          {
            return getDataValues();
          }
            
          protected Object resolve(int index, Object object)
          {
            EDataType type = (EDataType)getFeature().getEType();
            return EcoreUtil.createFromString(type, (String)object);
          }
            
          protected Object validate(int index, Object object)
          {
            EDataType type = (EDataType)getFeature().getEType();
            return EcoreUtil.convertToString(type, object);
          }
        };
    } 
  }
  
  protected FeatureMapEntry createFeatureMapEntry(EStructuralFeature feature, Object value)
  {
    return ChangeFactory.eINSTANCE.createFeatureMapEntry(feature, value);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.LIST_CHANGE__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMoveToIndex()
  {
    return moveToIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoveToIndex(int newMoveToIndex)
  {
    int oldMoveToIndex = moveToIndex;
    moveToIndex = newMoveToIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.LIST_CHANGE__MOVE_TO_INDEX, oldMoveToIndex, moveToIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getReferenceValues()
  {
    if (referenceValues == null)
    {
      referenceValues = new EObjectResolvingEList(EObject.class, this, ChangePackage.LIST_CHANGE__REFERENCE_VALUES);
    }
    return referenceValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getFeatureGen()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EStructuralFeature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangePackage.LIST_CHANGE__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  public EStructuralFeature getFeature()
  {
    EStructuralFeature result = getFeatureGen();
    if (result == null)
    {
      EObject container = eContainer();
      if (container instanceof FeatureChange)
      {
        result = ((FeatureChange)container).getFeature();
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setFeature(EStructuralFeature newFeature)
  {
    EStructuralFeature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.LIST_CHANGE__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getFeatureMapEntryValues()
  {
    if (featureMapEntryValues == null)
    {
      featureMapEntryValues = new EObjectContainmentEList(FeatureMapEntry.class, this, ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES);
    }
    return featureMapEntryValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getValues()
  {
    EStructuralFeature feature = getFeature();
    if (feature instanceof EAttribute)
    {
      if (dataValueDelegatingList == null)
      {
        dataValueDelegatingList = createDataValueDelegatingList();
      }
      return dataValueDelegatingList;
    }
    else
    {
      return getReferenceValues();
    }
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setValues(EList values)
  {
    EList featureValues = getValues();
    featureValues.clear();
    featureValues.addAll(values);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void apply(EList originalList)
  {
    switch (getKind().getValue())
    {
      case ChangeKind.ADD:
        if (index == -1)
        {
          originalList.addAll(getValues());
        }
        else
        {
          originalList.addAll(index, getValues());
        }
        break;
      case ChangeKind.REMOVE:
        int removeCount = getValues().isEmpty() ? 1 : getValues().size();
        for (int i = 0; i < removeCount; ++i)
        {
          originalList.remove(index);
        }
        break;
      case ChangeKind.MOVE:
        originalList.move(moveToIndex, index);
        break;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void applyAndReverse(EList originalList)
  {
    switch (getKind().getValue())
    {
      case ChangeKind.ADD:
        if (index == -1)
        {
          index = originalList.size();
          originalList.addAll(getValues());
        }
        else
        {
          originalList.addAll(index, getValues());
        }
        if (getValues().size() == 1)
        {
          getValues().clear();
        }
        setKind(ChangeKind.REMOVE_LITERAL);
        break;
      case ChangeKind.REMOVE:
        if (getValues().isEmpty())
        {
          getValues().add(originalList.get(getIndex()));
        }
        int removeCount = getValues().size();
        for (int i = 0; i < removeCount; ++i)
        {
          originalList.remove(index);
        }
        setKind(ChangeKind.ADD_LITERAL);
        break;
      case ChangeKind.MOVE:
        originalList.move(moveToIndex, index);
        int temp = moveToIndex;
        setMoveToIndex(index);
        setIndex(temp);
        break;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
        case ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES:
          return ((InternalEList)getFeatureMapEntryValues()).basicRemove(otherEnd, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChangePackage.LIST_CHANGE__KIND:
        return getKind();
      case ChangePackage.LIST_CHANGE__DATA_VALUES:
        return getDataValues();
      case ChangePackage.LIST_CHANGE__INDEX:
        return new Integer(getIndex());
      case ChangePackage.LIST_CHANGE__MOVE_TO_INDEX:
        return new Integer(getMoveToIndex());
      case ChangePackage.LIST_CHANGE__VALUES:
        return getValues();
      case ChangePackage.LIST_CHANGE__REFERENCE_VALUES:
        return getReferenceValues();
      case ChangePackage.LIST_CHANGE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES:
        return getFeatureMapEntryValues();
    }
    return eDynamicGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChangePackage.LIST_CHANGE__KIND:
        setKind((ChangeKind)newValue);
        return;
      case ChangePackage.LIST_CHANGE__DATA_VALUES:
        getDataValues().clear();
        getDataValues().addAll((Collection)newValue);
        return;
      case ChangePackage.LIST_CHANGE__INDEX:
        setIndex(((Integer)newValue).intValue());
        return;
      case ChangePackage.LIST_CHANGE__MOVE_TO_INDEX:
        setMoveToIndex(((Integer)newValue).intValue());
        return;
      case ChangePackage.LIST_CHANGE__VALUES:
        getValues().clear();
        getValues().addAll((Collection)newValue);
        return;
      case ChangePackage.LIST_CHANGE__REFERENCE_VALUES:
        getReferenceValues().clear();
        getReferenceValues().addAll((Collection)newValue);
        return;
      case ChangePackage.LIST_CHANGE__FEATURE:
        setFeature((EStructuralFeature)newValue);
        return;
      case ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES:
        getFeatureMapEntryValues().clear();
        getFeatureMapEntryValues().addAll((Collection)newValue);
        return;
    }
    eDynamicSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChangePackage.LIST_CHANGE__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case ChangePackage.LIST_CHANGE__DATA_VALUES:
        getDataValues().clear();
        return;
      case ChangePackage.LIST_CHANGE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case ChangePackage.LIST_CHANGE__MOVE_TO_INDEX:
        setMoveToIndex(MOVE_TO_INDEX_EDEFAULT);
        return;
      case ChangePackage.LIST_CHANGE__VALUES:
        getValues().clear();
        return;
      case ChangePackage.LIST_CHANGE__REFERENCE_VALUES:
        getReferenceValues().clear();
        return;
      case ChangePackage.LIST_CHANGE__FEATURE:
        setFeature((EStructuralFeature)null);
        return;
      case ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES:
        getFeatureMapEntryValues().clear();
        return;
    }
    eDynamicUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChangePackage.LIST_CHANGE__KIND:
        return kind != KIND_EDEFAULT;
      case ChangePackage.LIST_CHANGE__DATA_VALUES:
        return dataValues != null && !dataValues.isEmpty();
      case ChangePackage.LIST_CHANGE__INDEX:
        return index != INDEX_EDEFAULT;
      case ChangePackage.LIST_CHANGE__MOVE_TO_INDEX:
        return moveToIndex != MOVE_TO_INDEX_EDEFAULT;
      case ChangePackage.LIST_CHANGE__VALUES:
        return !getValues().isEmpty();
      case ChangePackage.LIST_CHANGE__REFERENCE_VALUES:
        return referenceValues != null && !referenceValues.isEmpty();
      case ChangePackage.LIST_CHANGE__FEATURE:
        return feature != null;
      case ChangePackage.LIST_CHANGE__FEATURE_MAP_ENTRY_VALUES:
        return featureMapEntryValues != null && !featureMapEntryValues.isEmpty();
    }
    return eDynamicIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kind: ");
    result.append(kind);
    result.append(", dataValues: ");
    result.append(dataValues);
    result.append(", index: ");
    result.append(index);
    result.append(", moveToIndex: ");
    result.append(moveToIndex);
    result.append(')');
    return result.toString();
  }

} //ListChangeImpl
