package com.example.cicd_odevi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {

    @GetMapping("/")
    public String merhaba() {
        String zaman = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        return "<html><body style='text-align:center; font-family:sans-serif; background-color:#f4f4f4;'>" +
                "<h1 style='color:#2c3e50;'>🚀---- CI/CD Otomasyonu Yayında!</h1>" +
                "<p style='font-size:1.2em;'>Merhaba Hocam, sistem başarıyla çalışıyor.</p>" +
                "<div style='background:white; display:inline-block; padding:20px; border-radius:10px; shadow: 2px 2px 5px #ccc;'>" +
                "<strong>Geliştirici:</strong> Gamze Nur Polat <br>" +
                "<strong>Son Güncelleme Zamanı:</strong> " + zaman +
                "</div>" +
                "</body></html>";
    }
}