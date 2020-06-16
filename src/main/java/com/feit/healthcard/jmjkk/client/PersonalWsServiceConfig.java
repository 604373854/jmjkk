package com.feit.healthcard.jmjkk.client;

import com.feit.healthcard.jmjkk.wsdlservice.PersonalWsService;
import com.feit.healthcard.jmjkk.wsdlservice.PersonalWsServiceLocator;
import com.feit.healthcard.jmjkk.wsdlservice.PersonalWsServiceSoapBindingStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;

/**
 * <p>PersonalWsServiceConfig TODO</p>
 *
 * @author zhengoy
 * @date 2020/6/15 16:20
 **/
@Component
public class PersonalWsServiceConfig {
    @Autowired
    public PersonalWsServiceSoapBindingStub personalWsServiceInfo() throws ServiceException {
        PersonalWsService serviceLocator = new PersonalWsServiceLocator();
        return (PersonalWsServiceSoapBindingStub) serviceLocator.getPersonalWsPort();
    }
}
