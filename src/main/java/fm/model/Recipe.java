package fm.model;

import com.google.common.collect.ImmutableList;
import fm.annotation.Serializable;

import java.util.List;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
@Serializable
public class Recipe implements Identifiable {

    protected final String id;

    protected final ID<Chef> chefRef;

    protected final List<Portion> portions;

    protected final List<Step> steps;

    public Recipe(final ID<Chef> chefRef, List<Portion> portions, final List<Step> steps) {
        this(String.valueOf(System.nanoTime()), chefRef, portions, steps);
    }

    public Recipe(final String id, final ID<Chef> chefRef, final List<Portion> portions, final List<Step> steps) {
        this.id = id;
        this.chefRef = chefRef;
        this.portions = portions;
        this.steps = steps;
    }

    @Override
    public String getId() {
        return id;
    }

    public ID<Chef> getChefRef() {
        return chefRef;
    }

    public List<Portion> getPortions() {
        return ImmutableList.copyOf(portions);
    }

    public List<Step> getSteps() {
        return ImmutableList.copyOf(steps);
    }
}
