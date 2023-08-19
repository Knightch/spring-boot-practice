package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.web;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    private BusinessService businessService;

    @Autowired
    public MyWebController(BusinessService businessService) {
        super();
        System.out.println("Constructor Injection");
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}
