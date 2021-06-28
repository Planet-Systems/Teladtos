package com.planetsystems.tela.dto.response;

import java.io.Serializable;

public class SystemResponseDto implements Serializable {
    private SystemFeedbackDto data;

    public SystemResponseDto() {
    }

    public SystemResponseDto(SystemFeedbackDto data) {
        this.data = data;
    }

    public SystemFeedbackDto getData() {
        return data;
    }
}
