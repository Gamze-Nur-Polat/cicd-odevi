package com.example.cicd_odevi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String merhaba() {
        return "Merhaba Hocam, CI/CD Otomasyonu Başarıyla Çalışıyor! - Gamze Nur Polat";
    }
}