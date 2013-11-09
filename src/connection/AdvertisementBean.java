/**
 * AdvertisementBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

public class AdvertisementBean  implements java.io.Serializable {
    private int userid;

    private int advertiseid;

    private java.lang.String itemname;

    private java.lang.String itemdesc;

    private int itemprice;

    private int itemquantity;

    private java.lang.String sellerinfo;

    public AdvertisementBean() {
    }

    public AdvertisementBean(
           int userid,
           int advertiseid,
           java.lang.String itemname,
           java.lang.String itemdesc,
           int itemprice,
           int itemquantity,
           java.lang.String sellerinfo) {
           this.userid = userid;
           this.advertiseid = advertiseid;
           this.itemname = itemname;
           this.itemdesc = itemdesc;
           this.itemprice = itemprice;
           this.itemquantity = itemquantity;
           this.sellerinfo = sellerinfo;
    }


    /**
     * Gets the userid value for this AdvertisementBean.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this AdvertisementBean.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the advertiseid value for this AdvertisementBean.
     * 
     * @return advertiseid
     */
    public int getAdvertiseid() {
        return advertiseid;
    }


    /**
     * Sets the advertiseid value for this AdvertisementBean.
     * 
     * @param advertiseid
     */
    public void setAdvertiseid(int advertiseid) {
        this.advertiseid = advertiseid;
    }


    /**
     * Gets the itemname value for this AdvertisementBean.
     * 
     * @return itemname
     */
    public java.lang.String getItemname() {
        return itemname;
    }


    /**
     * Sets the itemname value for this AdvertisementBean.
     * 
     * @param itemname
     */
    public void setItemname(java.lang.String itemname) {
        this.itemname = itemname;
    }


    /**
     * Gets the itemdesc value for this AdvertisementBean.
     * 
     * @return itemdesc
     */
    public java.lang.String getItemdesc() {
        return itemdesc;
    }


    /**
     * Sets the itemdesc value for this AdvertisementBean.
     * 
     * @param itemdesc
     */
    public void setItemdesc(java.lang.String itemdesc) {
        this.itemdesc = itemdesc;
    }


    /**
     * Gets the itemprice value for this AdvertisementBean.
     * 
     * @return itemprice
     */
    public int getItemprice() {
        return itemprice;
    }


    /**
     * Sets the itemprice value for this AdvertisementBean.
     * 
     * @param itemprice
     */
    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }


    /**
     * Gets the itemquantity value for this AdvertisementBean.
     * 
     * @return itemquantity
     */
    public int getItemquantity() {
        return itemquantity;
    }


    /**
     * Sets the itemquantity value for this AdvertisementBean.
     * 
     * @param itemquantity
     */
    public void setItemquantity(int itemquantity) {
        this.itemquantity = itemquantity;
    }


    /**
     * Gets the sellerinfo value for this AdvertisementBean.
     * 
     * @return sellerinfo
     */
    public java.lang.String getSellerinfo() {
        return sellerinfo;
    }


    /**
     * Sets the sellerinfo value for this AdvertisementBean.
     * 
     * @param sellerinfo
     */
    public void setSellerinfo(java.lang.String sellerinfo) {
        this.sellerinfo = sellerinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvertisementBean)) return false;
        AdvertisementBean other = (AdvertisementBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userid == other.getUserid() &&
            this.advertiseid == other.getAdvertiseid() &&
            ((this.itemname==null && other.getItemname()==null) || 
             (this.itemname!=null &&
              this.itemname.equals(other.getItemname()))) &&
            ((this.itemdesc==null && other.getItemdesc()==null) || 
             (this.itemdesc!=null &&
              this.itemdesc.equals(other.getItemdesc()))) &&
            this.itemprice == other.getItemprice() &&
            this.itemquantity == other.getItemquantity() &&
            ((this.sellerinfo==null && other.getSellerinfo()==null) || 
             (this.sellerinfo!=null &&
              this.sellerinfo.equals(other.getSellerinfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getUserid();
        _hashCode += getAdvertiseid();
        if (getItemname() != null) {
            _hashCode += getItemname().hashCode();
        }
        if (getItemdesc() != null) {
            _hashCode += getItemdesc().hashCode();
        }
        _hashCode += getItemprice();
        _hashCode += getItemquantity();
        if (getSellerinfo() != null) {
            _hashCode += getSellerinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvertisementBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://connection", "AdvertisementBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiseid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "advertiseid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemquantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemquantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "sellerinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
