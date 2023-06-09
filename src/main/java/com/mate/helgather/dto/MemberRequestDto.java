package com.mate.helgather.dto;

import com.mate.helgather.domain.Member;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MemberRequestDto {

    private String name;

    private String phone;

    private String nickname;

    private String password;

    private Integer birthYear;

    private Integer birthMonth;

    private Integer birthDay;

    public Member toEntity() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        return Member.builder()
                .name(this.name)
                .phone(this.phone)
                .nickname(this.nickname)
                .password(this.password)
                .birthDate(birthDate)
                .build();
    }
}
