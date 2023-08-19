package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.business;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {


    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService) {
        super();
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }

}
