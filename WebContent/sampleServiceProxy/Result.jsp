<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 27:
        gotMethod = true;
        String fname_1id=  request.getParameter("fname30");
            java.lang.String fname_1idTemp = null;
        if(!fname_1id.equals("")){
         fname_1idTemp  = fname_1id;
        }
        String password_2id=  request.getParameter("password32");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        java.lang.String signInMarket27mtemp = sampleServiceProxyid.signInMarket(fname_1idTemp,password_2idTemp);
if(signInMarket27mtemp == null){
%>
<%=signInMarket27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signInMarket27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
case 34:
        gotMethod = true;
        String username_3id=  request.getParameter("username37");
            java.lang.String username_3idTemp = null;
        if(!username_3id.equals("")){
         username_3idTemp  = username_3id;
        }
        java.lang.String updatetime34mtemp = sampleServiceProxyid.updatetime(username_3idTemp);
if(updatetime34mtemp == null){
%>
<%=updatetime34mtemp %>
<%
}else{
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updatetime34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
}
break;
case 39:
        gotMethod = true;
        String fname_4id=  request.getParameter("fname42");
            java.lang.String fname_4idTemp = null;
        if(!fname_4id.equals("")){
         fname_4idTemp  = fname_4id;
        }
        String lname_5id=  request.getParameter("lname44");
            java.lang.String lname_5idTemp = null;
        if(!lname_5id.equals("")){
         lname_5idTemp  = lname_5id;
        }
        String email_6id=  request.getParameter("email46");
            java.lang.String email_6idTemp = null;
        if(!email_6id.equals("")){
         email_6idTemp  = email_6id;
        }
        String password_7id=  request.getParameter("password48");
            java.lang.String password_7idTemp = null;
        if(!password_7id.equals("")){
         password_7idTemp  = password_7id;
        }
        java.lang.String signUpMarket39mtemp = sampleServiceProxyid.signUpMarket(fname_4idTemp,lname_5idTemp,email_6idTemp,password_7idTemp);
if(signUpMarket39mtemp == null){
%>
<%=signUpMarket39mtemp %>
<%
}else{
        String tempResultreturnp40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUpMarket39mtemp));
        %>
        <%= tempResultreturnp40 %>
        <%
}
break;
case 50:
        gotMethod = true;
        String firstname_8id=  request.getParameter("firstname53");
            java.lang.String firstname_8idTemp = null;
        if(!firstname_8id.equals("")){
         firstname_8idTemp  = firstname_8id;
        }
        int getIdFromFirstname50mtemp = sampleServiceProxyid.getIdFromFirstname(firstname_8idTemp);
        String tempResultreturnp51 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getIdFromFirstname50mtemp));
        %>
        <%= tempResultreturnp51 %>
        <%
break;
case 55:
        gotMethod = true;
        String username_9id=  request.getParameter("username58");
            java.lang.String username_9idTemp = null;
        if(!username_9id.equals("")){
         username_9idTemp  = username_9id;
        }
        String itemname_10id=  request.getParameter("itemname60");
            java.lang.String itemname_10idTemp = null;
        if(!itemname_10id.equals("")){
         itemname_10idTemp  = itemname_10id;
        }
        String description_11id=  request.getParameter("description62");
            java.lang.String description_11idTemp = null;
        if(!description_11id.equals("")){
         description_11idTemp  = description_11id;
        }
        String price_12id=  request.getParameter("price64");
        int price_12idTemp  = Integer.parseInt(price_12id);
        String quantity_13id=  request.getParameter("quantity66");
        int quantity_13idTemp  = Integer.parseInt(quantity_13id);
        String sellerinfo_14id=  request.getParameter("sellerinfo68");
            java.lang.String sellerinfo_14idTemp = null;
        if(!sellerinfo_14id.equals("")){
         sellerinfo_14idTemp  = sellerinfo_14id;
        }
        java.lang.String createAdvertisement55mtemp = sampleServiceProxyid.createAdvertisement(username_9idTemp,itemname_10idTemp,description_11idTemp,price_12idTemp,quantity_13idTemp,sellerinfo_14idTemp);
if(createAdvertisement55mtemp == null){
%>
<%=createAdvertisement55mtemp %>
<%
}else{
        String tempResultreturnp56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createAdvertisement55mtemp));
        %>
        <%= tempResultreturnp56 %>
        <%
}
break;
case 70:
        gotMethod = true;
        connection.AdvertisementBean[] getAdvertisementDetail70mtemp = sampleServiceProxyid.getAdvertisementDetail();
if(getAdvertisementDetail70mtemp == null){
%>
<%=getAdvertisementDetail70mtemp %>
<%
}else{
        String tempreturnp71 = null;
        if(getAdvertisementDetail70mtemp != null){
        java.util.List listreturnp71= java.util.Arrays.asList(getAdvertisementDetail70mtemp);
        tempreturnp71 = listreturnp71.toString();
        }
        %>
        <%=tempreturnp71%>
        <%
}
break;
case 73:
        gotMethod = true;
        connection.AdvertisementBean[] getAdvertisementDetailLinkedList73mtemp = sampleServiceProxyid.getAdvertisementDetailLinkedList();
if(getAdvertisementDetailLinkedList73mtemp == null){
%>
<%=getAdvertisementDetailLinkedList73mtemp %>
<%
}else{
        String tempreturnp74 = null;
        if(getAdvertisementDetailLinkedList73mtemp != null){
        java.util.List listreturnp74= java.util.Arrays.asList(getAdvertisementDetailLinkedList73mtemp);
        tempreturnp74 = listreturnp74.toString();
        }
        %>
        <%=tempreturnp74%>
        <%
}
break;
case 76:
        gotMethod = true;
        String adid_15id=  request.getParameter("adid79");
        int adid_15idTemp  = Integer.parseInt(adid_15id);
        int getQuantityFromAdid76mtemp = sampleServiceProxyid.getQuantityFromAdid(adid_15idTemp);
        String tempResultreturnp77 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getQuantityFromAdid76mtemp));
        %>
        <%= tempResultreturnp77 %>
        <%
break;
case 81:
        gotMethod = true;
        String username_16id=  request.getParameter("username94");
            java.lang.String username_16idTemp = null;
        if(!username_16id.equals("")){
         username_16idTemp  = username_16id;
        }
        connection.UserMarket getuserDetailMarket81mtemp = sampleServiceProxyid.getuserDetailMarket(username_16idTemp);
if(getuserDetailMarket81mtemp == null){
%>
<%=getuserDetailMarket81mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getuserDetailMarket81mtemp != null){
java.lang.String typeemail84 = getuserDetailMarket81mtemp.getEmail();
        String tempResultemail84 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail84));
        %>
        <%= tempResultemail84 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastname:</TD>
<TD>
<%
if(getuserDetailMarket81mtemp != null){
java.lang.String typelastname86 = getuserDetailMarket81mtemp.getLastname();
        String tempResultlastname86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastname86));
        %>
        <%= tempResultlastname86 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastlogtime:</TD>
<TD>
<%
if(getuserDetailMarket81mtemp != null){
java.lang.String typelastlogtime88 = getuserDetailMarket81mtemp.getLastlogtime();
        String tempResultlastlogtime88 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastlogtime88));
        %>
        <%= tempResultlastlogtime88 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pwd:</TD>
<TD>
<%
if(getuserDetailMarket81mtemp != null){
java.lang.String typepwd90 = getuserDetailMarket81mtemp.getPwd();
        String tempResultpwd90 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepwd90));
        %>
        <%= tempResultpwd90 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">firstname:</TD>
<TD>
<%
if(getuserDetailMarket81mtemp != null){
java.lang.String typefirstname92 = getuserDetailMarket81mtemp.getFirstname();
        String tempResultfirstname92 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstname92));
        %>
        <%= tempResultfirstname92 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 96:
        gotMethod = true;
        String id_17id=  request.getParameter("id113");
        int id_17idTemp  = Integer.parseInt(id_17id);
        connection.AdvertisementBean getAdvertisementFromId96mtemp = sampleServiceProxyid.getAdvertisementFromId(id_17idTemp);
if(getAdvertisementFromId96mtemp == null){
%>
<%=getAdvertisementFromId96mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">advertiseid:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
%>
<%=getAdvertisementFromId96mtemp.getAdvertiseid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userid:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
%>
<%=getAdvertisementFromId96mtemp.getUserid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sellerinfo:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
java.lang.String typesellerinfo103 = getAdvertisementFromId96mtemp.getSellerinfo();
        String tempResultsellerinfo103 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerinfo103));
        %>
        <%= tempResultsellerinfo103 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemprice:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
%>
<%=getAdvertisementFromId96mtemp.getItemprice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemdesc:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
java.lang.String typeitemdesc107 = getAdvertisementFromId96mtemp.getItemdesc();
        String tempResultitemdesc107 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitemdesc107));
        %>
        <%= tempResultitemdesc107 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemquantity:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
%>
<%=getAdvertisementFromId96mtemp.getItemquantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemname:</TD>
<TD>
<%
if(getAdvertisementFromId96mtemp != null){
java.lang.String typeitemname111 = getAdvertisementFromId96mtemp.getItemname();
        String tempResultitemname111 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitemname111));
        %>
        <%= tempResultitemname111 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 115:
        gotMethod = true;
        String adid_18id=  request.getParameter("adid118");
        int adid_18idTemp  = Integer.parseInt(adid_18id);
        String sellerid_19id=  request.getParameter("sellerid120");
        int sellerid_19idTemp  = Integer.parseInt(sellerid_19id);
        String buyerid_20id=  request.getParameter("buyerid122");
        int buyerid_20idTemp  = Integer.parseInt(buyerid_20id);
        String quantity_21id=  request.getParameter("quantity124");
        int quantity_21idTemp  = Integer.parseInt(quantity_21id);
        String total_22id=  request.getParameter("total126");
        int total_22idTemp  = Integer.parseInt(total_22id);
        java.lang.String insertTransaction115mtemp = sampleServiceProxyid.insertTransaction(adid_18idTemp,sellerid_19idTemp,buyerid_20idTemp,quantity_21idTemp,total_22idTemp);
if(insertTransaction115mtemp == null){
%>
<%=insertTransaction115mtemp %>
<%
}else{
        String tempResultreturnp116 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertTransaction115mtemp));
        %>
        <%= tempResultreturnp116 %>
        <%
}
break;
case 128:
        gotMethod = true;
        connection.TransactionBean[] getTransaction128mtemp = sampleServiceProxyid.getTransaction();
if(getTransaction128mtemp == null){
%>
<%=getTransaction128mtemp %>
<%
}else{
        String tempreturnp129 = null;
        if(getTransaction128mtemp != null){
        java.util.List listreturnp129= java.util.Arrays.asList(getTransaction128mtemp);
        tempreturnp129 = listreturnp129.toString();
        }
        %>
        <%=tempreturnp129%>
        <%
}
break;
case 131:
        gotMethod = true;
        String buyerid_23id=  request.getParameter("buyerid134");
        int buyerid_23idTemp  = Integer.parseInt(buyerid_23id);
        connection.TransactionBean[] getAllBuyerTransaction131mtemp = sampleServiceProxyid.getAllBuyerTransaction(buyerid_23idTemp);
if(getAllBuyerTransaction131mtemp == null){
%>
<%=getAllBuyerTransaction131mtemp %>
<%
}else{
        String tempreturnp132 = null;
        if(getAllBuyerTransaction131mtemp != null){
        java.util.List listreturnp132= java.util.Arrays.asList(getAllBuyerTransaction131mtemp);
        tempreturnp132 = listreturnp132.toString();
        }
        %>
        <%=tempreturnp132%>
        <%
}
break;
case 136:
        gotMethod = true;
        String sellerid_24id=  request.getParameter("sellerid139");
        int sellerid_24idTemp  = Integer.parseInt(sellerid_24id);
        connection.TransactionBean[] getAllSellerTransaction136mtemp = sampleServiceProxyid.getAllSellerTransaction(sellerid_24idTemp);
if(getAllSellerTransaction136mtemp == null){
%>
<%=getAllSellerTransaction136mtemp %>
<%
}else{
        String tempreturnp137 = null;
        if(getAllSellerTransaction136mtemp != null){
        java.util.List listreturnp137= java.util.Arrays.asList(getAllSellerTransaction136mtemp);
        tempreturnp137 = listreturnp137.toString();
        }
        %>
        <%=tempreturnp137%>
        <%
}
break;
case 141:
        gotMethod = true;
        String quantitydeduct_25id=  request.getParameter("quantitydeduct144");
        int quantitydeduct_25idTemp  = Integer.parseInt(quantitydeduct_25id);
        String adid_26id=  request.getParameter("adid146");
        int adid_26idTemp  = Integer.parseInt(adid_26id);
        java.lang.String updateQuantityAdvertisementTransaction141mtemp = sampleServiceProxyid.updateQuantityAdvertisementTransaction(quantitydeduct_25idTemp,adid_26idTemp);
if(updateQuantityAdvertisementTransaction141mtemp == null){
%>
<%=updateQuantityAdvertisementTransaction141mtemp %>
<%
}else{
        String tempResultreturnp142 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateQuantityAdvertisementTransaction141mtemp));
        %>
        <%= tempResultreturnp142 %>
        <%
}
break;
case 148:
        gotMethod = true;
        int deleteAdvertisement148mtemp = sampleServiceProxyid.deleteAdvertisement();
        String tempResultreturnp149 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteAdvertisement148mtemp));
        %>
        <%= tempResultreturnp149 %>
        <%
break;
case 151:
        gotMethod = true;
        connection.User getuserDetail151mtemp = sampleServiceProxyid.getuserDetail();
if(getuserDetail151mtemp == null){
%>
<%=getuserDetail151mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(getuserDetail151mtemp != null){
java.lang.String typepassword154 = getuserDetail151mtemp.getPassword();
        String tempResultpassword154 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword154));
        %>
        <%= tempResultpassword154 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">username:</TD>
<TD>
<%
if(getuserDetail151mtemp != null){
java.lang.String typeusername156 = getuserDetail151mtemp.getUsername();
        String tempResultusername156 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeusername156));
        %>
        <%= tempResultusername156 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 158:
        gotMethod = true;
        connection.User[] getuserDetailArray158mtemp = sampleServiceProxyid.getuserDetailArray();
if(getuserDetailArray158mtemp == null){
%>
<%=getuserDetailArray158mtemp %>
<%
}else{
        String tempreturnp159 = null;
        if(getuserDetailArray158mtemp != null){
        java.util.List listreturnp159= java.util.Arrays.asList(getuserDetailArray158mtemp);
        tempreturnp159 = listreturnp159.toString();
        }
        %>
        <%=tempreturnp159%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>