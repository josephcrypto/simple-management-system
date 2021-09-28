package cn.coding.com.simplecrm.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", length = 25)
    @NotBlank(message = "please fill your first name")
    private String firstName;

    @Column(name = "lastName", length = 25)
    @NotBlank(message = "please fill your last name")
    private String lastName;

    @Column(name = "emailAddress", length = 200, unique = true)
    @NotBlank(message = "please fill your email address")
    private String emailAddress;

    @Column(name = "address", length = 200)
    @NotBlank(message = "please fill your address")
    private String address;

    @Column(name = "city", length = 30)
    @NotBlank(message = "please fill your city")
    private String city;

    @Column(name = "country", length = 30)
    @NotBlank(message = "please fill your country")
    private String country;

    @Column(name = "phoneNumber", length = 20)
    @NotBlank(message = "please enter your phone number")
    private String phoneNumber;

}
