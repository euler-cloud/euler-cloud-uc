package net.eulerframework.cloud.uc.endpoint;

import org.eulerframework.boot.autoconfigure.web.EulerApplicationProperties;
import org.eulerframework.web.config.WebConfig;
import org.eulerframework.web.core.base.controller.ApiSupportWebController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoEndpoint extends ApiSupportWebController {

    @Autowired
    private EulerApplicationProperties eulerApplicationProperties;

    @GetMapping("eulerApplicationProperties")
    public EulerApplicationProperties getEulerApplicationProperties() {
        return eulerApplicationProperties;
    }

    @GetMapping("webconfig/runtimePath")
    public String getWebConfigRuntimePath() {
        return WebConfig.getRuntimePath();
    }
}
