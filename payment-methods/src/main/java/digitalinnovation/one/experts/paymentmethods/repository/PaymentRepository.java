package digitalinnovation.one.experts.paymentmethods.repository;

import digitalinnovation.one.experts.paymentmethods.model.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
    List<Payment> findByName(String name);
}
