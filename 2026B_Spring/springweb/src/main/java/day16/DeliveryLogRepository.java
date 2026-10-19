package day16;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryLogRepository
        extends JpaRepository<DeliveryLog, Integer> {

}
