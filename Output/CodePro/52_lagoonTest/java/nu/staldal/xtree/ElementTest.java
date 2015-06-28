package nu.staldal.xtree;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import nu.staldal.lsp.StringHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import org.apache.batik.dom.GenericDOMImplementation;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import nu.staldal.xmlutil.ContentHandlerAdapter;
import org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.dom.util.SAXDocumentFactory;
import org.apache.fop.configuration.ConfigurationParser;
import org.apache.fop.fo.FOTreeBuilder;
import org.apache.fop.layout.hyphenation.HyphenationTree;
import nu.staldal.xmlutil.ContentHandlerSnooper;
import org.apache.fop.layout.hyphenation.PatternConsumer;
import org.apache.fop.layout.hyphenation.PatternParser;
import org.apache.fop.render.pdf.FontReader;
import org.apache.tools.ant.Project;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lsp.servlet.ServletExtLib;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.iso_relax.verifier.Verifier;
import org.iso_relax.verifier.impl.ForkContentHandler;
import org.iso_relax.verifier.impl.VerifierFilterImpl;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;
import nu.staldal.lagoon.producer.BasicSplit;

/**
 * The class <code>ElementTest</code> contains tests for the class <code>{@link Element}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ElementTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Element fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Element("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Element("", "");
			fixture2.addNamespaceMapping("", "");
			fixture2.addNamespaceMapping("", "");
			fixture2.setBaseURI(new URL("http://www.eclipse.org"));
			fixture2.setNamespaceMappings(new Vector(), new Vector());
			fixture2.setNamespaceMappings(new Vector(), new Vector());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Element("", "");
			fixture3.addNamespaceMapping("", "");
			fixture3.addNamespaceMapping("", "");
			fixture3.setBaseURI(new URL("http://www.eclipse.org"));
			fixture3.setNamespaceMappings(new Vector(), new Vector());
			fixture3.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Element("", "");
			fixture4.addNamespaceMapping("", "");
			fixture4.addNamespaceMapping("", "");
			fixture4.setBaseURI(new URL("http://www.eclipse.org"));
			fixture4.setNamespaceMappings(new Vector(), new Vector());
			fixture4.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Element("", "");
			fixture5.addNamespaceMapping("", "");
			fixture5.addNamespaceMapping("", "");
			fixture5.setBaseURI(new URL("http://www.eclipse.org"));
			fixture5.setNamespaceMappings(new Vector(), new Vector());
			fixture5.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Element("", "");
			fixture6.addNamespaceMapping("", "");
			fixture6.addNamespaceMapping("", "");
			fixture6.setBaseURI(new URL("http://www.eclipse.org"));
			fixture6.setNamespaceMappings(new Vector(), new Vector());
			fixture6.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new Element("", "");
			fixture7.addNamespaceMapping("", "");
			fixture7.addNamespaceMapping("", "");
			fixture7.setBaseURI(new URL("http://www.eclipse.org"));
			fixture7.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture7.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new Element("", "");
			fixture8.addNamespaceMapping("", "");
			fixture8.addNamespaceMapping("", "");
			fixture8.setBaseURI(new URL("http://www.eclipse.org"));
			fixture8.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture8.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new Element("", "");
			fixture9.addNamespaceMapping("", "");
			fixture9.addNamespaceMapping("", "");
			fixture9.setBaseURI(new URL("http://www.eclipse.org"));
			fixture9.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture9.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new Element("", "");
			fixture10.addNamespaceMapping("", "");
			fixture10.addNamespaceMapping("", "");
			fixture10.setBaseURI(new URL("http://www.eclipse.org"));
			fixture10.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
			fixture10.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new Element("", "");
			fixture11.addNamespaceMapping("", "");
			fixture11.addNamespaceMapping("0123456789", "0123456789");
			fixture11.setBaseURI(new URL("http://www.eclipse.org"));
			fixture11.setNamespaceMappings(new Vector(), new Vector());
			fixture11.setNamespaceMappings(new Vector(), new Vector());
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new Element("", "");
			fixture12.addNamespaceMapping("", "");
			fixture12.addNamespaceMapping("0123456789", "0123456789");
			fixture12.setBaseURI(new URL("http://www.eclipse.org"));
			fixture12.setNamespaceMappings(new Vector(), new Vector());
			fixture12.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new Element("", "");
			fixture13.addNamespaceMapping("", "");
			fixture13.addNamespaceMapping("0123456789", "0123456789");
			fixture13.setBaseURI(new URL("http://www.eclipse.org"));
			fixture13.setNamespaceMappings(new Vector(), new Vector());
			fixture13.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new Element("", "");
			fixture14.addNamespaceMapping("", "");
			fixture14.addNamespaceMapping("0123456789", "0123456789");
			fixture14.setBaseURI(new URL("http://www.eclipse.org"));
			fixture14.setNamespaceMappings(new Vector(), new Vector());
			fixture14.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new Element("", "");
			fixture15.addNamespaceMapping("", "");
			fixture15.addNamespaceMapping("0123456789", "0123456789");
			fixture15.setBaseURI(new URL("http://www.eclipse.org"));
			fixture15.setNamespaceMappings(new Vector(), new Vector());
			fixture15.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new Element("", "");
			fixture16.addNamespaceMapping("", "");
			fixture16.addNamespaceMapping("0123456789", "0123456789");
			fixture16.setBaseURI(new URL("http://www.eclipse.org"));
			fixture16.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture16.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new Element("", "");
			fixture17.addNamespaceMapping("", "");
			fixture17.addNamespaceMapping("0123456789", "0123456789");
			fixture17.setBaseURI(new URL("http://www.eclipse.org"));
			fixture17.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture17.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new Element("", "");
			fixture18.addNamespaceMapping("", "");
			fixture18.addNamespaceMapping("0123456789", "0123456789");
			fixture18.setBaseURI(new URL("http://www.eclipse.org"));
			fixture18.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture18.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new Element("", "");
			fixture19.addNamespaceMapping("", "");
			fixture19.addNamespaceMapping("0123456789", "0123456789");
			fixture19.setBaseURI(new URL("http://www.eclipse.org"));
			fixture19.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
			fixture19.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new Element("", "");
			fixture20.addNamespaceMapping("", "");
			fixture20.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture20.setBaseURI(new URL("http://www.eclipse.org"));
			fixture20.setNamespaceMappings(new Vector(), new Vector());
			fixture20.setNamespaceMappings(new Vector(), new Vector());
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new Element("", "");
			fixture21.addNamespaceMapping("", "");
			fixture21.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture21.setBaseURI(new URL("http://www.eclipse.org"));
			fixture21.setNamespaceMappings(new Vector(), new Vector());
			fixture21.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new Element("", "");
			fixture22.addNamespaceMapping("", "");
			fixture22.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture22.setBaseURI(new URL("http://www.eclipse.org"));
			fixture22.setNamespaceMappings(new Vector(), new Vector());
			fixture22.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new Element("", "");
			fixture23.addNamespaceMapping("", "");
			fixture23.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture23.setBaseURI(new URL("http://www.eclipse.org"));
			fixture23.setNamespaceMappings(new Vector(), new Vector());
			fixture23.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new Element("", "");
			fixture24.addNamespaceMapping("", "");
			fixture24.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture24.setBaseURI(new URL("http://www.eclipse.org"));
			fixture24.setNamespaceMappings(new Vector(), new Vector());
			fixture24.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new Element("", "");
			fixture25.addNamespaceMapping("", "");
			fixture25.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture25.setBaseURI(new URL("http://www.eclipse.org"));
			fixture25.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture25.setNamespaceMappings(new Vector(0), new Vector(0));
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new Element("", "");
			fixture26.addNamespaceMapping("", "");
			fixture26.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture26.setBaseURI(new URL("http://www.eclipse.org"));
			fixture26.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture26.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new Element("", "");
			fixture27.addNamespaceMapping("", "");
			fixture27.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture27.setBaseURI(new URL("http://www.eclipse.org"));
			fixture27.setNamespaceMappings(new Vector(0), new Vector(0));
			fixture27.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new Element("", "");
			fixture28.addNamespaceMapping("", "");
			fixture28.addNamespaceMapping("An��t-1.0.txt", "An��t-1.0.txt");
			fixture28.setBaseURI(new URL("http://www.eclipse.org"));
			fixture28.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
			fixture28.setNamespaceMappings(new Vector(0, 0), new Vector(0, 0));
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new Element("", "", 0);
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Element
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Element getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new Element("", "", 0);
			fixture30.addNamespaceMapping("", "");
			fixture30.addNamespaceMapping("", "");
			fixture30.setBaseURI(new URL("http://www.eclipse.org"));
			fixture30.setNamespaceMappings(new Vector(), new Vector());
			fixture30.setNamespaceMappings(new Vector(), new Vector());
		}
		return fixture30;
	}

	/**
	 * Run the Element(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";

		Element result = new Element(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_2()
		throws Exception {
		String namespaceURI = null;
		String localName = null;

		Element result = new Element(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_3()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";

		Element result = new Element(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_4()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;

		Element result = new Element(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_5()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = -1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_6()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_7()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = -1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_8()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_9()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = -1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_10()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_11()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = -1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		//       at nu.staldal.xtree.Element.<init>(Element.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_12()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_13()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_14()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_15()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_16()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_17()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_18()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_19()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_20()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_21()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_22()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_23()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_24()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_25()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_26()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_27()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_28()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_29()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_30()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_31()
		throws Exception {
		String namespaceURI = null;
		String localName = "1";
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_32()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_33()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = 0;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_34()
		throws Exception {
		String namespaceURI = "1";
		String localName = null;
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_35()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 7;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testElement_36()
		throws Exception {
		String namespaceURI = "1";
		String localName = "1";
		int numberOfAttributes = 0;
		int numberOfChildren = 0;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals("", result.getTextContent());
		assertEquals(null, result.getFirstChildElementOrNull());
		assertEquals(0, result.numberOfNamespaceMappings());
		assertEquals(0, result.numberOfAttributes());
		assertEquals(false, result.getPreserveSpace());
		assertEquals("", result.getTextContentOrNull());
		assertEquals("1", result.getNamespaceURI());
		assertEquals("1", result.getLocalName());
		assertEquals(0, result.numberOfChildren());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "default";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		String namespaceURI = "";
		String localName = "space";
		String type = "0123456789";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "0123456789";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddAttribute_fixture4_2()
		throws Exception {
		Element fixture = getFixture4();
		String namespaceURI = "";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String prefix = "";
		String URI = "";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String prefix = "0123456789";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddNamespaceMapping_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String prefix = "";
		String URI = "0123456789";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String localName = "";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String localName = "0123456789";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture2_2()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture3_2()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture5_2()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture6_2()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture7_2()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture8_2()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture9_2()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture10_2()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture11_2()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture12_2()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture13_2()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture15_2()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture14_2()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture16_2()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture17_2()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture18_2()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture19_2()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture20_2()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture21_2()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture22_2()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture23_2()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture24_2()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture25_2()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture27_2()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture26_2()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture28_2()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture29_2()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture30_2()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_fixture1_3()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String localName = "";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture2_2()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture3_2()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture5_2()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture6_2()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture7_2()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture8_2()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture9_2()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture10_2()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture11_2()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture12_2()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture13_2()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture15_2()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture14_2()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture16_2()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture17_2()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture18_2()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture19_2()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture20_2()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture21_2()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture22_2()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture23_2()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture24_2()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture25_2()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture27_2()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture26_2()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture28_2()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture29_2()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture30_2()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttrValueOrNull_fixture1_3()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttributeLocalName_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = -1;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeLocalName_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 0;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttributeNamespaceURI_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = -1;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeNamespaceURI_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 0;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttributeType_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = -1;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeType_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 0;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetAttributeValue_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = -1;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetAttributeValue_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 0;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetBaseURI_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
		assertEquals("http://www.eclipse.org", result.toString());
		assertEquals("", result.getPath());
		assertEquals("www.eclipse.org", result.getAuthority());
		assertEquals(null, result.getQuery());
		assertEquals("http", result.getProtocol());
		assertEquals("", result.getFile());
		assertEquals("www.eclipse.org", result.getHost());
		assertEquals(null, result.getRef());
		assertEquals(null, result.getUserInfo());
		assertEquals(-1, result.getPort());
		assertEquals(80, result.getDefaultPort());
		assertEquals("http://www.eclipse.org", result.toExternalForm());
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture2_2()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture3_2()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture5_2()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture6_2()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture7_2()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture8_2()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture9_2()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture10_2()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture11_2()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture12_2()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture13_2()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture15_2()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture14_2()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture16_2()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture17_2()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture18_2()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture19_2()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture20_2()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture21_2()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture22_2()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture23_2()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture24_2()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture25_2()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture27_2()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture26_2()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture28_2()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture29_2()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture30_2()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_fixture1_3()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture2_2()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "1";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture3_2()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture5_2()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture6_2()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture7_2()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture8_2()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture9_2()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture10_2()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture11_2()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture12_2()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture13_2()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture15_2()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture14_2()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture16_2()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture17_2()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture18_2()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture19_2()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture20_2()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture21_2()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture22_2()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture23_2()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture24_2()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture25_2()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture27_2()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture26_2()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture28_2()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture29_2()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture30_2()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_fixture1_3()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetInheritedAttribute_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetLocalName_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		String result = fixture.getLocalName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = 0;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 1;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetNamespaceMapping_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 7;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNamespaceURI_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetPreserveSpace_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContent_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		String result = fixture.getTextContent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTextContentOrNull_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupAttribute_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		String namespaceURI = "";
		String localName = "0123456789";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0 >= 0
		//       at java.util.Vector.elementAt(Vector.java:470)
		//       at nu.staldal.xtree.Element.lookupNamespacePrefix(Element.java:395)
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespacePrefix_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String URI = "0";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLookupNamespaceURI_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		String prefix = "0";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfAttributes_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.endElement(ContentHandlerSnooper.java:114)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		ContentHandler sax = new BasicSplit();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		ContentHandler sax = new IslandSplit();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.ContentHandlerStartEndDocumentFilter.endElement(ContentHandlerStartEndDocumentFilter.java:100)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		ContentHandler sax = new StringHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		ContentHandler sax = new ServletExtLib();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.SimpleExtLib.endElement(SimpleExtLib.java:201)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xmltree.TreeBuilder.endElement(TreeBuilder.java:291)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xmltree.TreeBuilder.endElement(TreeBuilder.java:291)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.endElement(ContentHandlerAdapter.java:139)
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		ContentHandler sax = new TreeBuilder();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		ContentHandler sax = new SAXSVGDocumentFactory("");

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.endElement(SAXDocumentFactory.java:664)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.endElement(SAXDocumentFactory.java:664)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		ContentHandler sax = new ConfigurationParser();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		ContentHandler sax = new FOTreeBuilder();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.fop.fo.FOTreeBuilder.endElement(FOTreeBuilder.java:216)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		ContentHandler sax = new PatternParser();

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		ContentHandler sax = new PatternParser(new HyphenationTree());

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.tools.ant.helper.ProjectHelper2$RootHandler.endElement(ProjectHelper2.java:526)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.ForkContentHandler.endElement(ForkContentHandler.java:80)
		//       at nu.staldal.xtree.Element.outputEndElement(Element.java:501)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);

		fixture.outputEndElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		ContentHandler sax = new DefaultHandler2();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEndElement_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		ContentHandler sax = new DefaultHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.startElement(ContentHandlerSnooper.java:103)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		ContentHandler sax = new BasicSplit();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		ContentHandler sax = new IslandSplit();

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.ContentHandlerStartEndDocumentFilter.startElement(ContentHandlerStartEndDocumentFilter.java:92)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		ContentHandler sax = new StringHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		ContentHandler sax = new ServletExtLib();

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.SimpleExtLib.startElement(SimpleExtLib.java:186)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.startElement(ContentHandlerAdapter.java:129)
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		ContentHandler sax = new TreeBuilder();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		ContentHandler sax = new SAXSVGDocumentFactory("");

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.startElement(SAXDocumentFactory.java:576)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.startElement(SAXDocumentFactory.java:576)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		ContentHandler sax = new ConfigurationParser();

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationParser.startElement(ConfigurationParser.java:190)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		ContentHandler sax = new FOTreeBuilder();

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.fo.FOTreeBuilder.startElement(FOTreeBuilder.java:319)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		ContentHandler sax = new PatternParser();

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		ContentHandler sax = new PatternParser(new HyphenationTree());

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.tools.ant.helper.ProjectHelper2$RootHandler.startElement(ProjectHelper2.java:498)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.ForkContentHandler.startElement(ForkContentHandler.java:75)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);

		fixture.outputStartElement(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		ContentHandler sax = new DefaultHandler2();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputStartElement_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testOutputStartElement_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		int index = 0;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		int index = 1;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveAttribute_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		int index = 7;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBaseURI_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		URL URI = null;

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		Vector prefixes = new Vector();
		Vector URIs = new Vector();

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		Vector prefixes = new Vector(0);
		Vector URIs = new Vector(0);

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		Vector prefixes = new Vector(0, 0);
		Vector URIs = new Vector(0, 0);

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(1, 1);

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		Vector prefixes = new Vector(new ArrayList());
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		Vector prefixes = new Vector();
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		Vector prefixes = new Vector(0);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		Vector prefixes = new Vector(0, 0);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNamespaceMappings_fixture1_2()
		throws Exception {
		Element fixture = getFixture1();
		Vector prefixes = new Vector(1, 1);
		Vector URIs = new Vector(new ArrayList());

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_1()
		throws Exception {
		Element fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.startElement(ContentHandlerSnooper.java:103)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_1()
		throws Exception {
		Element fixture = getFixture2();
		ContentHandler sax = new BasicSplit();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture4_1()
		throws Exception {
		Element fixture = getFixture4();
		ContentHandler sax = new IslandSplit();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture3_1()
		throws Exception {
		Element fixture = getFixture3();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.ContentHandlerStartEndDocumentFilter.startElement(ContentHandlerStartEndDocumentFilter.java:92)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture5_1()
		throws Exception {
		Element fixture = getFixture5();
		ContentHandler sax = new StringHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture6_1()
		throws Exception {
		Element fixture = getFixture6();
		ContentHandler sax = new ServletExtLib();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.SimpleExtLib.startElement(SimpleExtLib.java:186)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture7_1()
		throws Exception {
		Element fixture = getFixture7();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture8_1()
		throws Exception {
		Element fixture = getFixture8();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture9_1()
		throws Exception {
		Element fixture = getFixture9();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture10_1()
		throws Exception {
		Element fixture = getFixture10();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture11_1()
		throws Exception {
		Element fixture = getFixture11();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.startElement(ContentHandlerAdapter.java:129)
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture12_1()
		throws Exception {
		Element fixture = getFixture12();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture13_1()
		throws Exception {
		Element fixture = getFixture13();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture15_1()
		throws Exception {
		Element fixture = getFixture15();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture14_1()
		throws Exception {
		Element fixture = getFixture14();
		ContentHandler sax = new TreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture16_1()
		throws Exception {
		Element fixture = getFixture16();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture17_1()
		throws Exception {
		Element fixture = getFixture17();
		ContentHandler sax = new SAXSVGDocumentFactory("");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.startElement(SAXDocumentFactory.java:576)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture18_1()
		throws Exception {
		Element fixture = getFixture18();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.startElement(SAXDocumentFactory.java:576)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture19_1()
		throws Exception {
		Element fixture = getFixture19();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchFieldError: parser
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.registerCustomCSSValueFactory(Unknown Source)
		//       at org.apache.batik.extension.svg.BatikDomExtension.registerTags(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<init>(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<clinit>(Unknown Source)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture20_1()
		throws Exception {
		Element fixture = getFixture20();
		ContentHandler sax = new ConfigurationParser();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationParser.startElement(ConfigurationParser.java:190)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture21_1()
		throws Exception {
		Element fixture = getFixture21();
		ContentHandler sax = new FOTreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.fo.FOTreeBuilder.startElement(FOTreeBuilder.java:319)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture22_1()
		throws Exception {
		Element fixture = getFixture22();
		ContentHandler sax = new PatternParser();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture23_1()
		throws Exception {
		Element fixture = getFixture23();
		ContentHandler sax = new PatternParser(new HyphenationTree());

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture24_1()
		throws Exception {
		Element fixture = getFixture24();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture27_1()
		throws Exception {
		Element fixture = getFixture27();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.tools.ant.helper.ProjectHelper2$RootHandler.startElement(ProjectHelper2.java:498)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture26_1()
		throws Exception {
		Element fixture = getFixture26();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.ForkContentHandler.startElement(ForkContentHandler.java:75)
		//       at nu.staldal.xtree.Element.outputStartElement(Element.java:490)
		//       at nu.staldal.xtree.Element.toSAX(Element.java:513)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture28_1()
		throws Exception {
		Element fixture = getFixture28();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture29_1()
		throws Exception {
		Element fixture = getFixture29();
		ContentHandler sax = new DefaultHandler2();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture30_1()
		throws Exception {
		Element fixture = getFixture30();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testToSAX_fixture25_1()
		throws Exception {
		Element fixture = getFixture25();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ElementTest.class);
	}
}