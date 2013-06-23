package fm;

import fm.webapp.FoodMuseService;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
public class FoodMuse {

    public static final String Version = "FoodMuse/v0.0.1";

    public static void main(final String[] args) throws Exception {
        new FoodMuseService().run(args);
    }
}
