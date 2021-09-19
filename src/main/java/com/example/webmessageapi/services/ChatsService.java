package com.example.webmessageapi.services;

import com.example.webmessageapi.entities.ChatsEntity;
import com.example.webmessageapi.model.MsgList;
import com.example.webmessageapi.repositories.ChatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ChatsService {
    @Autowired
    private ChatsRepository chatsRepository;

    public void save(ChatsEntity entity){
        chatsRepository.save(entity);
    }

    public List<ChatsEntity> getMsgList(MsgList msgList){
        if(msgList.getTimeEnd() == null || msgList.getTimeStart() == null){
            return chatsRepository.findById1AndId2(msgList.getId1(), msgList.getId2());
        }else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime timeStart = LocalDateTime.parse(msgList.getTimeStart(), formatter);
            LocalDateTime timeEnd = LocalDateTime.parse(msgList.getTimeEnd(), formatter);
            return chatsRepository.findById1AndId2AndDatetimeBetween(msgList.getId1(), msgList.getId2(), timeStart, timeEnd);
        }
    }
}
