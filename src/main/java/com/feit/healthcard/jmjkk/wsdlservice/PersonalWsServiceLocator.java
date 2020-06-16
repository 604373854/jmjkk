/**
 * PersonalWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.feit.healthcard.jmjkk.wsdlservice;

public class PersonalWsServiceLocator extends org.apache.axis.client.Service implements PersonalWsService {

    public PersonalWsServiceLocator() {
    }


    public PersonalWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonalWsServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonalWsPort
    private String PersonalWsPort_address = "http://10.85.40.82:8082/soap/personalService";

    @Override
    public String getPersonalWsPortAddress() {
        return PersonalWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String PersonalWsPortWSDDServiceName = "PersonalWsPort";

    public String getPersonalWsPortWSDDServiceName() {
        return PersonalWsPortWSDDServiceName;
    }

    public void setPersonalWsPortWSDDServiceName(String name) {
        PersonalWsPortWSDDServiceName = name;
    }

    @Override
    public PersonalWs getPersonalWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonalWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonalWsPort(endpoint);
    }

    @Override
    public PersonalWs getPersonalWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PersonalWsServiceSoapBindingStub _stub = new PersonalWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonalWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonalWsPortEndpointAddress(String address) {
        PersonalWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PersonalWs.class.isAssignableFrom(serviceEndpointInterface)) {
                PersonalWsServiceSoapBindingStub _stub = new PersonalWsServiceSoapBindingStub(new java.net.URL(PersonalWsPort_address), this);
                _stub.setPortName(getPersonalWsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("PersonalWsPort".equals(inputPortName)) {
            return getPersonalWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.gateway.sdc.gsww.com/", "PersonalWsService");
    }

    private java.util.HashSet ports = null;

    @Override
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.gateway.sdc.gsww.com/", "PersonalWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonalWsPort".equals(portName)) {
            setPersonalWsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
