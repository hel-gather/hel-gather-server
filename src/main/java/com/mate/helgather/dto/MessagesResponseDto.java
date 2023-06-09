package com.mate.helgather.dto;

import com.mate.helgather.domain.Message;
import lombok.Getter;

@Getter
public class MessagesResponseDto {

    Long userId; //유저 아이디
    String userProfile; //유저 프로필 사진
    String message; //메세지
    String time; // 언제
    boolean isFirst;

    public MessagesResponseDto(Long userId, int userProfile, String message, String time, boolean isFirst) {
        this.userId = userId;
        this.userProfile = "";
        this.message = message;
        this.time = time;
        this.isFirst = isFirst;
    }

    public MessagesResponseDto(Message message, Long requestUserId) {
        this.userId = message.getMember().getId();
        this.userProfile = "";
        this.message = message.getDescription();
        this.time = message.getCreatedAt().toString();
        this.isFirst = (userId.equals(requestUserId));
    }
}
