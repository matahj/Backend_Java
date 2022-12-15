package com.example.workb.repository;

import com.example.workb.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer,Long> {
    Trainer findOneByName(String name);
}
