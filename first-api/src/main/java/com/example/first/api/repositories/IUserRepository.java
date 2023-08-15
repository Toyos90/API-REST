package com.example.first.api.repositories;
import com.example.first.api.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<Producto, Integer>{
}
