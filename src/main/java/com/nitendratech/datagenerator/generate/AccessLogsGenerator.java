package com.nitendratech.datagenerator.generate;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by @author nitendratech on 9/30/20
 */
public class AccessLogsGenerator {


    List<String> clientAddressList= Arrays.asList("192.163.19.12","192.163.19.12","192.163.19.12","192.163.19.12");

    List<String> clientIdentityList=Arrays.asList("","-","");
    List<String> remoteUserList=Arrays.asList("","-","");

    public void getDateTime(){

        SimpleDateFormat localDateFormat =
                new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z");

    }

    List<String> httpRequestList = Arrays.asList("GET","POST","PUT");
    List<String> httpStatusCodesList= Arrays.asList("200","201","500","401");
    List<String> bytesSentList = Arrays.asList("21","44","55","66");  //some value or '-
    List<String> siteRefererList =Arrays.asList("GET","POST","PUT");;  //Vistors Source
    List<String> userAgentList =Arrays.asList("","",""); //Type of Browser Used



    public String getClientAddress() {
        return "clientAddress";
    }


    public String getClientIdentity() {
        return "clientIdentity";
    }



    public String getRemoteUser() {
        return "remoteUser";
    }






    public String getHttpRequest() {
        return "httpRequest";
    }



    public String getHttpStatusCode() {
        return "httpStatusCode";
    }



    public String getBytesSent() {
        return "bytesSent";
    }



    public String getSiteReferer() {
        return "siteReferer";
    }


    public String getUserAgent() {
        return "userAgent";
    }







}
