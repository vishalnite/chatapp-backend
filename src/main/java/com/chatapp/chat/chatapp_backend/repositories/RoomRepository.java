package com.chatapp.chat.chatapp_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.chatapp.chat.chatapp_backend.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
    // get room using roomId
    Room findByRoomId(String roomId);
}
