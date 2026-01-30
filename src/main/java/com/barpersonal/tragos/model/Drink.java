package com.barpersonal.tragos.model;

import lombok.Data;

//clase drink que funcionara como dto para mapear el trago de la api
@Data
public class Drink {
    private String idDrink;
    private String strDrink;
    private String strDrinkThumb; // URL de la imagen
    private String strInstructions;
    private String strCategory;
    
}
