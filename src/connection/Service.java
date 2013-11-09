/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

public interface Service extends java.rmi.Remote {
    public java.lang.String signInMarket(java.lang.String fname, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String updatetime(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String signUpMarket(java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public int getIdFromFirstname(java.lang.String firstname) throws java.rmi.RemoteException;
    public java.lang.String createAdvertisement(java.lang.String username, java.lang.String itemname, java.lang.String description, int price, int quantity, java.lang.String sellerinfo) throws java.rmi.RemoteException;
    public connection.AdvertisementBean[] getAdvertisementDetail() throws java.rmi.RemoteException;
    public connection.AdvertisementBean[] getAdvertisementDetailLinkedList() throws java.rmi.RemoteException;
    public int getQuantityFromAdid(int adid) throws java.rmi.RemoteException;
    public connection.UserMarket getuserDetailMarket(java.lang.String username) throws java.rmi.RemoteException;
    public connection.AdvertisementBean getAdvertisementFromId(int id) throws java.rmi.RemoteException;
    public java.lang.String insertTransaction(int adid, int sellerid, int buyerid, int quantity, int total) throws java.rmi.RemoteException;
    public connection.TransactionBean[] getTransaction() throws java.rmi.RemoteException;
    public connection.TransactionBean[] getAllBuyerTransaction(int buyerid) throws java.rmi.RemoteException;
    public connection.TransactionBean[] getAllSellerTransaction(int sellerid) throws java.rmi.RemoteException;
    public java.lang.String updateQuantityAdvertisementTransaction(int quantitydeduct, int adid) throws java.rmi.RemoteException;
    public int deleteAdvertisement() throws java.rmi.RemoteException;
    public connection.User getuserDetail() throws java.rmi.RemoteException;
    public connection.User[] getuserDetailArray() throws java.rmi.RemoteException;
}
