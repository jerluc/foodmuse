package fm.recipe;

import com.google.common.collect.Maps;
import fm.model.Chef;
import fm.model.ID;
import fm.model.Recipe;

import java.util.Map;

import static fm.model.ID.id;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public class InMemoryCookbookManager implements CookbookManager {

    protected final Map<ID<Recipe>, Recipe> cookBook;

    public InMemoryCookbookManager() {
        this(Maps.<ID<Recipe>, Recipe>newConcurrentMap());
    }

    public InMemoryCookbookManager(final Map<ID<Recipe>, Recipe> cookBook) {
        this.cookBook = cookBook;
    }

    @Override
    public Recipe lookup(final ID<Recipe> recipeRef) {
        if (cookBook.containsKey(recipeRef)) {
            return cookBook.get(recipeRef);
        }
        throw new IllegalArgumentException(String.format("Cannot find recipe ref. [%s]", recipeRef));
    }

    @Override
    public Recipe record(final Recipe recipe) {
        cookBook.put(id(recipe), recipe);
        return recipe;
    }

    @Override
    public Recipe edit(final Recipe recipe) {
        // TODO: Make sure the ID doesn't change here
        return record(recipe);
    }

    @Override
    public Recipe erase(final ID<Recipe> recipeRef) {
        return cookBook.remove(recipeRef);
    }

    @Override
    public Recipe fork(final ID<Chef> chefRef, final ID<Recipe> recipeRef) {
        final Recipe original = lookup(recipeRef);
        final Recipe forked = new Recipe(chefRef, original.getPortions(), original.getSteps());
        cookBook.put(id(forked), forked);
        return forked;
    }
}
