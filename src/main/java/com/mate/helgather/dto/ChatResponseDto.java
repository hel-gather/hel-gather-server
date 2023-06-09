package com.mate.helgather.dto;

import com.mate.helgather.domain.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChatResponseDto {
    @NotNull(message = "유저 id는 필수 입니다.")
    private long userId; // 채팅을 보낸 사람

    @NotNull(message = "메세지는 필수 입니다.")
    private String message; // 메시지

    @NotNull(message = "시간은 필수 입니다.")
    private String time; // 시간은 프론트에서 담아서 보내줄

    private boolean isFirst;

    private String userProfile;

    public ChatResponseDto(ChatRequestDto chatRequestDto, Message message, Long prevMemberId) {
        this.userId = chatRequestDto.getUserId();
        this.message = chatRequestDto.getMessage();
        this.time = chatRequestDto.getTime();
        this.isFirst = this.getUserId() != prevMemberId;
        this.userProfile = chatRequestDto.getUserProfile();
    }

}
