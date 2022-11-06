package com.restaurant.restaurant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {

    @Id
    private int codestado;
    private String descripcion;
}
