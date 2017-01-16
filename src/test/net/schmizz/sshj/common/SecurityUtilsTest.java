/*******************************************************************************
 * Copyright (c) 2017 Martin Weber.
 *
 * Contributors:
 *      Martin Weber - Initial implementation
 *******************************************************************************/
package net.schmizz.sshj.common;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Martin Weber
 */
public class SecurityUtilsTest {

  /**
   * Tests whether bouncycastle providers can be instantiated (OSGI inhibited loding classes from BC jar, if packages are not imported in sshj`s jar).
   *
   */
  @Test
  public final void testBouncyCastleProvider() {
    SecurityUtils.setRegisterBouncyCastle(true);
    // trigger a net.schmizz.sshj.common.SSHRuntimeException caused by
    // a ClassNotFoundException: org.bouncycastle.jce.provider.BouncyCastleProvider
    boolean res= SecurityUtils.isBouncyCastleRegistered();
    assertTrue("registered BC", res);
  }

}
