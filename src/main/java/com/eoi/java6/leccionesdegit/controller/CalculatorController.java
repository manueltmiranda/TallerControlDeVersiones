package com.eoi.java6.leccionesdegit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculator"; // ✅ La vista carga, pero no procesa datos
    }
}
