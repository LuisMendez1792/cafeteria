package com.ajolotito.cafeteria.service.impl;

import com.ajolotito.cafeteria.model.Producto;
import com.ajolotito.cafeteria.repository.CafeteriaRepository;
import com.ajolotito.cafeteria.service.CafeteriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class CafeteriaServiceImpl implements CafeteriaService {

    @Autowired
    private CafeteriaRepository cafeteriaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Producto crearProducto(Producto producto){
        Producto map = modelMapper.map(producto, Producto.class);
        return cafeteriaRepository.save(map);
    }

    public List<Producto> obtenerProductos(){
        return cafeteriaRepository.findAll();
    }

    public void eliminarProdcutoById(Long id){
        cafeteriaRepository.deleteById(id);
    }
}
