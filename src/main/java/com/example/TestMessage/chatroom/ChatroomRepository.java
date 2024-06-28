package com.example.TestMessage.chatroom;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ChatroomRepository extends MongoRepository<ChatRoom,String> {
     Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
