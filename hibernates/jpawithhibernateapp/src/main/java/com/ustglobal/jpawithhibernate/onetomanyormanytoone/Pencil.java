package com.ustglobal.jpawithhibernate.onetomanyormanytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Pencil")
public class Pencil {
@Id
@Column
private int pid;
private String color;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="bid",nullable=false)
private PencilBox PencilBox;

}
