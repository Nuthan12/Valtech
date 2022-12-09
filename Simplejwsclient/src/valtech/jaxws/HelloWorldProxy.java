package valtech.jaxws;

public class HelloWorldProxy implements valtech.jaxws.HelloWorld {
  private String _endpoint = null;
  private valtech.jaxws.HelloWorld helloWorld = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld = (new valtech.jaxws.HelloWorldImplServiceLocator()).getHelloWorldImplPort();
      if (helloWorld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld != null)
      ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public valtech.jaxws.HelloWorld getHelloWorld() {
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld;
  }
  
  public java.lang.String hi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.hi(arg0);
  }
  
  public java.lang.String hello(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.hello(arg0);
  }
  
  
}