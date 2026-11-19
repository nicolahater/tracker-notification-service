package dev.backend.notificationservice.service.template;

import jakarta.mail.internet.MimeMessage;
import dev.backend.notificationservice.dto.NotificationDto;

public interface TemplateService {

    MimeMessage create(NotificationDto notificationDto);
}

