package com.example.webmessageapi.repositories;

import com.example.webmessageapi.entities.ChatsEntity;
import com.example.webmessageapi.entities.ChatsPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ChatsRepository extends JpaRepository<ChatsEntity, ChatsPK> {

    List<ChatsEntity> findById1AndId2AndDatetimeBetween(int id1, int id2, LocalDateTime timeStart, LocalDateTime timeEnd);
    List<ChatsEntity> findById1AndId2(int id1, int id2);
}
