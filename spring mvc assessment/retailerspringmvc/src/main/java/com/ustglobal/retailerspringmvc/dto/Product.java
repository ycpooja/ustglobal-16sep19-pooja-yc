package com.ustglobal.retailerspringmvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
@Id
@Column
private int product_id;
@Column
private String product_name;
@OneToMany(mappedBy="Product")
private List<Product> Product;




}
