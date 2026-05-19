package com.ajolotito.cafeteria.service;


import com.ajolotito.cafeteria.model.Producto;

import java.util.List;

public interface CafeteriaService {

    Producto crearProducto(Producto producto);
    List<Producto> obtenerProductos();
    void eliminarProdcutoById(Long id);



}
