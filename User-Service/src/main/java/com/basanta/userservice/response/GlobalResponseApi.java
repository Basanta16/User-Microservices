package com.basanta.userservice.response;

import com.basanta.userservice.helper.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class GlobalResponseApi {

    private ResponseStatus status;
    private String message;
    private HttpStatus http;
    private Object data;

    public GlobalResponseApi() {

        //Add Parameters for future...

    }
}
