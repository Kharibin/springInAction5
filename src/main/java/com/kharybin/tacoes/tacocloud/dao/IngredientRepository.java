package com.kharybin.tacoes.tacocloud.dao;

import com.kharybin.tacoes.tacocloud.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
