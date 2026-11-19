package dev.backend.notificationservice.service.message;

import org.springframework.plugin.core.Plugin;
import dev.backend.notificationservice.dto.NotificationDto;

public interface ReportPlugin extends Plugin<String> {

    void handle(NotificationDto notificationDto);
}