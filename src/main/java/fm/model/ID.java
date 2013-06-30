package fm.model;

import fm.annotation.Serializable;

import java.util.Objects;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
@Serializable
public class ID<T extends Identifiable> implements Identifiable {
    protected final String id;

    public static <T extends Identifiable> ID<T> id(final String id) {
        return new ID<>(id);
    }

    public static <T extends Identifiable> ID<T> id(final T identifiable) {
        return id(identifiable.getId());
    }

    public ID(final String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID<%s>", id);
    }

    @Override
    public boolean equals(final Object o) {
        return o instanceof ID && Objects.equals(((ID) o).id, id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
