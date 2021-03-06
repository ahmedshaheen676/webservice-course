package com.shaheen;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebServiceClient(name = "HelloServiceImplService", targetNamespace = "http://shaheen.com/", wsdlLocation = "http://localhost:8080/Test/HelloService?wsdl")
public class HelloServiceImplService
        extends Service {

    private final static URL HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HELLOSERVICEIMPLSERVICE_QNAME = new QName("http://shaheen.com/", "HelloServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Test/HelloService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HELLOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HelloServiceImplService() {
        super(__getWsdlLocation(), HELLOSERVICEIMPLSERVICE_QNAME);
    }

    public HelloServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERVICEIMPLSERVICE_QNAME);
    }

    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICEIMPLSERVICE_EXCEPTION != null) {
            throw HELLOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

    /**
     * @return returns HelloServiceImpl
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloServiceImpl getHelloServiceImplPort() {
        return super.getPort(new QName("http://shaheen.com/", "HelloServiceImplPort"), HelloServiceImpl.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns HelloServiceImpl
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloServiceImpl getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://shaheen.com/", "HelloServiceImplPort"), HelloServiceImpl.class, features);
    }

}
