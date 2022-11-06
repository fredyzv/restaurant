package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    private int codusuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String username;
    private String contra;

    @ManyToOne
    @JoinColumn(name="codrol", insertable = false, updatable = false)
    private Rol rol;
    private int codrol;

    @ManyToOne
    @JoinColumn(name="codsucursal", insertable = false, updatable = false)
    private Sucursal sucursal;
    private int codsucursal;

}
