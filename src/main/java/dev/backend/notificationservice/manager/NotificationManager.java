package dev.backend.notificationservice.manager;

import dev.backend.notificationservice.dto.NotificationDto;

public interface NotificationManager {

    void handleEventByHandler(NotificationDto notificationDtoEvent);
}
