package day16;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

// 1012.sql 의 delivery_log 테이블과 매핑되는 엔티티
@Entity
@Table(name = "delivery_log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private String orderId; // 주문번호

    private String courier; // 배송사

    @Column(name = "origin_hub")
    private String originHub; // 출발 허브

    @Column(name = "delivery_days")
    private Integer deliveryDays; // 배송 일수

    @Column(name = "is_returned")
    private Boolean isReturned; // 반품 여부

    @Column(name = "return_reason")
    private String returnReason; // 반품/배송 사유

    @Column(name = "log_date")
    private LocalDate logDate; // 로그 날짜
}
