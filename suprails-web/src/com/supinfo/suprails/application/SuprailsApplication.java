package com.supinfo.suprails.application;

import com.sun.jersey.api.core.PackagesResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@ApplicationPath("/resources")
public class SuprailsApplication extends PackagesResourceConfig {

    public SuprailsApplication() {
        super("com.supinfo.suprails.resources");
    }
}
