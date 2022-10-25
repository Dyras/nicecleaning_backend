package se.stadafint.nicecleaning_backend.dto;

public record CleanResponseDTO(
        int id,
        String date,
        String time,
        String optionalMessage,
        int status,
        int appUserId) {

}
