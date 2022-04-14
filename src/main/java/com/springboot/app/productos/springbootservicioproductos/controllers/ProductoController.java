package com.springboot.app.productos.springbootservicioproductos.controllers;

import com.springboot.app.productos.springbootservicioproductos.models.entity.Producto;
import com.springboot.app.productos.springbootservicioproductos.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Convierte a json lo que retorna los métodos handler del controlador
public class ProductoController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping("/listar")
    public List<Producto> listar(){

        return iProductoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public  Producto detalle(@PathVariable Long id){

        return iProductoService.findById(id);
    }


}
