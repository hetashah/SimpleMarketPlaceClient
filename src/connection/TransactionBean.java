/**
 * TransactionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

public class TransactionBean  implements java.io.Serializable {
    private int adid;

    private int buyerid;

    private java.lang.String itemdescription;

    private java.lang.String itemname;

    private int quantity;

    private int sellerid;

    private java.lang.String time;

    private int total;

    private int transactionid;

    public TransactionBean() {
    }

    public TransactionBean(
           int adid,
           int buyerid,
           java.lang.String itemdescription,
           java.lang.String itemname,
           int quantity,
           int sellerid,
           java.lang.String time,
           int total,
           int transactionid) {
           this.adid = adid;
           this.buyerid = buyerid;
           this.itemdescription = itemdescription;
           this.itemname = itemname;
           this.quantity = quantity;
           this.sellerid = sellerid;
           this.time = time;
           this.total = total;
           this.transactionid = transactionid;
    }


    /**
     * Gets the adid value for this TransactionBean.
     * 
     * @return adid
     */
    public int getAdid() {
        return adid;
    }


    /**
     * Sets the adid value for this TransactionBean.
     * 
     * @param adid
     */
    public void setAdid(int adid) {
        this.adid = adid;
    }


    /**
     * Gets the buyerid value for this TransactionBean.
     * 
     * @return buyerid
     */
    public int getBuyerid() {
        return buyerid;
    }


    /**
     * Sets the buyerid value for this TransactionBean.
     * 
     * @param buyerid
     */
    public void setBuyerid(int buyerid) {
        this.buyerid = buyerid;
    }


    /**
     * Gets the itemdescription value for this TransactionBean.
     * 
     * @return itemdescription
     */
    public java.lang.String getItemdescription() {
        return itemdescription;
    }


    /**
     * Sets the itemdescription value for this TransactionBean.
     * 
     * @param itemdescription
     */
    public void setItemdescription(java.lang.String itemdescription) {
        this.itemdescription = itemdescription;
    }


    /**
     * Gets the itemname value for this TransactionBean.
     * 
     * @return itemname
     */
    public java.lang.String getItemname() {
        return itemname;
    }


    /**
     * Sets the itemname value for this TransactionBean.
     * 
     * @param itemname
     */
    public void setItemname(java.lang.String itemname) {
        this.itemname = itemname;
    }


    /**
     * Gets the quantity value for this TransactionBean.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransactionBean.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the sellerid value for this TransactionBean.
     * 
     * @return sellerid
     */
    public int getSellerid() {
        return sellerid;
    }


    /**
     * Sets the sellerid value for this TransactionBean.
     * 
     * @param sellerid
     */
    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }


    /**
     * Gets the time value for this TransactionBean.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this TransactionBean.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the total value for this TransactionBean.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this TransactionBean.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the transactionid value for this TransactionBean.
     * 
     * @return transactionid
     */
    public int getTransactionid() {
        return transactionid;
    }


    /**
     * Sets the transactionid value for this TransactionBean.
     * 
     * @param transactionid
     */
    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionBean)) return false;
        TransactionBean other = (TransactionBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.adid == other.getAdid() &&
            this.buyerid == other.getBuyerid() &&
            ((this.itemdescription==null && other.getItemdescription()==null) || 
             (this.itemdescription!=null &&
              this.itemdescription.equals(other.getItemdescription()))) &&
            ((this.itemname==null && other.getItemname()==null) || 
             (this.itemname!=null &&
              this.itemname.equals(other.getItemname()))) &&
            this.quantity == other.getQuantity() &&
            this.sellerid == other.getSellerid() &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            this.total == other.getTotal() &&
            this.transactionid == other.getTransactionid();
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
        _hashCode += getAdid();
        _hashCode += getBuyerid();
        if (getItemdescription() != null) {
            _hashCode += getItemdescription().hashCode();
        }
        if (getItemname() != null) {
            _hashCode += getItemname().hashCode();
        }
        _hashCode += getQuantity();
        _hashCode += getSellerid();
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        _hashCode += getTotal();
        _hashCode += getTransactionid();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://connection", "TransactionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "adid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "buyerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemdescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemdescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "itemname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "sellerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://connection", "transactionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
