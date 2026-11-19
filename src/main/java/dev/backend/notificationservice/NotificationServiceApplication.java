package dev.backend.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;
import dev.backend.notificationservice.service.message.ReportPlugin;

@SpringBootApplication
@EnablePluginRegistries(ReportPlugin.class)
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

}
