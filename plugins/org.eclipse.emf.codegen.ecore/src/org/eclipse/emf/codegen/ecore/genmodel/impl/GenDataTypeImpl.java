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
 * $Id: GenDataTypeImpl.java,v 1.21 2006/12/05 20:30:05 emerks Exp $
 */
package org.eclipse.emf.codegen.ecore.genmodel.impl;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDataTypeImpl extends GenClassifierImpl implements GenDataType
{
  /**
   * The cached value of the '{@link #getEcoreDataType() <em>Ecore Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreDataType()
   * @generated
   * @ordered
   */
  protected EDataType ecoreDataType = null;

  protected GenDataTypeImpl()
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
    return GenModelPackage.Literals.GEN_DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEcoreDataType()
  {
    if (ecoreDataType != null && ecoreDataType.eIsProxy())
    {
      InternalEObject oldEcoreDataType = (InternalEObject)ecoreDataType;
      ecoreDataType = (EDataType)eResolveProxy(oldEcoreDataType);
      if (ecoreDataType != oldEcoreDataType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
      }
    }
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType basicGetEcoreDataType()
  {
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcoreDataType(EDataType newEcoreDataType)
  {
    EDataType oldEcoreDataType = ecoreDataType;
    ecoreDataType = newEcoreDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
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
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        if (resolve) return getEcoreDataType();
        return basicGetEcoreDataType();
    }
    return super.eGet(featureID, resolve, coreType);
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
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
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
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)null);
        return;
    }
    super.eUnset(featureID);
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
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        return ecoreDataType != null;
    }
    return super.eIsSet(featureID);
  }

  public EClassifier getEcoreClassifier()
  {
    return getEcoreDataType();
  }

  public String getImportedMetaType()
  {
    return getGenModel().getImportedName("org.eclipse.emf.ecore.EDataType");
  }

  public String getQualifiedInstanceClassName()
  {
    return getRawQualifiedInstanceClassName().replace('$','.');
  }

  public String getRawQualifiedInstanceClassName()
  {
    return getInternalQualifiedInstanceClassName(getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50);
  }

  protected String getInternalQualifiedInstanceClassName(boolean includeTemplateArguments)
  {
    String name = includeTemplateArguments ? getEcoreDataType().getInstanceTypeName() : getEcoreDataType().getInstanceClassName();
    if (name == null) name = "java.lang.Object";

    if (name.equals("org.eclipse.emf.common.util.Enumerator"))
    {
      EDataType baseType = getExtendedMetaData().getBaseType(getEcoreDataType());
      if (baseType instanceof EEnum)
      {
        GenEnum genEnum = findGenEnum((EEnum)baseType);
        if (genEnum != null)
        {
          name = genEnum.getQualifiedName();
        }
      }
    }

    return name;
  }

  public String getRawImportedInstanceClassName()
  {  
   return getGenModel().getImportedName(getInternalQualifiedInstanceClassName(false)); 
  }

  public String getImportedInstanceClassName()
  {
   return getGenModel().getImportedName(getRawQualifiedInstanceClassName()); 
  }

  public String getImportedParameterizedInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<" + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getImportedWildcardInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<?>";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getImportedWildcardObjectInstanceClassName()
  {
    String result = getObjectInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<?>";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }
  
  public String getImportedBoundedWildcardInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<? extends " + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getImportedParameterizedObjectInstanceClassName()
  {
    String result = getObjectInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<" + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getObjectInstanceClassName()
  {
    return getImportedType(getEcoreDataType(), true);
  }

  public boolean isSerializable()
  {
    return getEcoreDataType().isSerializable();
  }

  public String getSerializableFlag()
  {
    String result = !getEcoreDataType().isSerializable() ? "!" : "";
    return result + "IS_SERIALIZABLE";
  }

  public String getGeneratedInstanceClassFlag()
  {
    String result = this instanceof GenEnum || getBaseType() instanceof GenEnum ? "" : "!";
    return result + "IS_GENERATED_INSTANCE_CLASS";
  }

  public boolean isPrimitiveType()
  {
    return isPrimitiveType(getEcoreDataType());
  }

  public boolean isArrayType()
  {
    return getEcoreDataType().getInstanceClassName().indexOf('[') != -1;
  }

  public boolean isObjectType()
  {
    return "java.lang.Object".equals(getEcoreDataType().getInstanceClassName());
  }

  public String getPrimitiveValueFunction()
  {
    Class instanceClass = getEcoreDataType().getInstanceClass();
    if (instanceClass == java.lang.Boolean.TYPE)
      return "booleanValue";
    if (instanceClass == java.lang.Byte.TYPE)
      return "byteValue";
    if (instanceClass == java.lang.Character.TYPE)
      return "charValue";
    if (instanceClass == java.lang.Double.TYPE)
      return "doubleValue";
    if (instanceClass == java.lang.Float.TYPE)
      return "floatValue";
    if (instanceClass == java.lang.Integer.TYPE)
      return "intValue";
    if (instanceClass == java.lang.Long.TYPE)
      return "longValue";
    if (instanceClass == java.lang.Short.TYPE)
      return "shortValue";
    return null;
  }

  public String getModelInfo()
  {
    StringBuffer result = new StringBuffer();

    result.append("instanceClass=\"" + getRawQualifiedInstanceClassName() + "\"");

    if (!isSerializable())
    {
      result.append(" serializable=\"false\"");
    }

    appendAnnotationInfo(result, getEcoreDataType());

    return result.toString();
  }

  public GenDataType getBaseType()
  {
    EDataType baseType = getExtendedMetaData().getBaseType(getEcoreDataType());
    return baseType == null ? null : (GenDataType)findGenClassifier(baseType);
  }

  public GenDataType getItemType()
  {
    EDataType itemType = getExtendedMetaData().getItemType(getEcoreDataType());
    return itemType == null ? null : (GenDataType)findGenClassifier(itemType);
  }

  public GenDataType getEffectiveItemType()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      EDataType itemType = getExtendedMetaData().getItemType(eDataType);
      if (itemType != null)
      {
        return (GenDataType)findGenClassifier(itemType);
      }
    }
    return null;
  }

  public List /*GenDataType*/ getMemberTypes()
  {
    List result = new ArrayList();
    for (Iterator i = getExtendedMetaData().getMemberTypes(getEcoreDataType()).iterator(); i.hasNext(); )
    {
      EDataType memberType = (EDataType)i.next();
      result.add(findGenClassifier(memberType));
    }
    return result;
  }

  public List /*GenDataType*/ getEffectiveMemberTypes()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List result = new ArrayList();
      for (Iterator i = getExtendedMetaData().getMemberTypes(eDataType).iterator(); i.hasNext(); )
      {
        EDataType memberType = (EDataType)i.next();
        result.add(findGenClassifier(memberType));
      }
      if (result.isEmpty())
      {
        return result;
      }
    }
    return null;
  }

  public GenDataType getObjectType()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    EDataType eDataType = getEcoreDataType();
    EClassifier eClassifier = extendedMetaData.getType(eDataType.getEPackage(), extendedMetaData.getName(eDataType) + ":Object");
    if (eClassifier instanceof EDataType)
    {
      GenDataType result = findGenDataType((EDataType)eClassifier);
      if (result != null)
      {
        return result;
      }
    }
    return this;
  }

  public String getMinLiteral()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String min = extendedMetaData.getMinExclusiveFacet(eDataType);
      if (min != null)
      {
        return min;
      }
      min = extendedMetaData.getMinInclusiveFacet(eDataType);
      if (min != null)
      {
        return min;
      }
    }
    return null;
  }

  public boolean isMinInclusive()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String min = extendedMetaData.getMinExclusiveFacet(eDataType);
      if (min != null)
      {
        return false;
      }
      min = extendedMetaData.getMinInclusiveFacet(eDataType);
      if (min != null)
      {
        return true;
      }
    }
    return true;
  }

  public String getMaxLiteral()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String max = extendedMetaData.getMaxExclusiveFacet(eDataType);
      if (max != null)
      {
        return max;
      }
      max = extendedMetaData.getMaxInclusiveFacet(eDataType);
      if (max != null)
      {
        return max;
      }
    }
    return null;
  }

  public boolean isMaxInclusive()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String max = extendedMetaData.getMaxExclusiveFacet(eDataType);
      if (max != null)
      {
        return false;
      }
      max = extendedMetaData.getMaxInclusiveFacet(eDataType);
      if (max != null)
      {
        return true;
      }
    }
    return true;
  }

  public String getLengthAccessorFunction()
  {
    if (isArrayType())
    {
      return "length";
    }
    else if ("java.lang.String".equals(getEcoreDataType().getInstanceClassName()))
    {
      return "length()";
    }
    else
    {
      return "size()";
    }
  }

  public int getMinLength()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int minLength = extendedMetaData.getMinLengthFacet(eDataType);
      if (minLength != -1)
      {
        return minLength;
      }
      minLength = extendedMetaData.getLengthFacet(eDataType);
      if (minLength != -1)
      {
        return minLength;
      }
    }
    return -1;
  }

  public int getMaxLength()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int maxLength = extendedMetaData.getMaxLengthFacet(eDataType);
      if (maxLength != -1)
      {
        return maxLength;
      }
      maxLength = extendedMetaData.getLengthFacet(eDataType);
      if (maxLength != -1)
      {
        return maxLength;
      }
    }
    return -1;
  }

  public int getTotalDigits()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int totalDigits = extendedMetaData.getTotalDigitsFacet(eDataType);
      if (totalDigits != -1)
      {
        return totalDigits;
      }
    }
    return -1;
  }

  public int getFractionDigits()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int fractionDigits = extendedMetaData.getFractionDigitsFacet(eDataType);
      if (fractionDigits != -1)
      {
        return fractionDigits;
      }
    }
    return -1;
  }

  public List getEnumerationLiterals()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List literals = extendedMetaData.getEnumerationFacet(eDataType);
      if (!literals.isEmpty())
      {
        return literals;
      }
    }
    return Collections.EMPTY_LIST;
  }

  public String getWhiteSpace()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int whiteSpace = extendedMetaData.getWhiteSpaceFacet(eDataType);
      if (whiteSpace != ExtendedMetaData.UNSPECIFIED_WHITE_SPACE)
      {
        return ExtendedMetaData.WHITE_SPACE_KINDS[whiteSpace];
      }
    }
    return ExtendedMetaData.WHITE_SPACE_KINDS[ExtendedMetaData.UNSPECIFIED_WHITE_SPACE];
  }

  protected static final List xmlCalendarTypes = 
    Arrays.asList
      (new String[]
       {
         "date",
         "dateTime",
         "gDay",
         "gMonth",
         "gMonthDay",
         "gYear",
         "gYearMonth",
         "time"
       });

  public boolean isXMLCalendar()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String namespace = extendedMetaData.getNamespace(eDataType);
      String name = extendedMetaData.getName(eDataType);
      if (XMLTypePackage.eNS_URI.equals(namespace) && xmlCalendarTypes.contains(name))
      {
        return true;
      }
    }
    return false;
  }

  public boolean isXMLDuration()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String namespace = extendedMetaData.getNamespace(eDataType);
      String name = extendedMetaData.getName(eDataType);
      if (XMLTypePackage.eNS_URI.equals(namespace) && "duration".equals(name))
      {
        return true;
      }
    }
    return false;
  }

  public boolean isXMLBoolean()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String namespace = extendedMetaData.getNamespace(eDataType);
      String name = extendedMetaData.getName(eDataType);
      if (XMLTypePackage.eNS_URI.equals(namespace) && "boolean".equals(name))
      {
        return true;
      }
    }
    return false;
  }

  public List getPatterns()
  {
    List result = new ArrayList();
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List patterns = extendedMetaData.getPatternFacet(eDataType);
      if (!patterns.isEmpty())
      {
        List literals = new ArrayList();
        for (Iterator i = patterns.iterator(); i.hasNext(); )
        {
          literals.add(Literals.toLiteral(i.next()));
        }
        result.add(literals);
      }
    }
    return result;
  }

  public void initialize(EDataType eDataType)
  {
    setEcoreDataType(eDataType);
    List typeParameters = eDataType.getETypeParameters();
    LOOP:
    for (int i = 0; i < typeParameters.size(); ++i) 
    {
      ETypeParameter typeParameter = (ETypeParameter)typeParameters.get(i);

      for (int j = 0; j < getGenTypeParameters().size(); ++j)
      {
        GenTypeParameter genTypeParameter = (GenTypeParameter)getGenTypeParameters().get(j);
        if (genTypeParameter.getEcoreTypeParameter() == typeParameter)
        {
          genTypeParameter.initialize(typeParameter);
          if (i != j)
          {
            getGenTypeParameters().move(i, j);
          }

          continue LOOP;
        }
      }

      GenTypeParameter genTypeParameter = getGenModel().createGenTypeParameter();
      getGenTypeParameters().add(genTypeParameter);
      genTypeParameter.initialize(typeParameter);
    }
  }

  public boolean reconcile(GenDataType oldGenDataTypeVersion)
  {
    if (getEcoreDataType().getName().equals(oldGenDataTypeVersion.getEcoreDataType().getName()))
    {
      for (Iterator i = getGenTypeParameters().iterator(), j = oldGenDataTypeVersion.getGenTypeParameters().iterator(); i.hasNext() && j.hasNext(); )
      {
        GenTypeParameter genTypeParameter = (GenTypeParameter)i.next();
        GenTypeParameter oldGenTypeParameterVersion = (GenTypeParameter)j.next();
        genTypeParameter.reconcile(oldGenTypeParameterVersion);
      }

      reconcileSettings(oldGenDataTypeVersion);
      return true;
    }
    else
    {
      return false;
    }
  }

  protected void reconcileSettings(GenDataType oldGenDataTypeVersion)
  {
    reconcileGenAnnotations(oldGenDataTypeVersion);
  }

  public boolean reconcile()
  {
    try
    {
      EDataType eDataType = getEcoreDataType();
      if (eDataType == null || eDataType.eIsProxy() || eDataType.eResource() == null)
      {
        return false;
      }
      else
      {
        for (Iterator i = getGenTypeParameters().iterator(); i.hasNext(); )
        {
          GenTypeParameter genTypeParameter = (GenTypeParameter)i.next();
          if (!genTypeParameter.reconcile())
          {
            i.remove();
          }
        }

        return true;
      }
    }
    catch (RuntimeException exception)
    {
      return false;
    }
  }

  public List getGenConstraints()
  {
    List constraints = new UniqueEList(super.getGenConstraints());
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    EDataType eDataType = getEcoreDataType();
    // White space is not a constraint; it should affect createFromString only.
    //
    // if (extendedMetaData.getWhiteSpaceFacet(eDataType) != ExtendedMetaData.UNSPECIFIED_WHITE_SPACE)
    // {
    //   constraints.add("WhiteSpace");
    // }
    if (!extendedMetaData.getEnumerationFacet(eDataType).isEmpty())
    {
      constraints.add("Enumeration");
    }
    if (!extendedMetaData.getPatternFacet(eDataType).isEmpty())
    {
      constraints.add("Pattern");
    }
    if (extendedMetaData.getTotalDigitsFacet(eDataType) != -1)
    {
      constraints.add("TotalDigits");
    }
    if (extendedMetaData.getFractionDigitsFacet(eDataType) != -1)
    {
      constraints.add("FractionDigits");
    }
    if (extendedMetaData.getLengthFacet(eDataType) != -1)
    {
      constraints.add("MinLength");
      constraints.add("MaxLength");
    }
    if (extendedMetaData.getMinLengthFacet(eDataType) != -1)
    {
      constraints.add("MinLength");
    }
    if (extendedMetaData.getMaxLengthFacet(eDataType) != -1)
    {
      constraints.add("MaxLength");
    }
    if (extendedMetaData.getMinExclusiveFacet(eDataType) != null || extendedMetaData.getMinInclusiveFacet(eDataType) != null)
    {
      constraints.add("Min");
    }
    if (extendedMetaData.getMaxExclusiveFacet(eDataType) != null || extendedMetaData.getMaxInclusiveFacet(eDataType) != null)
    {
      constraints.add("Max");
    }
    if (getItemType() != null)
    {
      constraints.add("ItemType");
    }
    if (!getMemberTypes().isEmpty())
    {
      constraints.add("MemberTypes");
    }
    return constraints;
  }

  public List getAllGenConstraints()
  {
    List allBaseTypes = new ArrayList();
    if (getExtendedMetaData().getEnumerationFacet(getEcoreDataType()).isEmpty())
    {
      for (GenDataType baseType = getBaseType(); baseType != null; baseType = baseType.getBaseType())
      {
        allBaseTypes.add(baseType);
        if (!getExtendedMetaData().getEnumerationFacet(baseType.getEcoreDataType()).isEmpty())
        {
          break;
        }
      }
    }
    return collectGenConstraints(allBaseTypes, getGenConstraints(), null);
  }

  public GenClassifier getConstraintImplementor(String constraint)
  {
    for (GenDataType baseType = this; baseType != null; baseType = baseType.getBaseType())
    {
      if (baseType.getGenConstraints().contains(constraint))
      {
        return baseType;
      }
    }
    return null;
  }

  public GenClassifier getConstraintDelegate(String constraint)
  {
    for (GenDataType baseType = getBaseType(); baseType != null; baseType = baseType.getBaseType())
    {
      if (baseType.getGenConstraints().contains(constraint))
      {
        return baseType;
      }
    }
    return null;
  }

  public String getStaticValue(String literal)
  {
    EClassifier eDataType = getEcoreDataType();
    if (eDataType instanceof EEnum)
    {
      GenEnum genEnum = findGenEnum((EEnum)eDataType);
      return genEnum.getStaticValue(literal);
    }

    if (eDataType.getEPackage() != EcorePackage.eINSTANCE && literal != null)
    {
      boolean replaced = false;
      for (Iterator i = EcorePackage.eINSTANCE.getEClassifiers().iterator(); i.hasNext(); )
      {
        EClassifier eClassifier = (EClassifier)i.next();
        if (eClassifier instanceof EDataType && 
            eClassifier.getInstanceClassName().equals(eDataType.getInstanceClassName()) &&
            ((EDataType)eClassifier).isSerializable() &&
            eClassifier != EcorePackage.eINSTANCE.getEDate())
        {
          replaced = true;
          eDataType = eClassifier;
          break;
        }
      }
      if (!replaced)
      {
        String result = 
          getGenPackage().getQualifiedEFactoryInstanceAccessor() + 
            ".createFromString(" + 
            getGenPackage().getImportedPackageInterfaceName() + 
            ".eINSTANCE.get" + 
            getName() + 
            "(), " + 
            Literals.toLiteral(literal) +
            ")";
        if (isPrimitiveType())
        {
          result = "((" + getObjectInstanceClassName() + ")" + result + ")." + getPrimitiveValueFunction() + "()";
        }
        else if (!isObjectType())
        {
          result = "(" + getImportedInstanceClassName() + ")" + result;
        }
        return result;
      }
    }

    Object defaultObject = eDataType.getDefaultValue();
    if (literal != null)
    {
      try
      {
        defaultObject = 
          isXMLBoolean() ?
            XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getBoolean(), literal) :
            EcoreFactory.eINSTANCE.createFromString((EDataType)eDataType, literal);
      }
      catch (Exception e)
      {
        return "";  // cause a syntax error
      }
    }
    if (defaultObject == null) return "null";
    String result = Literals.toLiteral(defaultObject, getGenModel());

    // Include static field or constructor for wrapped primitive types.
    //
    Class typeClass = getInstanceClass(eDataType);
    if (typeClass == Boolean.class)
    {
      StringBuffer wrapped = new StringBuffer(getGenModel().getImportedName("java.lang.Boolean"));
      wrapped.append('.');
      wrapped.append(result.toUpperCase());
      result = wrapped.toString();
    }
    else if (typeClass == Character.class || typeClass == Byte.class || typeClass == Short.class || typeClass == Integer.class ||
             typeClass == Long.class || typeClass == Float.class || typeClass == Double.class)
    {
      StringBuffer wrapped = new StringBuffer("new ");
      wrapped.append(getGenModel().getImportedName(eDataType.getInstanceClassName()));
      wrapped.append('(');
      if (typeClass == Byte.class)
      {
        wrapped.append("(byte)");
      }
      else if (typeClass == Short.class)
      {
        wrapped.append("(short)");
      }
      wrapped.append(result);
      wrapped.append(')');
      result = wrapped.toString();
    }
    return result;
  }
}
