package com.adjoda.ws.api.controller.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRest {
    private String userFirstName;
    private String userLastName;
    private String userId;
}
