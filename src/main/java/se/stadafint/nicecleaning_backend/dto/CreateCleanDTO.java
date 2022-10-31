package se.stadafint.nicecleaning_backend.dto;


public record CreateCleanDTO(
        String date,
        String time,
        String optionalMessage,
        int id) {

    public int appUserId() {
        return id;
    }
}
