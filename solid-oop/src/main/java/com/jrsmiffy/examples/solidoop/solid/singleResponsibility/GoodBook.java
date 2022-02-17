package com.jrsmiffy.examples.solidoop.solid.singleResponsibility;

import lombok.Data;

@Data
public class GoodBook { // credit to https://github.com/eugenp/tutorials/

    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

}
