package com.restfully.shop.services;

/**
 * Created by as on 2015-07-29.
 */

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class ShoppingApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public ShoppingApplication() {
        singletons.add(new CustomerResource());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
