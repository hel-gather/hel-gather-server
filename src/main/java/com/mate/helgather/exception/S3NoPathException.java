package com.mate.helgather.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class S3NoPathException extends RuntimeException {
    ErrorCode errorCode = ErrorCode.S3_NO_PATH_ERROR;

}
