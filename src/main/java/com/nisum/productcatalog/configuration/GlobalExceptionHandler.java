package com.nisum.productcatalog.configuration;

import com.nisum.productcatalog.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by yc04292 on 12/14/18.
 */



@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


  @ExceptionHandler(value ={CustomException.class})
  public ResponseEntity handleCustomException(CustomException ex,WebRequest req)
  {
    logger.error("Not good");

    return handleExceptionInternal(ex,ex.getStackTrace(),null, HttpStatus.BAD_REQUEST,req);
  }

}
