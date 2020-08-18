package com.springboottutorials.demoProject1.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne(targetEntity=Address.class, cascade=CascadeType.ALL)
    @JoinColumn(name="address")
    private Address address;

/*    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="studentid")
    @OrderColumn(name="type")
    private List<Address> addressList;*/

    @Column(name = "dob")
    private String dob;

    @Transient
    private int age;

    @Column(name="divison")
    private int div;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
