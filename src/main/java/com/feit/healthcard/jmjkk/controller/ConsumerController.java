package com.feit.healthcard.jmjkk.controller;

import com.feit.healthcard.jmjkk.client.PersonalWsServiceConfig;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.springframework.web.bind.annotation.*;

/**
 * <p>jmjkkConsumerController TODO</p>
 *
 * @author zhengoy
 * @date 2020/6/12 14:59
 **/
@RestController
@RequestMapping("/api")
public class ConsumerController {
    final
    PersonalWsServiceConfig wsServiceConfig;

    public ConsumerController(PersonalWsServiceConfig wsServiceConfig) {
        this.wsServiceConfig = wsServiceConfig;
    }

    /**
     * 例子
     *
     * @param patientJson 输入JSON字符串
     * @return 输出结过XML
     */
    @lombok.SneakyThrows
    @PostMapping(value = "/patientRegiste", produces = "application/json;charset=UTF-8")
    public String patientRegiste(@RequestBody String patientJson) {
        return jsonToXml(patientJson);
    }


    /**
     * 例子
     *
     * @return 输出结过XML
     */
    @lombok.SneakyThrows
    @GetMapping(value = "/qrcodeVerification", produces = "application/json;charset=UTF-8")
    public String qrcodeVerification() {
        String patientJson = "{\"root\": {\"request\": {\"YLJGDM\": \"620000000376\",\"QRCODE\": \"E9FA5F36BF04BCC9637145E79562707C1C9C84AEB75E6C0D4BC85EBE747623E7\",\"TERMID\": \"123456\",\"TERMCODE\": \"01\",\"MEDDEPTCODE\": \"5600\",\"MEDSTEPCODE\": \"010101\",\"OUTTRADENO\": \"1\"}}}";
        String patientXml = wsServiceConfig.personalWsServiceInfo().qrcodeVerification(jsonToXml(patientJson));
        System.out.println(patientXml);
        return patientXml;
    }


    /**
     * Json转Xml 格式方法
     *
     * @param json 入参String
     * @return Xlm格式出参 String
     */
    public String jsonToXml(String json) {
        System.out.println("2.5");
        XMLSerializer xmlSerializer = new XMLSerializer();
        xmlSerializer.setTypeHintsEnabled(false);
        String returnXml = xmlSerializer.write(JSONObject.fromObject(json));
        returnXml = returnXml.replace("</o>", "").replace("<o>", "");
        return returnXml;
    }
}
