package com.iot.personalization;

import com.iot.personalization.resources.PersonalizedGreetingResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PersonalizationApplication extends Application<PersonalizationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PersonalizationApplication().run(args);
    }

    @Override
    public String getName() {
        return "Personalization";
    }

    @Override
    public void initialize(final Bootstrap<PersonalizationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PersonalizationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    	environment.jersey().register(new PersonalizedGreetingResource());
    }

}
