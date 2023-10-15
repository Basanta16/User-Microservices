package com.basanta.userservice.controllers;

import com.basanta.userservice.helper.ResponseStatus;
import com.basanta.userservice.messages.CustomMessageHandler;
import com.basanta.userservice.response.GlobalResponseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class BaseController {


    protected final ResponseStatus apiSuccessResponse = ResponseStatus.SUCCESS;
    protected final ResponseStatus apiErrorResponse = ResponseStatus.FAIL;

    @Autowired
    protected CustomMessageHandler customMessageHandler;


    protected GlobalResponseApi successResponse(String message, Object data){

        GlobalResponseApi globalResponseApi = new GlobalResponseApi();
        globalResponseApi.setStatus(apiSuccessResponse);
        globalResponseApi.setHttp(HttpStatus.ACCEPTED);
        globalResponseApi.setData(data);
        globalResponseApi.setMessage(message);
        return globalResponseApi;
    }

    protected GlobalResponseApi createdResponse(String message, Object data){

        GlobalResponseApi globalResponseApi = new GlobalResponseApi();
        globalResponseApi.setStatus(apiSuccessResponse);
        globalResponseApi.setHttp(HttpStatus.CREATED);
        globalResponseApi.setData(data);
        globalResponseApi.setMessage(message);
        return globalResponseApi;
    }

    protected GlobalResponseApi getResponse(String message, Object data){

        GlobalResponseApi globalResponseApi = new GlobalResponseApi();
        globalResponseApi.setStatus(apiSuccessResponse);
        globalResponseApi.setHttp(HttpStatus.FOUND);
        globalResponseApi.setData(data);
        globalResponseApi.setMessage(message);
        return globalResponseApi;
    }

    protected GlobalResponseApi errorResponse(String message, Object data){

        GlobalResponseApi globalResponseApi = new GlobalResponseApi();
        globalResponseApi.setStatus(apiErrorResponse);
        globalResponseApi.setData(data);
        globalResponseApi.setHttp(HttpStatus.BAD_REQUEST);
        globalResponseApi.setMessage(message);
        return globalResponseApi;
    }
}
