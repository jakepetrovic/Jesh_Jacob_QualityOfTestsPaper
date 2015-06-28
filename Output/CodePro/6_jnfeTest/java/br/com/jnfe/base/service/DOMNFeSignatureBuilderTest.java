package br.com.jnfe.base.service;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>DOMNFeSignatureBuilderTest</code> contains tests for the class <code>{@link DOMNFeSignatureBuilder}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DOMNFeSignatureBuilderTest {
	/**
	 * Run the DOMNFeSignatureBuilder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testDOMNFeSignatureBuilder_1()
		throws Exception {

		DOMNFeSignatureBuilder result = new DOMNFeSignatureBuilder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: br/com/jnfe/base/service/DOMNFeSignatureBuilder : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_2()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory((XMLSignatureFactory) null);
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_3()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_4()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory((XMLSignatureFactory) null);
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_5()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_6()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory((XMLSignatureFactory) null);
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_7()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_8()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory((XMLSignatureFactory) null);
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_9()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.InvalidAlgorithmParameterException.class)
	public void testAfterPropertiesSet_10()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory((XMLSignatureFactory) null);
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testAfterPropertiesSet_11()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void build(Element,Element,Certificate,PrivateKey) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testBuild_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		Element elementToSign = new IIOMetadataNode();
		Element parentElement = new IIOMetadataNode();
		Certificate certificate = null;
		PrivateKey privateKey = null;

		fixture.build(elementToSign, parentElement, certificate, privateKey);

		// add additional test code here
	}

	/**
	 * Run the void build(Element,Element,Certificate,PrivateKey) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testBuild_2()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		Element elementToSign = new IIOMetadataNode();
		Element parentElement = new IIOMetadataNode();
		Certificate certificate = null;
		PrivateKey privateKey = null;

		fixture.build(elementToSign, parentElement, certificate, privateKey);

		// add additional test code here
	}

	/**
	 * Run the DigestMethod getDigestMethod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetDigestMethod_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		DigestMethod result = fixture.getDigestMethod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Reference newReference(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewReference_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		String URI = "";

		Reference result = fixture.newReference(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Reference> newReferenceList(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewReferenceList_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		Element elementToSign = new IIOMetadataNode();

		List<Reference> result = fixture.newReferenceList(elementToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SignedInfo newSignedInfo(List<Reference>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewSignedInfo_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		List<Reference> refList = new ArrayList();

		SignedInfo result = fixture.newSignedInfo(refList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SignedInfo newSignedInfo(List<Reference>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.InvalidAlgorithmParameterException.class)
	public void testNewSignedInfo_2()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		List<Reference> refList = new ArrayList();

		SignedInfo result = fixture.newSignedInfo(refList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SignedInfo newSignedInfo(List<Reference>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.InvalidAlgorithmParameterException.class)
	public void testNewSignedInfo_3()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		List<Reference> refList = new ArrayList();

		SignedInfo result = fixture.newSignedInfo(refList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SignedInfo newSignedInfo(List<Reference>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testNewSignedInfo_4()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		List<Reference> refList = new ArrayList();

		SignedInfo result = fixture.newSignedInfo(refList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SignedInfo newSignedInfo(List<Reference>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testNewSignedInfo_5()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		List<Reference> refList = new ArrayList();

		SignedInfo result = fixture.newSignedInfo(refList);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Transform> newTransformList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewTransformList_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		List<Transform> result = fixture.newTransformList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Transform> newTransformList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.InvalidAlgorithmParameterException.class)
	public void testNewTransformList_2()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		List<Transform> result = fixture.newTransformList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Transform> newTransformList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.InvalidAlgorithmParameterException.class)
	public void testNewTransformList_3()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		List<Transform> result = fixture.newTransformList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Transform> newTransformList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testNewTransformList_4()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		List<Transform> result = fixture.newTransformList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Transform> newTransformList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testNewTransformList_5()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);

		List<Transform> result = fixture.newTransformList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDigestMethod(DigestMethod) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetDigestMethod_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		DigestMethod digestMethod = null;

		fixture.setDigestMethod(digestMethod);

		// add additional test code here
	}

	/**
	 * Run the void setKeyInfoBuilder(KeyInfoBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetKeyInfoBuilder_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		KeyInfoBuilder keyInfoBuilder = new DOMNFeKeyInfoBuilder();

		fixture.setKeyInfoBuilder(keyInfoBuilder);

		// add additional test code here
	}

	/**
	 * Run the void setXMLSignatureFactory(XMLSignatureFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetXMLSignatureFactory_1()
		throws Exception {
		DOMNFeSignatureBuilder fixture = new DOMNFeSignatureBuilder();
		fixture.setKeyInfoBuilder(new DOMNFeKeyInfoBuilder());
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		fixture.setDigestMethod((DigestMethod) null);
		XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance();

		fixture.setXMLSignatureFactory(signatureFactory);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DOMNFeSignatureBuilderTest.class);
	}
}