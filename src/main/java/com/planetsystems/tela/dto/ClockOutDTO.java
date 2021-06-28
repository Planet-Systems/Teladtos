package com.planetsystems.tela.dto;

public class ClockOutDTO extends ParentDTO{
    private String comment;
    private ClockInDTO clockInDTO;
    private String clockOutDate;
    private String clockOutTime;
    private String status;

    public ClockOutDTO() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ClockInDTO getClockInDTO() {
        return clockInDTO;
    }

    public void setClockInDTO(ClockInDTO clockInDTO) {
        this.clockInDTO = clockInDTO;
    }

    public String getClockOutDate() {
        return clockOutDate;
    }

    public void setClockOutDate(String clockOutDate) {
        this.clockOutDate = clockOutDate;
    }

    public String getClockOutTime() {
        return clockOutTime;
    }

    public void setClockOutTime(String clockOutTime) {
        this.clockOutTime = clockOutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
