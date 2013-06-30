package fm.recipe;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
public abstract class GitHubCookbookManager implements CookbookManager {

//    protected static final String GITHUB_AUTH_TOKEN = "3afbe01ded77a97e129b8a7bbe5096eb6d34dcb3";
//
//    protected static final GitHubClient CLIENT
//        = new GitHubClient()
//            .setUserAgent(FoodMuse.Version)
//            .setOAuth2Token(GITHUB_AUTH_TOKEN);
//
//    protected static final GistService GISTS = new GistService(CLIENT);
//
//
//    @Override
//    public Iterable<Recipe> search(final Object searchContext) {
//        return Lists.newArrayList();
//    }
//
//    @Override
//    public Recipe lookup(final ID<Recipe> recipeID) {
//        try {
//            final Gist gist = GISTS.getGist(recipeID.getId());
//            return new Recipe(gist.getId(), gist.getUser().getLogin());
//        } catch (final IOException e) {
//            throw propagate(e);
//        }
//    }
//
//    @Override
//    public Recipe record(final Recipe recipe) {
//        try {
//            final Gist gist = GISTS.createGist(new Gist()
//                .setPublic(true)
//                .setDescription("My recipe #1")
//                .setFiles(
//                    ImmutableMap.of(
//                        "recipe.xml", new GistFile().setContent("<?xml version=\"1.0\">"),
//                        "hello.scala", new GistFile().setContent("println(\"Hello World\");")
//                    )
//                )
//            );
//            return new Recipe(gist.getId(), gist.getUser().getLogin());
//        } catch (final IOException e) {
//            throw propagate(e);
//        }
//    }
//
//    @Override
//    public Recipe edit(final Recipe recipe) {
//        return null;
//    }
//
//    @Override
//    public Recipe erase(final Recipe recipe) {
//        try {
//            GISTS.deleteGist(recipe.getId());
//            return recipe;
//        } catch (final IOException e) {
//            throw propagate(e);
//        }
//    }
//
//    @Override
//    public Recipe fork(final Recipe recipe) {
//        try {
//            final Gist original = GISTS.getGist(recipe.getId());
//            final Gist gist = GISTS.createGist(original);
//            return new Recipe(gist.getId(), gist.getUser().getLogin());
//        } catch (final IOException e) {
//            throw propagate(e);
//        }
//    }
}
