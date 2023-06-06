package com.designpattern.designpattern.strategy.controller;

import com.designpattern.designpattern.strategy.model.dto.RequestProcessDTO;
import com.designpattern.designpattern.strategy.service.ProcessGeneric;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
@RequiredArgsConstructor
public class ProcessController {

    private final ProcessGeneric processGeneric;
    @PostMapping
    public String process(@RequestBody RequestProcessDTO request) {
        return processGeneric.process(request);
    }
}
