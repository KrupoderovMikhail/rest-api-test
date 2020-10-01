package com.krupoderovmikhail.restapitest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.krupoderovmikhail.restapitest.enums.Gender;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Krupoderov Mikhail
 */
@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide a first name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Please provide a last name")
    private String lastName;

    @Column(name = "gender")
    @NotNull(message = "Please provide a gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "age")
    @NotNull(message = "Please provide a salary")
    @Min(value = 18, message = "The user must be over 18 years old")
    private Integer age;

    @Column(name = "position")
    @NotEmpty(message = "Please provide a position")
    private String position;

    @Column(name = "salary")
    @NotNull(message = "Please provide a salary")
    private BigDecimal salary;

    @Column(name = "hire_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull
    @Past(message = "Hire date cannot be greater than the current one")
    private Date hireDate;
}
