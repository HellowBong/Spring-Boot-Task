package com.yoojungbong.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoojungbong.task.dto.request.PatchTaskRequestDto;
import com.yoojungbong.task.dto.request.PostTaskRequestDto;

@RestController
@RequestMapping("api/v1/task")
public class MainController {

    // 일정 불러오기
    // 프로토콜://호스트:포트/api/task/{taskNumber}
    @GetMapping("/{taskNumber}")
    public String getTask(
        @PathVariable("taskNumber") Integer taskNumber 
    ){
        return null;
    }

    // 일정 작성하기
    // 프로토콜://호스트:포트/api/v1/task
    @PostMapping("")
    public String postTask(
        @RequestBody PostTaskRequestDto requestBody
    ){
        return null; 
    }

    // 일정 수정하기
    // 프로토콜://호스트:포트/api/task/{taskNumber}
    @PatchMapping("/{taskNumber}")
    public String patchTask(
        @PathVariable("taskNumber") Integer taskNumber,
        @RequestBody PatchTaskRequestDto requestBody
    ){
        return null;
    }

    // 일정 삭제하기
    // 프로토콜://호스트:포트/api/task/{taskNumber}
    @DeleteMapping("/{taskNumber}")
    public String deleteTask(
        @PathVariable("taskNumber") Integer taskNumber
    ){
        return null;
    }
}
