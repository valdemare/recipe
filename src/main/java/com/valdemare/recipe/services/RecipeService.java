package com.valdemare.recipe.services;

import com.valdemare.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
