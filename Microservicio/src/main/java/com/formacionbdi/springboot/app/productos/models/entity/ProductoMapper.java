package com.formacionbdi.springboot.app.productos.models.entity;

import com.formacionbdi.springboot.app.productos.models.dto.ProductoDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper (nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductoMapper {

    ProductoMapper INSTANCE = Mappers.getMapper( ProductoMapper.class);

    @Mapping(source = "nombre", target = "nombreProducto")
    ProductoDTO productoToProductoDTO (Producto producto);

    @Mapping(source = "nombreProducto", target = "nombre")
    @Mapping(source = "fechaDeCreacion", target = "createAt")
    Producto productoDTOToProducto (ProductoDTO productoDTO);

    @Mapping(source = "nombreProducto", target = "nombre")
    @Mapping(source = "fechaDeCreacion", target = "createAt")
    Producto updateProducto (ProductoDTO productoDTO, @MappingTarget Producto productoModificable);
}
