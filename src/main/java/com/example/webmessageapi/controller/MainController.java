package com.example.webmessageapi.controller;

import com.example.webmessageapi.entities.ChatsEntity;
import com.example.webmessageapi.model.MsgList;
import com.example.webmessageapi.services.ChatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/message-api")
public class MainController {

    @Autowired
    private ChatsService chatsService;

    @PostMapping("/send")
    public void sendMessage(int id1, int id2, String text){
        ChatsEntity entity = new ChatsEntity(id1,id2,text);
        chatsService.save(entity);
        System.out.println(entity);
    }

    @GetMapping("/list-message")
    public List<ChatsEntity> msgList(int id1, int id2, @RequestParam(required = false) String timeStart, @RequestParam(required = false) String timeEnd){
        MsgList msgList = new MsgList(id1,id2,timeStart,timeEnd);
        return chatsService.getMsgList(msgList);
    }

}
