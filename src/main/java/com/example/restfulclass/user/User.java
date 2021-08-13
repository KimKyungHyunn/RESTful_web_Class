package com.example.restfulclass.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력하시오")
    private String name;

    @Past //joinDate는 미래 데이터가 올 수 없다
    private Date joinDate;
}
