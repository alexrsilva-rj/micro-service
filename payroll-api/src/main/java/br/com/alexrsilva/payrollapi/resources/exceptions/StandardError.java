package br.com.alexrsilva.payrollapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class StandardError {


    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
