package com.ajolotito.cafeteria.controller;

import com.ajolotito.cafeteria.model.Producto;
import com.ajolotito.cafeteria.repository.CafeteriaRepository;
import com.ajolotito.cafeteria.service.CafeteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/cafeteria")
public class ApiController {

    @Autowired
    private CafeteriaService cafeteriaService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/productos")
    public List<Producto> obtenerProductos() {
        return cafeteriaService.obtenerProductos();
    }

    @PostMapping(value = "/crearProducto", consumes = "application/json")
    public Producto crearProducto(@RequestBody Producto producto) {
        return cafeteriaService.crearProducto(producto);
    }

    @DeleteMapping(value = "/eliminarProducto/{id}")
    public void eliminarProductoById(@RequestParam Long id ) {
        cafeteriaService.eliminarProdcutoById(id);
    }

}
