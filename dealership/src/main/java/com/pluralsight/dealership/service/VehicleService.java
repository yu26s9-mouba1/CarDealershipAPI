package com.pluralsight.dealership.service;

import com.pluralsight.dealership.model.Vehicle;
import com.pluralsight.dealership.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;

    }

    public List<Vehicle> searchVehicles(String make,
                                        String model,
                                        String color,
                                        String vehicleType,
                                        Double minPrice,
                                        Double maxPrice,
                                        Integer minYear,
                                        Integer maxYear,
                                        Integer minMiles,
                                        Integer maxMiles) {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles.stream()
                .filter(v -> make == null || v.getMake().equalsIgnoreCase(make))
                .filter(v -> model == null || v.getModel().equalsIgnoreCase(model))
                .filter(v -> color == null || v.getColor().equalsIgnoreCase(color))
                .filter(v -> vehicleType == null || v.getVehicleType().equalsIgnoreCase(vehicleType))
                .filter(v -> minPrice == null || v.getPrice() >= minPrice)
                .filter(v -> maxPrice == null || v.getPrice() <= maxPrice)
                .filter(v -> minYear == null || v.getYear() >= minYear)
                .filter(v -> maxYear == null || v.getYear() <= maxYear)
                .filter(v -> minMiles == null || v.getOdometer() >= minMiles)
                .filter(v -> maxMiles == null || v.getOdometer() <= maxMiles)
                .toList();
    }

    //Get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    //Get Vehicle by make
    public List<Vehicle> getVehicleByMake(String make) {
        return vehicleRepository.findByMake(make);
    }

    //Get vehicle by model
    public List <Vehicle> getVehiclesByModel(String model) {
        return vehicleRepository.findByModel(model);
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
