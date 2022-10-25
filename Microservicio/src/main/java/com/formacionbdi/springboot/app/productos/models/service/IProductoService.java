package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.productos.models.dto.ProductoDTO;
import com.formacionbdi.springboot.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findById(Long id);

	public Producto create(Producto producto);

	public Producto actualizar(ProductoDTO productoDTO);
	
}
