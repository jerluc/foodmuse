package fm.recipe;

import fm.model.Chef;
import fm.model.ID;
import fm.model.Recipe;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
public interface CookbookManager {
    // TODO: See if we should use this
//    Iterable<Recipe> search(final Object searchContext);

    Recipe lookup(final ID<Recipe> recipeRef);

    Recipe record(final Recipe recipe);

    Recipe edit(final Recipe recipe);

    Recipe erase(final ID<Recipe> recipeRef);

    Recipe fork(final ID<Chef> chefRef, final ID<Recipe> recipeRef);
}
