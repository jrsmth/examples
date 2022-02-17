package com.jrsmiffy.examples.solidoop.solid.singleResponsibility;

import lombok.Data;

@Data
public class BookPrinter { // credit to https://github.com/eugenp/tutorials/

    //methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }

    void printTextToAnotherMedium(String text){
        //code for writing to any other location..
    }



}
