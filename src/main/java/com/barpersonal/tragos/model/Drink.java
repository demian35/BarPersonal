package com.barpersonal.tragos.model;

import lombok.Data;

//clase drink que funcionara como dto para mapear el trago de la api
@Data
public class Drink {

    //agregando atributos del coctel
    private String idDrink;
    private String strDrink;
    private String strDrinkThumb; // URL de la imagen
    private String strInstructions;
    private String strCategory;

    // Aquí puedes agregar ingredientes si planeas ver el detalle del cocktail
    private String strIngredient1;
    private String strIngredient2;
    private String strMeasure1;
    private String strMeasure2;
    
}
