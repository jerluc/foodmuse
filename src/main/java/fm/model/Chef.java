/**
 * Copyright (C) 2004 - 2013 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package fm.model;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public class Chef implements Identifiable {

    protected final String id;

    protected final String name;

    protected final String email;

    public Chef(final String name, final String email) {
        this(String.valueOf(System.nanoTime()), name, email);
    }

    public Chef(final String id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getId() {
        return id;
    }
}
