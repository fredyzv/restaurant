package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="tipo_producto")
public class TipoProducto implements Serializable {

    @Id
    private int codtipoprod;
    private String descripcion;
}
