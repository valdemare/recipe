package com.valdemare.recipe.controllers;


import com.valdemare.recipe.domain.Category;
import com.valdemare.recipe.domain.UnitOfMeasure;
import com.valdemare.recipe.repository.CategoryRepository;
import com.valdemare.recipe.repository.UnitOfMeasureRepository;
import com.valdemare.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

      return "index";
    }
}
