package com.tpecx.nasp.application.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BaseResponse {
    private Status status;
    private String message;

    final void setStatus(String status) {
       this.status = Status.get(status);
    }
    final void setStatus(Integer statusCode) {
        this.status = Status.get(statusCode);
    }

    enum Status {

        /**
         * 成功
         */
        SUCCESS("OK", 200),
        /**
         * 找不到
         */
        NOT_FOUND("NOT_FOUND", 404),
        /**
         * 错误，异常
         */
        ERROR("ERROR", 500);

        private String value;
        private Integer code;

        Status(String value, Integer code) {
            this.value = value;
            this.code = code;
        }

        public final static Status get(String value) {
            for (Status status : Status.values()) {
                if (status.value.equalsIgnoreCase(value)) {
                    return status;
                }
            }
            return null;
        }

        public final static Status get(Integer code) {
            for (Status status : Status.values()) {
                if (status.code.equals(code)) {
                    return status;
                }
            }
            return null;
        }
    }

}
