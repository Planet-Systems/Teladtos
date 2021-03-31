package com.planetsystems.tela.dto.AppDTO;

public enum TaskDay {

	MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");

	private String taskDay;

	TaskDay(String taskDay) {
		this.taskDay = taskDay;
	}

	public String getTaskDay() {
		return taskDay;
	}

	public void setTaskDay(String taskDay) {
		this.taskDay = taskDay;
	}

	public static TaskDay getTaskDay(String tskDay) {
		for (TaskDay day : TaskDay.values()) {
			if (day.getTaskDay().equalsIgnoreCase(tskDay)) {
				return day;
			}
		}
		return null;
	}

}
