package com.shoestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoestore.entity.Orderproduct;
@Repository
public interface OrderproductRepository extends JpaRepository<Orderproduct, Integer>{

}
