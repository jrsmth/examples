package com.jrsmiffy.examples.solidoop.solid.singleResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BadBook { // credit to https://github.com/eugenp/tutorials/

    private String name;
    private String author;
    private String text;

    /** This function directly relates to the Book */
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    /** This function directly relates to the Book */
    public boolean isWordInText(String word){
        return text.contains(word);
    }

    /** This function does NOT directly relate to the Book
     * we should spit it out into a separate class that handles formatting, such as BookPrinter */
    public void printTextToConsole(){
        // our code for formatting and printing the text
    }


}
