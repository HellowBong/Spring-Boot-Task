package com.yoojungbong.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoojungbong.task.dto.PostRequestBodyDto;

@RestController
@RequestMapping("api/v1")
public class MainController {

    @GetMapping("/task/{taskNumber}")
    public String getPathVariable(
        @PathVariable("taskNumber")String taskNumber 
    ){
        return "Parameter value : " + taskNumber;
    }

    @PostMapping("task")
    public String postMetod(@RequestBody PostRequestBodyDto requestBody){
        return "일정 작성" + requestBody.getName() + " " + requestBody.getCategory() + " " + requestBody.getText() + " " + requestBody.getDate() + " " + requestBody.getTime();
    }

    @PatchMapping("/task/{taskNumber}")
    public String PatchMetod(@RequestBody PostRequestBodyDto requestBody){
        return "일정 수정" + requestBody.getName() + " " + requestBody.getCategory() + " " + requestBody.getText() + " " + requestBody.getDate() + " " + requestBody.getTime();
    }

    @DeleteMapping("/task/{taskNumber}")
    public String DeleteMethod(){
        return "This method is Delete method";
    }
}
