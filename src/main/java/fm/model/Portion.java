package fm.model;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public class Portion {

    protected final ID<Ingredient> ingredientRef;

    protected final Amount amount;

    protected final Unit unit;

    public Portion(final ID<Ingredient> ingredientRef, final Amount amount, final Unit unit) {
        this.ingredientRef = ingredientRef;
        this.amount = amount;
        this.unit = unit;
    }

    public ID<Ingredient> getIngredientRef() {
        return ingredientRef;
    }

    public Amount getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }
}
