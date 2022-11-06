package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {

    @Id
    private int codprod;
    private String nombre;
    private Double precio;
    private int stock;
    @ManyToOne
    @JoinColumn(name="codtipoprod", updatable = false, insertable = false)
    private TipoProducto tipoProducto;
    private int codtipoprod;

    @ManyToOne
    @JoinColumn(name="codestado", updatable = false, insertable = false)
    private Estado estado;
    private int codestado;

    private String imagen;

}
