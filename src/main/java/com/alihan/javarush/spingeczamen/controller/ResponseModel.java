package com.alihan.javarush.spingeczamen.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Setter
@Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class ResponseModel<T> {
    @JsonProperty("Сообщение")
    private String message;

    @JsonProperty("status_code")
    private int statusCode;

    @JsonProperty("status_description")
    private String statusDescription;

    @JsonProperty("data")
    private T data;

        public ResponseModel(String message, int statusCode, String statusDescription, T data) {
            this.message = message;
            this.statusCode = statusCode;
            this.statusDescription = statusDescription;
            this.data = data;
        }
    }
