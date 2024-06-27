package com.mensajeria.escolar.controller;

import com.mensajeria.escolar.dto.EscuelaRequestDto;
import com.mensajeria.escolar.dto.EscuelaResponseDto;
import com.mensajeria.escolar.service.EscuelaService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EscuelaController {

    private final EscuelaService escuelaService;


    @PostMapping("/new/school")
    public void newSchool(@RequestBody EscuelaRequestDto schoolDto){
        escuelaService.newEscuela(schoolDto);
    }

    @GetMapping("/school/{id}")
    public EscuelaResponseDto verEscuela(@PathVariable Long id){
        return new EscuelaResponseDto(escuelaService.verEscuela(id));
    }
}
