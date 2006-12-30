/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 IBM Corporation and others.
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
 * $Id: DynamicIPOSDOLoadTest.java,v 1.13 2006/12/30 03:43:52 marcelop Exp $
 */
package org.eclipse.emf.test.performance.sdo.deserialization;


import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.HashMap;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.sdo.util.SDOUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.test.performance.EMFPerformanceTestCase;
import org.eclipse.emf.test.performance.TestUtil;
import org.eclipse.emf.test.performance.sdo.SDOPerfUtil;

import commonj.sdo.DataGraph;


/**
 * Loads/deserializes SDO instances of dynamic International Purchase Order (IPO) model. 
 */
public class DynamicIPOSDOLoadTest extends EMFPerformanceTestCase
{
  private static final String DATA = TestUtil.getPluginDirectory() + "/data/";

  private static String XML_SCHEMA_URI;

  private static String XML_INSTANCE;

  final static int REPETITIONS = 50;

  final static int ITERATIONS = 2000;

  final static int WARMUP = 3000;

  private HashMap<Object, Object> options;

  protected ResourceSet resourceSet;

  protected DataGraph dataGraph;

  private XMLParserPool parserPool;

  private ByteArrayInputStream dgByteInputStream;

  public DynamicIPOSDOLoadTest(String name)
  {
    super(name);
    XML_SCHEMA_URI = "file:///" + DATA + "ipo.xsd";
    XML_INSTANCE = DATA + "ipoDG.xml";
  }

  public static Test suite()
  {
    TestSuite ts = new TestSuite("DynamicIPOSDOLoadTest");

    ts.addTest(new DynamicIPOSDOLoadTest("loadWithNoOptions").setRepetitions(REPETITIONS));
    ts.addTest(new DynamicIPOSDOLoadTest("loadWithParserCache").setRepetitions(REPETITIONS));
    ts.addTest(new DynamicIPOSDOLoadTest("loadWithParserAndFeatureMapCache").setRepetitions(REPETITIONS));

    return ts;
  }

  @Override
  protected void setUp() throws Exception
  {
    super.setUp();
    tagAsSummary("Performance Results for " + getClass().getName(), TIME_DIMENSIONS);

    HashMap<Object, Object> warmupOptions = new HashMap<Object, Object>();
    options = new HashMap<Object, Object>();
    parserPool = new XMLParserPoolImpl(true);

    resourceSet = SDOUtil.createResourceSet();
    ExtendedMetaData metaData = registerModel();
    options.put(XMLResource.OPTION_EXTENDED_META_DATA, metaData);

    FileInputStream fileInputStream = new FileInputStream(XML_INSTANCE);
    byte[] dataGraphBytes = new byte [fileInputStream.available()];
    fileInputStream.read(dataGraphBytes);
    dgByteInputStream = new ByteArrayInputStream(dataGraphBytes);

    warmupOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, metaData);
    warmupOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl(true));
    warmupOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());

    load(warmupOptions, WARMUP);
  }

  protected ExtendedMetaData registerModel()
  {
    return SDOPerfUtil.registerModel(resourceSet, XML_SCHEMA_URI);
  }

  /**
   * <p>
   * Loads/deserializes a static or dynamic instance of the EMF International Purchase Order (IPO) model.
   * Options: none
   * </p>
   * @throws Exception 
   */
  public void loadWithNoOptions() throws Exception
  {
    startMeasuring();
    load(options, ITERATIONS);
    stopMeasuring();
  }

  /**
   * <p>
   * Loads/deserializes a static or dynamic instance of the SDO International Purchase Order (IPO) model.
   * Options:
   * <ul>
   * <li>XMLResource.OPTION_USE_PARSER_POOL</li>
   * </ul>
   * </p>
   * @throws Exception 
   */
  public void loadWithParserCache() throws Exception
  {
    options.put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
    startMeasuring();
    load(options, ITERATIONS);
    stopMeasuring();
  }

  /**
   * <p>
   * Loads/deserializes a static or dynamic instance of the SDO International Purchase Order (IPO) model.
   * Options:
   * <ul>
   * <li>XMLResource.OPTION_USE_PARSER_POOL</li>
   * <li>XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP</li>
   * </ul>
   * </p>
   * @throws Exception 
   */
  public void loadWithParserAndFeatureMapCache() throws Exception
  {
    options.put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
    options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
    startMeasuring();
    load(options, ITERATIONS);
    stopMeasuring();
  }

  protected final void load(HashMap<Object, Object> loadOptions, int iterations) throws Exception
  {
    for (int i = 0; i < iterations; i++)
    {
      resourceSet.getResources().clear();
      dataGraph = SDOUtil.loadDataGraph(dgByteInputStream, loadOptions);
      dgByteInputStream.reset();
    }
  }

}
