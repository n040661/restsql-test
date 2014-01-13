//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.15 at 09:54:44 PM EDT 
//


package org.restsql.service.testcase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.restsql.service.testcase package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Testcase_QNAME = new QName("http://restsql.org/schema", "testcase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.restsql.service.testcase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResetSequence }
     * 
     */
    public ResetSequence createResetSequence() {
        return new ResetSequence();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link SetupOrTeardown }
     * 
     */
    public SetupOrTeardown createSetupOrTeardown() {
        return new SetupOrTeardown();
    }

    /**
     * Create an instance of {@link ServiceTestCaseDefinition }
     * 
     */
    public ServiceTestCaseDefinition createServiceTestCaseDefinition() {
        return new ServiceTestCaseDefinition();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTestCaseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://restsql.org/schema", name = "testcase")
    public JAXBElement<ServiceTestCaseDefinition> createTestcase(ServiceTestCaseDefinition value) {
        return new JAXBElement<ServiceTestCaseDefinition>(_Testcase_QNAME, ServiceTestCaseDefinition.class, null, value);
    }

}
