/**
 * Copyright (C) 2004 - 2013 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package fm.webapp.resource;

import com.google.common.collect.ImmutableList;
import fm.model.*;
import fm.recipe.CookbookManager;
import org.joda.time.Duration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static fm.model.Amount.mixed;
import static fm.model.ID.id;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
@Path("/cookbook")
public class CookbookResource {

    private static final ID<Chef> JERLUC = id(new Chef("Jerluc", "jeremy@foodmuse.co"));

    protected final CookbookManager cookbookManager;

    public CookbookResource(final CookbookManager cookbookManager) {
        this.cookbookManager = cookbookManager;
    }

    @Path("/recipes/create")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe createRecipe() {
        return cookbookManager.record(new Recipe(
            JERLUC,
            ImmutableList.of(
                new Portion(id(new Ingredient()), mixed(1, 1, 2), new Unit())
            ),
            ImmutableList.of(
                new Step(id(new Preparation()), Duration.standardHours(1).plus(Duration.standardMinutes(30)))
            )
        ));
    }

    @Path("/recipes/get/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe getRecipe(@PathParam("id") final String id) {
        return cookbookManager.lookup(ID.<Recipe>id(id));
    }

    @Path("/recipes/erase/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe eraseRecipe(@PathParam("id") final String id) {
        return cookbookManager.erase(ID.<Recipe>id(id));
    }

    @Path("/recipes/fork/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe forkRecipe(@PathParam("id") final String id) {
        return cookbookManager.fork(JERLUC, ID.<Recipe>id(id));
    }
}
