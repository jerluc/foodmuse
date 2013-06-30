package fm.webapp;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import fm.recipe.InMemoryCookbookManager;
import fm.webapp.conf.FoodMuseServiceConfiguration;
import fm.webapp.resource.CookbookResource;
import fm.webapp.resource.FoodMuseResource;

/**
 * @author: jl
 * @date: 6/22/13
 */
public class FoodMuseService extends Service<FoodMuseServiceConfiguration> {
    @Override
    public void initialize(final Bootstrap<FoodMuseServiceConfiguration> bootstrap) {

    }

    @Override
    public void run(final FoodMuseServiceConfiguration configuration, final Environment environment) throws Exception {
        environment.addResource(new FoodMuseResource());
        environment.addResource(new CookbookResource(new InMemoryCookbookManager()));
    }
}
