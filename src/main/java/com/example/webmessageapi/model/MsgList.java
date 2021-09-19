package com.example.webmessageapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class MsgList {
    private int id1;
    private int id2;
    private String timeStart;
    private String timeEnd;
}
