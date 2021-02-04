package com.chazool.highwayvehiclepasser.model.driverservice;

import lombok.Data;
import lombok.ToString;
import sun.security.util.Password;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver")
@Data
@ToString
public class Driver {

    @Id
    @GeneratedValue
    private int id;
    private String fName;
    private String lName;
    private String dLicenseNo;
    private char gender;
    private String email;
    private String password;
    private int phoneNo;
    private LocalDateTime registrationDate;
    private boolean isActive;
    private int activeVehicle;


}
