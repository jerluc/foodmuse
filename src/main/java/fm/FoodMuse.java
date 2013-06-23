package fm;

import fm.webapp.FoodMuseService;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
public class FoodMuse {

    public static final String Version = "FoodMuse/v0.0.1";

    public static void main(final String[] args) throws Exception {
//        final CookbookManager cookbookManager = new GitHubCookbookManager();
//        final Recipe recipe = cookbookManager.record(new Recipe("", "Jeremy Lucas"));
//        System.out.println(recipe.id() + " by " + recipe.author());
        new FoodMuseService().run(args);
    }
}
