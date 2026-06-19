package com.pluralsight.dealership.repository;

import com.pluralsight.dealership.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

List<Vehicle> findByMake(String make);
List<Vehicle> findByModel(String model);
List<Vehicle> findByColor(String color);
List<Vehicle> findByVehicleType(String vehicleType);




}
