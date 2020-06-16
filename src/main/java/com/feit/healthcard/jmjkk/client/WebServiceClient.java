package com.feit.healthcard.jmjkk.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <p>CxfClient TODO</p>
 *
 * @author zhengoy
 * @date 2020/5/28 17:08
 **/
@Component
public class WebServiceClient implements ApplicationRunner {
    PersonalWsServiceConfig wsServiceConfig;

    public WebServiceClient(PersonalWsServiceConfig wsServiceConfig) {
        this.wsServiceConfig = wsServiceConfig;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String aaa = "<?XML version=\"1.0\" encoding=\"UTF-8\"?><root><request><JDRQ>2019-05-27</JDRQ><XBDM>2</XBDM><JDJGDM>620000000376</JDJGDM><ZJLXDM>01</ZJLXDM><ZJHM>620122195201271029</ZJHM><XTNBH>678</XTNBH><ZJLXMC>居民身份证</ZJLXMC><CSRQ>1952-01-27</CSRQ><CITYCODE>620100</CITYCODE><XM>胡正秀</XM><YLJGDM>620000000376</YLJGDM><JDYSGH>0</JDYSGH><SQFS>3</SQFS></request></root>";
        aaa = "<root><request><YLJGDM>620000000376</YLJGDM><QRCODE>E9FA5F36BF04BCC9637145E79562707C1C9C84AEB75E6C0D4BC85EBE747623E7</QRCODE><TERMID>123456</TERMID><TERMCODE>01</TERMCODE><MEDDEPTCODE>5600</MEDDEPTCODE><MEDSTEPCODE>010101</MEDSTEPCODE><OUTTRADENO>1</OUTTRADENO></request></root>";
//        PersonalWsService serviceLocator = new PersonalWsServiceLocator();
//        PersonalWsServiceSoapBindingStub bindingStub = (PersonalWsServiceSoapBindingStub) serviceLocator.getPersonalWsPort();
        String aa = wsServiceConfig.personalWsServiceInfo().qrcodeVerification(aaa);
        System.out.println(aa);
    }
}
