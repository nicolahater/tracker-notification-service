package dev.backend.notificationservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import dev.backend.notificationservice.dto.EmailMessage;
import dev.backend.notificationservice.dto.NotificationDto;
import dev.backend.notificationservice.dto.UserRegisteredPayload;
import dev.backend.notificationservice.dto.enumurates.NotificationType;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    @Mapping(source = "email", target = "to")
    NotificationDto toNotification(UserRegisteredPayload payload);

    @Mapping(target = "subject", expression = "java(resolveSubject(notificationDto))")
    EmailMessage toEmailMessage(NotificationDto notificationDto);

    default String resolveSubject(NotificationDto notificationDto) {
        NotificationType emailType = NotificationType.fromString(notificationDto.templateType());
        return notificationDto.data().getOrDefault("subject", emailType.getDefaultSubject());
    }
}