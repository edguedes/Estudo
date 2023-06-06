package com.designpattern.designpattern.strategy.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum ProcessingTypesEnum {
    
    TYPE_A("Tipo A de processamento"),
    TYPE_B("Tipo B de processamento");


    private String description;
    ProcessingTypesEnum(String description) {
        this.description = description;
    }
}
