package com.planetsystems.tela.dto;

public class ClockOutDTO extends ParentDTO{
    private String comment;
    private ClockInDTO clockInDTO;
    private String clockOutDate;
    private String clockOutTime;
    private String status;

    public ClockOutDTO() {
    }

    public ClockInDTO getClockInDTO() {
        return clockInDTO;
    }

    public void setClockInDTO(ClockInDTO clockInDTO) {
        this.clockInDTO = clockInDTO;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClockOutDTO{" +
                "comment='" + comment + '\'' +
                ", clockInDTO=" + clockInDTO +
                ", clockOutDate='" + clockOutDate + '\'' +
                ", clockOutTime='" + clockOutTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
