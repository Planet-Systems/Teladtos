package com.planetsystems.tela.dto;

import java.time.LocalDate;

public class ClockOutDTO extends ParentDTO{
    private String comment;
    private ClockInDTO clockInDTO;

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

    @Override
    public String toString() {
        return "ClockOutDTO{" +
                "comment='" + comment + '\'' +
                ", clockInDTO=" + clockInDTO +
                '}';
    }
}
