package com.example.webmessageapi.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class ChatsPK implements Serializable {
    private int id1;
    private int id2;
    private LocalDateTime datetime;
}
