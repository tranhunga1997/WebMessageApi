package com.example.webmessageapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chats")
@IdClass(ChatsPK.class)
@Data
public class ChatsEntity {
    @Id
    private int id1;
    @Id
    private int id2;
    @Column
    private String message;
    @Id
    private LocalDateTime datetime = LocalDateTime.now();

    public ChatsEntity(){
        datetime = LocalDateTime.now();
    }

    public ChatsEntity(int id1, int id2, String text) {
        this();
        this.id1 = id1;
        this.id2 = id2;
        message = text;
    }

    @Override
    public String toString() {
        return "ChatsEntity{" +
                "id1=" + id1 +
                ", id2=" + id2 +
                ", message='" + message + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
