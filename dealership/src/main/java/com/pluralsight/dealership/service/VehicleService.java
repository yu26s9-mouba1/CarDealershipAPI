package com.pluralsight.dealership.service;

import com.pluralsight.dealership.model.Vehicle;
import com.pluralsight.dealership.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;

    }

    //Get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    //Get vehicle By ID
    public Optional <Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    //Add Vehicle
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    //Update Vehicle
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    //Delete Vehicle
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }






}
