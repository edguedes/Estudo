package com.designpattern.designpattern.strategy.service;

import com.designpattern.designpattern.strategy.model.dto.RequestProcessDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
@RequiredArgsConstructor
public class ProcessGeneric {

    private final List<ProcessingStrategyService> processingStrategyServiceList;

    public String process(RequestProcessDTO request){
        String result = null;

        for (var strategyProcess : processingStrategyServiceList) {
            if (strategyProcess.handlerType().equals(request.getTypesEnum())) {
                result = strategyProcess.process(request.getText());
            }
        }
        return result;
    }

}
