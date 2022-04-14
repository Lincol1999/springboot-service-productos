package com.springboot.app.productos.springbootservicioproductos.models.dao;

import com.springboot.app.productos.springbootservicioproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;


public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
