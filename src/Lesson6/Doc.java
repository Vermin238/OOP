package Lesson6;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.UUID;

public class Doc {
    private UUID id;
    private String number;
    private String text;

    public Doc(String number, String text) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.text = text;
    }
}
