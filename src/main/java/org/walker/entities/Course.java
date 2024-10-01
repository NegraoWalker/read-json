package org.walker.entities;

import java.util.List;

public class Course {
    private Long id;
    private String title;
    private List<Lesson> lessons;

    public Course() {
    }

    public Course(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Course(Long id, String title, List<Lesson> lessons) {
        this.id = id;
        this.title = title;
        this.lessons = lessons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

}
