package com.jrsmiffy.examples.solidoop.solid.openClose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar { // credit to https://github.com/eugenp/tutorials/

    private String make;
    private String model;
    private int volume;
}
