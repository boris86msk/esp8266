package ru.esp8266.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.esp8266.entity.IndicationsEntity;
import ru.esp8266.service.SensorService;

import java.util.List;

@Controller
public class esp8266Controller {
    private final SensorService service;

    public esp8266Controller(SensorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<String> takeIndications(@RequestParam String num) {
        System.out.print("Получено сообщение: ");
        System.out.println(num);
        service.saveMillis(Integer.parseInt(num));
        return ResponseEntity.ok("HTTP/1.1 200 OK");
    }

    @GetMapping("/list")
    public String ListIndications(Model model) {
        List<IndicationsEntity> indications = service.getIndications();
        model.addAttribute("indications", indications);
        return "index";
    }
}
