package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getData() {
        return Arrays.asList(20, 40, 60, 70, 80, 100, 120);
    }
}
