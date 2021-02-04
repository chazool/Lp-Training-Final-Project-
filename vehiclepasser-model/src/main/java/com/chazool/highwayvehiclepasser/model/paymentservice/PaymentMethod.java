package com.chazool.highwayvehiclepasser.model.paymentservice;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "paymentMethod")
@Data
@ToString
public class PaymentMethod {

    @Id
    @GeneratedValue
    private int id;
    private int driver;
    private BigDecimal balanceAmount;
    private LocalDateTime issueDate;
    private LocalDateTime closeDate;
    private boolean isActive;





}
