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
 * $Id: EMFPerformanceTestCase.java,v 1.23 2006/12/30 03:43:52 marcelop Exp $
 */
package org.eclipse.emf.test.performance;


import java.util.Calendar;

import org.eclipse.test.performance.Dimension;
import org.eclipse.test.performance.PerformanceTestCase;


/**
 * <p>
 * Base class for the EMF performance test cases.  Highlights:
 * <ul>
 * <li>The actions performed by the <tt>setUp</tt> and <tt>tearDown</tt> methods
 * don't affect the measurements.</li>
 * <li>Invoking <tt><b>super.</b>setUp</tt> and <tt><b>super.</b>tearDown</tt> is
 * mandatory if these methods are being overwritten by subclasses</li>
 * <li>The <tt>repetitions</tt> attribute defines how many times a test will be invoked.
 * If the <tt>startMeasuring</tt> and <tt>stopMeasuring</tt> are invoked in the test, each
 * iteration is measured and the final result is an average of all repetitions.  The default
 * number of repetitions is 1.</li>
 * <li>The <tt>warmUp</tt> attribute defines how many times a test will be invoked
 * <b>before</b> the measurements take place.  The <tt>startMeasuring</tt> and
 * <tt>stopMeasuring</tt> methods won't do anything while the test is being warmed up.</li>
 * </ul>
 * </p>
 * @since 2.1.0
 */
public class EMFPerformanceTestCase extends PerformanceTestCase
{
  public static final Dimension[] TIME_DIMENSIONS = new Dimension []{ Dimension.CPU_TIME, Dimension.ELAPSED_PROCESS, Dimension.KERNEL_TIME };

  public static final Dimension[] MEMORY_DIMENSIONS = new Dimension []{
    Dimension.COMITTED,
    Dimension.USED_JAVA_HEAP,
    Dimension.WORKING_SET,
    Dimension.WORKING_SET_PEAK };

  public static final Dimension[] ALL_DIMENSIONS = new Dimension []{
    Dimension.COMITTED,
    Dimension.CPU_TIME,
    Dimension.ELAPSED_PROCESS,
    Dimension.KERNEL_TIME,
    Dimension.USED_JAVA_HEAP,
    Dimension.WORKING_SET,
    Dimension.WORKING_SET_PEAK };

  private int repetitions = 1;

  private int warmUp = 0;

  private boolean warmingUp = false;

  public EMFPerformanceTestCase(String name)
  {
    super(name);
  }

  public EMFPerformanceTestCase()
  {
    super();
  }

  public EMFPerformanceTestCase setRepetitions(int repeat)
  {
    this.repetitions = repeat;
    return this;
  }

  public int getRepetitions()
  {
    return repetitions;
  }

  public EMFPerformanceTestCase setWarmUp(int warmUp)
  {
    this.warmUp = warmUp;
    return this;
  }

  public int getWarmUp()
  {
    return warmUp;
  }

  protected boolean isWarmingUp()
  {
    return warmingUp;
  }

  @Override
  protected void startMeasuring()
  {
    if (TestUtil.isRunningUnderEclipse() && !isWarmingUp())
    {
      super.startMeasuring();
    }
  }

  @Override
  protected void stopMeasuring()
  {
    if (TestUtil.isRunningUnderEclipse() && !isWarmingUp())
    {
      super.stopMeasuring();
    }
  }

  @Override
  protected void setUp() throws Exception
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      super.setUp();
    }
  }

  @Override
  protected void runTest() throws Throwable
  {
    assertTrue("Iterations must be greater than 0", getRepetitions() > 0);

    String testMethodName = this.getClass().getName();
    testMethodName = testMethodName.substring(testMethodName.lastIndexOf('.') + 1) + "#" + this.getName();
    System.out.println();
    System.out.println(timeStamp() + " Warming up " + testMethodName + "()...");

    warmUp();

    System.out.println(timeStamp() + " Warmed. GC and sleep...");
    System.gc();
    Thread.sleep(1000);

    if (!TestUtil.isRunningUnderEclipse())
    {
      System.out.print("Hit Enter after starting the profiler and clearing profiling data");
      System.in.read();
    }

    System.out.println(timeStamp() + " Starting...");

    for (int i = 0, maxi = getRepetitions(); i < maxi; i++)
    {
      super.runTest();
    }
    System.out.println(timeStamp() + " Done.");
  }

  protected void warmUp() throws Throwable
  {
    warmingUp = true;
    try
    {
      for (int i = 0, maxi = getWarmUp(); i < maxi; i++)
      {
        super.runTest();
      }
    }
    finally
    {
      warmingUp = false;
    }
  }

  @Override
  protected void tearDown() throws Exception
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      commitMeasurements();
      assertPerformance();
      super.tearDown();
    }
  }

  @Override
  public void tagAsGlobalSummary(String shortName, Dimension dimension)
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      super.tagAsGlobalSummary(shortName, dimension);
    }
  }

  @Override
  public void tagAsGlobalSummary(String shortName, Dimension[] dimensions)
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      super.tagAsGlobalSummary(shortName, dimensions);
    }
  }

  @Override
  public void tagAsSummary(String shortName, Dimension dimension)
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      super.tagAsSummary(shortName, dimension);
    }
  }

  @Override
  public void tagAsSummary(String shortName, Dimension[] dimensions)
  {
    if (TestUtil.isRunningUnderEclipse())
    {
      super.tagAsSummary(shortName, dimensions);
    }
  }

  protected static String timeStamp()
  {
    Calendar cal = Calendar.getInstance();
    return "[" + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + "."
      + cal.get(Calendar.MILLISECOND) + "]";
  }

}