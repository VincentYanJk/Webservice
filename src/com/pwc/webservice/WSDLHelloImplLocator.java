/**
 * WSDLHelloImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pwc.webservice;

public class WSDLHelloImplLocator extends org.apache.axis.client.Service implements com.pwc.webservice.WSDLHelloImpl {

    public WSDLHelloImplLocator() {
    }


    public WSDLHelloImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSDLHelloImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSDLHelloImplPort
    private java.lang.String WSDLHelloImplPort_address = "http://172.31.160.190/Webservice";

    public java.lang.String getWSDLHelloImplPortAddress() {
        return WSDLHelloImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSDLHelloImplPortWSDDServiceName = "WSDLHelloImplPort";

    public java.lang.String getWSDLHelloImplPortWSDDServiceName() {
        return WSDLHelloImplPortWSDDServiceName;
    }

    public void setWSDLHelloImplPortWSDDServiceName(java.lang.String name) {
        WSDLHelloImplPortWSDDServiceName = name;
    }

    public com.pwc.webservice.WSDLHelloWord getWSDLHelloImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSDLHelloImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSDLHelloImplPort(endpoint);
    }

    public com.pwc.webservice.WSDLHelloWord getWSDLHelloImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pwc.webservice.WSDLHelloImplPortBindingStub _stub = new com.pwc.webservice.WSDLHelloImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWSDLHelloImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSDLHelloImplPortEndpointAddress(java.lang.String address) {
        WSDLHelloImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pwc.webservice.WSDLHelloWord.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pwc.webservice.WSDLHelloImplPortBindingStub _stub = new com.pwc.webservice.WSDLHelloImplPortBindingStub(new java.net.URL(WSDLHelloImplPort_address), this);
                _stub.setPortName(getWSDLHelloImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSDLHelloImplPort".equals(inputPortName)) {
            return getWSDLHelloImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.pwc.com/", "WSDLHelloImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.pwc.com/", "WSDLHelloImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSDLHelloImplPort".equals(portName)) {
            setWSDLHelloImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
