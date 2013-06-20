package fm.recipe;

import fm.model.ID;
import fm.model.Recipe;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
public interface CookbookManager {
    Iterable<Recipe> search(final Object searchContext);

    Recipe lookup(final ID<Recipe> recipeID);

    Recipe record(final Recipe recipe);

    Recipe edit(final Recipe recipe);

    Recipe erase(final Recipe recipe);

    Recipe fork(final Recipe recipe);
}
