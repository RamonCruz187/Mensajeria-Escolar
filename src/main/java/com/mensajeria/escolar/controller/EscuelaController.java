package com.mensajeria.escolar.controller;

import com.mensajeria.escolar.dto.EscuelaRequestDto;
import com.mensajeria.escolar.service.EscuelaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EscuelaController {

    private final EscuelaService escuelaService;

    @PostMapping("/new/school")
    public void newSchool(@RequestBody EscuelaRequestDto schoolDto){
        escuelaService.newEscuela(schoolDto);
    }

}
