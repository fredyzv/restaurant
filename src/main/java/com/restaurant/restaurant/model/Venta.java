package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="venta")
public class Venta implements Serializable {

    @Id
    private int codventa;

    @ManyToOne
    @JoinColumn(name="codsucursal", updatable = false, insertable = false)
    private Sucursal sucursal;
    private int codsucursal;

    @ManyToOne
    @JoinColumn(name="codusuario", updatable = false, insertable = false)
    private Usuario usuario;
    private int codusuario;

    private Date fecha;
    private Double monto;
}
