package com.designpattern.designpattern.strategy.service;

import com.designpattern.designpattern.strategy.model.enums.ProcessingTypesEnum;

public interface ProcessingStrategyService {

    ProcessingTypesEnum handlerType();

    String process(String text);
}
