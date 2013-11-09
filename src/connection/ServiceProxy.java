package connection;

public class ServiceProxy implements connection.Service {
  private String _endpoint = null;
  private connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public java.lang.String signInMarket(java.lang.String fname, java.lang.String password) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signInMarket(fname, password);
  }
  
  public java.lang.String updatetime(java.lang.String username) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.updatetime(username);
  }
  
  public java.lang.String signUpMarket(java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signUpMarket(fname, lname, email, password);
  }
  
  public int getIdFromFirstname(java.lang.String firstname) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getIdFromFirstname(firstname);
  }
  
  public java.lang.String createAdvertisement(java.lang.String username, java.lang.String itemname, java.lang.String description, int price, int quantity, java.lang.String sellerinfo) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.createAdvertisement(username, itemname, description, price, quantity, sellerinfo);
  }
  
  public connection.AdvertisementBean[] getAdvertisementDetail() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAdvertisementDetail();
  }
  
  public connection.AdvertisementBean[] getAdvertisementDetailLinkedList() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAdvertisementDetailLinkedList();
  }
  
  public int getQuantityFromAdid(int adid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getQuantityFromAdid(adid);
  }
  
  public connection.UserMarket getuserDetailMarket(java.lang.String username) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getuserDetailMarket(username);
  }
  
  public connection.AdvertisementBean getAdvertisementFromId(int id) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAdvertisementFromId(id);
  }
  
  public java.lang.String insertTransaction(int adid, int sellerid, int buyerid, int quantity, int total) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.insertTransaction(adid, sellerid, buyerid, quantity, total);
  }
  
  public connection.TransactionBean[] getTransaction() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getTransaction();
  }
  
  public connection.TransactionBean[] getAllBuyerTransaction(int buyerid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAllBuyerTransaction(buyerid);
  }
  
  public connection.TransactionBean[] getAllSellerTransaction(int sellerid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAllSellerTransaction(sellerid);
  }
  
  public java.lang.String updateQuantityAdvertisementTransaction(int quantitydeduct, int adid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.updateQuantityAdvertisementTransaction(quantitydeduct, adid);
  }
  
  public int deleteAdvertisement() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteAdvertisement();
  }
  
  public connection.User getuserDetail() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getuserDetail();
  }
  
  public connection.User[] getuserDetailArray() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getuserDetailArray();
  }
  
  
}