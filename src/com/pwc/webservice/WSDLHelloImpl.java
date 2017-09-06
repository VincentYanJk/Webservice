/**
 * WSDLHelloImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pwc.webservice;

public interface WSDLHelloImpl extends javax.xml.rpc.Service {
    public java.lang.String getWSDLHelloImplPortAddress();

    public com.pwc.webservice.WSDLHelloWord getWSDLHelloImplPort() throws javax.xml.rpc.ServiceException;

    public com.pwc.webservice.WSDLHelloWord getWSDLHelloImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
