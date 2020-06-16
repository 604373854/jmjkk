/**
 * PersonalWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.feit.healthcard.jmjkk.wsdlservice;

public interface PersonalWs extends java.rmi.Remote {
    public String deviceActive(String text) throws java.rmi.RemoteException;
    public String qrcodeApplication(String text) throws java.rmi.RemoteException;
    public String reportQrcodeUseBatch(String text) throws java.rmi.RemoteException, com.feit.healthcard.jmjkk.wsdlservice.Exception;
    public String patientRegiste(String text) throws java.rmi.RemoteException;
    public String qrcodeVerification(String text) throws java.rmi.RemoteException;
    public String personalRegisteRevise(String text) throws java.rmi.RemoteException;
    public String patientCancel(String text) throws java.rmi.RemoteException;
    public String patientSearch(String text) throws java.rmi.RemoteException;
    public String reportQrcodeUse(String text) throws java.rmi.RemoteException;
}
