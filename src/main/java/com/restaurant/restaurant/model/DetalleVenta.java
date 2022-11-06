package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="detalle_venta")
public class DetalleVenta implements Serializable {

    @Id
    private int coddetaventa;
    private int codventa;
    private int codprod;
    private int cantidad;
    private Double precio;
    private Double total;

}
