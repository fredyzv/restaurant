package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable {

    @Id
    private int codrol;
    private String descripcion;
}
