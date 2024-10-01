package org.walker.entities;

import java.time.Instant;

public class Lesson {
    private Long id;
    private String title;
    private String media;
    private Instant timeStamp;

    public Lesson() {
    }

    public Lesson(Long id, String title, String media) {
        this.id = id;
        this.title = title;
        this.media = media;
    }

    public Lesson(Long id, String title, String media, Instant timeStamp) {
        this.id = id;
        this.title = title;
        this.media = media;
        this.timeStamp = timeStamp;
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

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", media='" + media + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
