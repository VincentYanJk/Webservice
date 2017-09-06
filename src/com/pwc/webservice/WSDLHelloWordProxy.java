package com.pwc.webservice;

public class WSDLHelloWordProxy implements com.pwc.webservice.WSDLHelloWord {
  private String _endpoint = null;
  private com.pwc.webservice.WSDLHelloWord wSDLHelloWord = null;
  
  public WSDLHelloWordProxy() {
    _initWSDLHelloWordProxy();
  }
  
  public WSDLHelloWordProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSDLHelloWordProxy();
  }
  
  private void _initWSDLHelloWordProxy() {
    try {
      wSDLHelloWord = (new com.pwc.webservice.WSDLHelloImplLocator()).getWSDLHelloImplPort();
      if (wSDLHelloWord != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSDLHelloWord)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSDLHelloWord)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSDLHelloWord != null)
      ((javax.xml.rpc.Stub)wSDLHelloWord)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pwc.webservice.WSDLHelloWord getWSDLHelloWord() {
    if (wSDLHelloWord == null)
      _initWSDLHelloWordProxy();
    return wSDLHelloWord;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (wSDLHelloWord == null)
      _initWSDLHelloWordProxy();
    return wSDLHelloWord.sayHi(arg0);
  }
  
  
}