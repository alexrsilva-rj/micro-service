package br.com.alexrsilva.payrollapi.resources;

import br.com.alexrsilva.payrollapi.domain.Payroll;
import br.com.alexrsilva.payrollapi.domain.User;
import br.com.alexrsilva.payrollapi.feignClients.UserFeign;
import br.com.alexrsilva.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final UserFeign userFeign;
    private final PayrollService payrollService;
    @GetMapping( value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                payrollService.getPayment(workerId,payment)
        );
    }
}
