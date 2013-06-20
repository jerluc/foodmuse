package fm.model;

import fm.annotation.Serializable;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
@Serializable
public class ID<T extends Identifiable> implements Identifiable {
    protected final String id;

    public ID(final T identifiable) {
        this.id = identifiable.id();
    }

    @Override
    public String id() {
        return id;
    }
}
