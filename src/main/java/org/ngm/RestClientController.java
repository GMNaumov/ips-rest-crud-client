package org.ngm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestClientController {
    private static final String URL = "http://ips-dev-server:8088/core/api/Auth/logins/sysdba/options";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/example")
    public String getExample() {
        return restTemplate
                .getForObject(URL, String.class);
    }
}
