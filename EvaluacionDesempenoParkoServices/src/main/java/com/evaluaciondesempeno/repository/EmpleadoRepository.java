package com.evaluaciondesempeno.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.evaluaciondesempeno.entity.Empleado;

public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long> {

}
