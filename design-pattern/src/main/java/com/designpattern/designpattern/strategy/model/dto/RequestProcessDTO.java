package com.designpattern.designpattern.strategy.model.dto;

import com.designpattern.designpattern.strategy.model.enums.ProcessingTypesEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProcessDTO {

    private String text;
    private ProcessingTypesEnum typesEnum;
}
