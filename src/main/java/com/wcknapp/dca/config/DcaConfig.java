package com.wcknapp.dca.config;

import org.glassfish.jersey.server.ResourceConfig;

public class DcaConfig extends ResourceConfig {
    public DcaConfig() {
        packages("com.wcknapp.dca.api");
    }
}
