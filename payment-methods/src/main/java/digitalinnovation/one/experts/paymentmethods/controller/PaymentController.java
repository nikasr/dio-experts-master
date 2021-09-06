package digitalinnovation.one.experts.paymentmethods.controller;

import digitalinnovation.one.experts.paymentmethods.model.Payment;
import digitalinnovation.one.experts.paymentmethods.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Payment create(@RequestBody Payment payment) {
        return paymentRepository.save(payment);
    }

    @RequestMapping
    public Iterable<Payment>list() {
        return paymentRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Payment> findById(@PathVariable("id") Integer id) {
        return paymentRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Payment> findByName(@PathVariable("name") String name) {
        return paymentRepository.findByName(name);
    }
}
