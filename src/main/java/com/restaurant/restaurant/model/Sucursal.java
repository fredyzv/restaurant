package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable {
    @Id
    private int codsucursal;
    private String descripcion;
}
