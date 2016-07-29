/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ops;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anele
 */
@Entity
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomer_ID", query = "SELECT c FROM Customer c WHERE c.customer_ID = :customer_ID"),
    @NamedQuery(name = "Customer.findByCustomer_Name", query = "SELECT c FROM Customer c WHERE c.customer_Name = :customer_Name"),
    @NamedQuery(name = "Customer.findByCustomer_Surname", query = "SELECT c FROM Customer c WHERE c.customer_Surname = :customer_Surname"),
    @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByRegion", query = "SELECT c FROM Customer c WHERE c.region = :region"),
    @NamedQuery(name = "Customer.findByPostalCode", query = "SELECT c FROM Customer c WHERE c.postalCode = :postalCode"),
    @NamedQuery(name = "Customer.findByCountry", query = "SELECT c FROM Customer c WHERE c.country = :country")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Customer_ID")
    private Integer customer_ID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 23)
    @Column(name = "Customer_Name")
    private String customer_Name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Customer_Surname")
    private String customer_Surname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Phone")
    private int phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Region")
    private String region;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Postal Code")
    private String postalCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Country")
    private String country;

    public Customer() {
    }

    public Customer(Integer customer_ID) {
        this.customer_ID = customer_ID;
    }

    public Customer(Integer customer_ID, String customer_Name, String customer_Surname, int phone, String address, String city, String region, String postalCode, String country) {
        this.customer_ID = customer_ID;
        this.customer_Name = customer_Name;
        this.customer_Surname = customer_Surname;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
    }

    public Integer getCustomerID() {
        return customer_ID;
    }

    public void setCustomerID(Integer customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomerName() {
        return customer_Name;
    }

    public void setCustomerName(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getCustomerSurname() {
        return customer_Surname;
    }

    public void setCustomerSurname(String customer_Surname) {
        this.customer_Surname = customer_Surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customer_ID != null ? customer_ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customer_ID == null && other.customer_ID != null) || (this.customer_ID != null && !this.customer_ID.equals(other.customer_ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ops.Customer[ customer_ID=" + customer_ID + " ]";
    }
    
}
