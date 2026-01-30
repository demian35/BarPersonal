package com.barpersonal.tragos.service;

import java.util.Collections;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.barpersonal.tragos.model.CocktailResponse;
import com.barpersonal.tragos.model.Drink;

public class CocktailService {
    private final String API_URL = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?c=Cocktail";

    public List<Drink> getPopularCocktails() {
        RestTemplate restTemplate = new RestTemplate();
        CocktailResponse response = restTemplate.getForObject(API_URL, CocktailResponse.class);
        return response != null ? response.getCockteles() : Collections.emptyList();
    }
}
