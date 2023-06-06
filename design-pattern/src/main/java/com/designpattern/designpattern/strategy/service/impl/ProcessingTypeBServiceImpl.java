package com.designpattern.designpattern.strategy.service.impl;

import com.designpattern.designpattern.strategy.model.enums.ProcessingTypesEnum;
import com.designpattern.designpattern.strategy.service.ProcessingStrategyService;
import org.springframework.stereotype.Service;

@Service
public class ProcessingTypeBServiceImpl implements ProcessingStrategyService {

    @Override
    public ProcessingTypesEnum handlerType() {
        return ProcessingTypesEnum.TYPE_B;
    }

    @Override
    public String process(String text) {
        System.out.println(ProcessingTypesEnum.TYPE_B.getDescription());
        System.out.println(text);

        return ProcessingTypesEnum.TYPE_B.getDescription();
    }
}
