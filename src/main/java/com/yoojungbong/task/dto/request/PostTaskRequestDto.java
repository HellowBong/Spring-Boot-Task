package com.yoojungbong.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostTaskRequestDto {
    // 일정이름
    private String taskName;
    // 카테고리
    private String category;
    // 설명
    private String description;
    // 날짜
    private String date;
    // 시간
    private String time;
}