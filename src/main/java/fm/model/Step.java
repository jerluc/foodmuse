package fm.model;

import org.joda.time.Duration;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public class Step {
    protected final ID<Preparation> preparationRef;

    protected final Duration duration;

    public Step(final ID<Preparation> preparationRef, final Duration duration) {
        this.preparationRef = preparationRef;
        this.duration = duration;
    }

    public ID<Preparation> getPreparationRef() {
        return preparationRef;
    }

    public Duration getDuration() {
        return duration;
    }
}
