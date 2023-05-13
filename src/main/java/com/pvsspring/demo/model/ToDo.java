package com.pvsspring.demo.model;

public class ToDo {
    private static int counter=0;




    private long toDoId;
    private String task;
    private String description;
    private String person;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    private int priority;

    public ToDo(){
        this.toDoId=counter++;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "toDoId=" + toDoId +
                ", task='" + task + '\'' +
                ", description='" + description + '\'' +
                ", person='" + person + '\'' +
                ", priority='" + priority + "\'" +
                '}';
    }

    public long getToDoId() {
        return toDoId;
    }

    public void setToDoId(long toDoId) {
        this.toDoId = toDoId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
