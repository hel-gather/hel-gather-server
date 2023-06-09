package com.mate.helgather.repository;

import com.mate.helgather.domain.ChatRoom;
import com.mate.helgather.domain.Message;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Long> {
    Optional<Message> findTopByChatRoomOrderByCreatedAtDesc(ChatRoom chatRoom);
    List<Message> findAllByChatRoom_Id(Long chatRoomId, Pageable pageable);
    Slice<Message> findSlicesByChatRoom_Id(Long chatRoomId, Pageable pageable);

}
