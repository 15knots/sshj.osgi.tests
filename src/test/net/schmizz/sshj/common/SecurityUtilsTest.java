/*******************************************************************************
 * Copyright (c) 2017 Martin Weber.
 *
 * Contributors:
 *      Martin Weber - Initial implementation
 *******************************************************************************/
package net.schmizz.sshj.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.schmizz.sshj.SSHClient;

/**
 * @author Martin Weber
 */
public class SecurityUtilsTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public final void testBouncyCastleProvider() {
    SecurityUtils.setRegisterBouncyCastle(true);
    // trigger a net.schmizz.sshj.common.SSHRuntimeException caused by
    // a ClassNotFoundException: org.bouncycastle.jce.provider.BouncyCastleProvider
    SecurityUtils.getSecurityProvider();
  }

}
