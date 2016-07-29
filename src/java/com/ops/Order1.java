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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
    @NamedQuery(name = "Order1.findByOrderID", query = "SELECT o FROM Order1 o WHERE o.orderID = :orderID"),
    @NamedQuery(name = "Order1.findByCustomerID", query = "SELECT o FROM Order1 o WHERE o.customerID = :customerID"),
    @NamedQuery(name = "Order1.findByCustomerName", query = "SELECT o FROM Order1 o WHERE o.customerName = :customerName"),
    @NamedQuery(name = "Order1.findByMealType", query = "SELECT o FROM Order1 o WHERE o.mealType = :mealType"),
    @NamedQuery(name = "Order1.findByDrinks", query = "SELECT o FROM Order1 o WHERE o.drinks = :drinks"),
    @NamedQuery(name = "Order1.findByExtras", query = "SELECT o FROM Order1 o WHERE o.extras = :extras"),
    @NamedQuery(name = "Order1.findByEmployeeID", query = "SELECT o FROM Order1 o WHERE o.employeeID = :employeeID")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Order_ID")
    private Integer orderID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Customer_ID")
    private String customerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Customer_Name")
    private String customerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Meal_Type")
    private String mealType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Drinks")
    private String drinks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Extras")
    private String extras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Employee_ID")
    private String employeeID;

    public Order1() {
    }

    public Order1(Integer orderID) {
        this.orderID = orderID;
    }

    public Order1(Integer orderID, String customerID, String customerName, String mealType, String drinks, String extras, String employeeID) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.customerName = customerName;
        this.mealType = mealType;
        this.drinks = drinks;
        this.extras = extras;
        this.employeeID = employeeID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ops.Order1[ orderID=" + orderID + " ]";
    }
    
}
