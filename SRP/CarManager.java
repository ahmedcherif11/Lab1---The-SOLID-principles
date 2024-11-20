package com.directi.training.srp.exercise;

public class CarManager {
    private final CarRepository carRepository;
    private final BestCarFinder bestCarFinder;

    public CarManager(CarRepository carRepository, BestCarFinder bestCarFinder) {
        this.carRepository = carRepository;
        this.bestCarFinder = bestCarFinder;
    }

    public Car getFromDb(String carId) {
        return carRepository.getFromDb(carId);
    }

    public String getCarsNames() {
        return carRepository.getCarsNames();
    }

    public Car getBestCar() {
        return bestCarFinder.getBestCar(carRepository.getCars());
    }
}