package com.sap.netweaver.porta.core.nw7;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.AccessPoint;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEPSTATE;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEProcess;
import com.sap.managementconsole.soap.axis.sapcontrol.SAPControlPortType;
import com.sap.managementconsole.soap.axis.sapcontrol.SAPControl_BindingStub;
import com.sap.netweaver.porta.core.ServerState;

/**
 * The class <code>LMUtilsImplTest</code> contains tests for the class <code>{@link LMUtilsImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:51 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LMUtilsImplTest {
	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_3()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "J2EE Bootstrap", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_4()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_5()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_6()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_7()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_8()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_9()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_10()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_11()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_12()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "")};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState determineServerState(J2EEProcess[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testDetermineServerState_13()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		J2EEProcess[] processes = new J2EEProcess[] {null, null};

		ServerState result = fixture.determineServerState(processes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint findIcmHttpAccessPoint(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testFindIcmHttpAccessPoint_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		AccessPoint result = fixture.findIcmHttpAccessPoint(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint findIcmHttpAccessPoint(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testFindIcmHttpAccessPoint_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		AccessPoint result = fixture.findIcmHttpAccessPoint(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint findIcmHttpAccessPoint(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testFindIcmHttpAccessPoint_3()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		AccessPoint result = fixture.findIcmHttpAccessPoint(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint findIcmHttpAccessPoint(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testFindIcmHttpAccessPoint_4()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		AccessPoint result = fixture.findIcmHttpAccessPoint(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint findIcmHttpAccessPoint(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testFindIcmHttpAccessPoint_5()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		AccessPoint result = fixture.findIcmHttpAccessPoint(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxy(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSProxy_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		URL wsUrl = new URL("");

		SAPControlPortType result = fixture.getSAPControlWSProxy(wsUrl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxy(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetSAPControlWSProxy_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		URL wsUrl = new URL("");

		SAPControlPortType result = fixture.getSAPControlWSProxy(wsUrl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_3()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_4()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_5()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_6()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_7()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControlWSProxyToFirstJ2EEInstance(SAPControlPortType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetSAPControlWSProxyToFirstJ2EEInstance_8()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		SAPControlPortType control = new SAPControl_BindingStub();

		SAPControlPortType result = fixture.getSAPControlWSProxyToFirstJ2EEInstance(control);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getSAPControlWSUrlByInstance(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSUrlByInstance_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		String host = "";
		int instNr = 1;

		URL result = fixture.getSAPControlWSUrlByInstance(host, instNr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getSAPControlWSUrlByInstance(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testGetSAPControlWSUrlByInstance_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		String host = "";
		int instNr = 1;

		URL result = fixture.getSAPControlWSUrlByInstance(host, instNr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getSAPControlWSUrlByPort(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testGetSAPControlWSUrlByPort_1()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		String host = "";
		int port = 1;

		URL result = fixture.getSAPControlWSUrlByPort(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getSAPControlWSUrlByPort(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testGetSAPControlWSUrlByPort_2()
		throws Exception {
		LMUtilsImpl fixture = new LMUtilsImpl();
		String host = "";
		int port = 1;

		URL result = fixture.getSAPControlWSUrlByPort(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LMUtilsImplTest.class);
	}
}