package com.feit.healthcard.jmjkk.controller;

import com.feit.healthcard.jmjkk.client.PersonalWsServiceConfig;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>jmjkkConsumerController TODO</p>
 *
 * @author zhengoy
 * @date 2020/6/12 14:59
 **/
@RestController
@RequestMapping("/api")
public class jmjkkConsumerController {
    final
    PersonalWsServiceConfig wsServiceConfig;

    public jmjkkConsumerController(PersonalWsServiceConfig wsServiceConfig) {
        this.wsServiceConfig = wsServiceConfig;
    }

    @lombok.SneakyThrows
    @PostMapping(value = "/patientRegiste", produces = "application/json;charset=UTF-8")
    public String patientRegiste(@RequestBody String patientJson) {
        //PersonalWsServiceSoapBindingStub bindingStub2 = (PersonalWsServiceSoapBindingStub) new PersonalWsServiceLocator().getPersonalWsPort();
        //return bindingStub2.patientRegiste(jsonToXml(patientJson));
        return jsonToXml(patientJson);
    }

    @lombok.SneakyThrows
    @GetMapping(value = "/qrcodeVerification", produces = "application/json;charset=UTF-8")
    public String qrcodeVerification() {
        String patientJson = "<root><request><YLJGDM>620000000376</YLJGDM><QRCODE>E9FA5F36BF04BCC9637145E79562707C1C9C84AEB75E6C0D4BC85EBE747623E7</QRCODE><TERMID>123456</TERMID><TERMCODE>01</TERMCODE><MEDDEPTCODE>5600</MEDDEPTCODE><MEDSTEPCODE>010101</MEDSTEPCODE><OUTTRADENO>1</OUTTRADENO></request></root>";

//        System.out.println("1");
//        PersonalWsService serviceLocator = new PersonalWsServiceLocator();
//        PersonalWsServiceSoapBindingStub bindingStub = (PersonalWsServiceSoapBindingStub) serviceLocator.getPersonalWsPort();
//        System.out.println("2");
//        System.out.println(patientJson);
//        return bindingStub.qrcodeVerification(jsonToXml(patientJson));
        String aa = wsServiceConfig.personalWsServiceInfo().qrcodeVerification(patientJson);
        System.out.println(aa);
        return aa;
    }


    public String jsonToXml(String json) {
        System.out.println("2.5");
        System.out.println(new XMLSerializer().write(JSONObject.fromObject(json)));
        return new XMLSerializer().write(JSONObject.fromObject(json));
    }
}
