package com.springboot.app.productos.springbootservicioproductos.service;

import com.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);


}
