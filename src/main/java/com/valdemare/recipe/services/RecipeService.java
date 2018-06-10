package com.valdemare.recipe.services;

import com.valdemare.recipe.commands.RecipeCommand;
import com.valdemare.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
    void deleteById(Long l);

}
