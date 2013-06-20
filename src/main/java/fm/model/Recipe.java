package fm.model;

import fm.annotation.Serializable;

/**
 * @author Jeremy Lucas
 * @since 6/19/13
 */
@Serializable
public class Recipe implements Identifiable {
    protected final String id;

    protected final String author;

    public Recipe(
        final String id,
        final String author
    ) {
        this.id = id;
        this.author = author;
    }

    @Override
    public String id() {
        return id;
    }

    public String author() {
        return author;
    }
}
