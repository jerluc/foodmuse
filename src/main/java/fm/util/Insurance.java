package fm.util;

import com.google.common.base.Preconditions;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public class Insurance {
    public static <T> T sanity(final boolean expression, final String message, final T arg) {
        Preconditions.checkArgument(expression, message);
        return arg;
    }
}
