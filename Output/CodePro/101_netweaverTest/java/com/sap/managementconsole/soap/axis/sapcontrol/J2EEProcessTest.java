package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EEProcessTest</code> contains tests for the class <code>{@link J2EEProcess}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:45 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EEProcessTest {
	/**
	 * Run the J2EEProcess() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testJ2EEProcess_1()
		throws Exception {

		J2EEProcess result = new J2EEProcess();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess(int,String,int,String,String,String,J2EEPSTATE,String,String,String,int,int,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testJ2EEProcess_2()
		throws Exception {
		int telnetPort = 1;
		String name = "";
		int pid = 1;
		String type = "";
		String restart = "";
		String exitCode = "";
		J2EEPSTATE state = J2EEPSTATE.fromString("");
		String statetext = "";
		String startTime = "";
		String elapsedTime = "";
		int restartCount = 1;
		int errorCount = 1;
		String cpu = "";
		String debug = "";

		J2EEProcess result = new J2EEProcess(telnetPort, name, pid, type, restart, exitCode, state, statetext, startTime, elapsedTime, restartCount, errorCount, cpu, debug);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCpu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetCpu_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getCpu();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDebug() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetDebug_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getDebug();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EEProcess.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getElapsedTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetElapsedTime_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getElapsedTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getErrorCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetErrorCount_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.getErrorCount();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getExitCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetExitCode_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getExitCode();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetPid_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.getPid();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getRestart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetRestart_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getRestart();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getRestartCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetRestartCount_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.getRestartCount();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EEProcess.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStartTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetStartTime_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getStartTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEPSTATE getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		J2EEPSTATE result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStatetext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetStatetext_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getStatetext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getTelnetPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetTelnetPort_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.getTelnetPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		String result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EEProcess.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, (String) null, 1, (String) null, (String) null, (String) null, J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", (J2EEPSTATE) null, (String) null, (String) null, (String) null, 1, 1, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setCpu(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetCpu_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String cpu = "";

		fixture.setCpu(cpu);

		// add additional test code here
	}

	/**
	 * Run the void setDebug(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetDebug_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String debug = "";

		fixture.setDebug(debug);

		// add additional test code here
	}

	/**
	 * Run the void setElapsedTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetElapsedTime_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String elapsedTime = "";

		fixture.setElapsedTime(elapsedTime);

		// add additional test code here
	}

	/**
	 * Run the void setErrorCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetErrorCount_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		int errorCount = 1;

		fixture.setErrorCount(errorCount);

		// add additional test code here
	}

	/**
	 * Run the void setExitCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetExitCode_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String exitCode = "";

		fixture.setExitCode(exitCode);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPid(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetPid_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		int pid = 1;

		fixture.setPid(pid);

		// add additional test code here
	}

	/**
	 * Run the void setRestart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetRestart_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String restart = "";

		fixture.setRestart(restart);

		// add additional test code here
	}

	/**
	 * Run the void setRestartCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetRestartCount_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		int restartCount = 1;

		fixture.setRestartCount(restartCount);

		// add additional test code here
	}

	/**
	 * Run the void setStartTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetStartTime_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String startTime = "";

		fixture.setStartTime(startTime);

		// add additional test code here
	}

	/**
	 * Run the void setState(J2EEPSTATE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		J2EEPSTATE state = J2EEPSTATE.fromString("");

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setStatetext(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetStatetext_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String statetext = "";

		fixture.setStatetext(statetext);

		// add additional test code here
	}

	/**
	 * Run the void setTelnetPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetTelnetPort_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		int telnetPort = 1;

		fixture.setTelnetPort(telnetPort);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		J2EEProcess fixture = new J2EEProcess(1, "", 1, "", "", "", J2EEPSTATE.fromString(""), "", "", "", 1, 1, "", "");
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:45 AM
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
	 * @generatedBy CodePro at 4/8/14 11:45 AM
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
	 * @generatedBy CodePro at 4/8/14 11:45 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EEProcessTest.class);
	}
}