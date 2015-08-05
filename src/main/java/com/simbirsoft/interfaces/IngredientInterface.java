package com.simbirsoft.interfaces;

/**
 * Created by User on 05.08.2015.
 */
public interface IngredientInterface {
    public String getIngredientsName();

    public Integer getIngredientCount();

    public void setIngredientCount(Integer count);

    @Override
    public String toString();
}
