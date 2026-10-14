package com.encapsulation;

public class CarEngineUtility {

	public static void main(String[] args) {
		Car carRef=new Car();
		carRef.setCarName("Rolls Royce");
		System.out.println(carRef.carName);
		carRef.setCarModel("Rolls Royce - Phantom");
		System.out.println(carRef.carModel);
		carRef.setCarPrice(70000000);
		System.out.println(carRef.carPrice);
		carRef.engineRef.setEngineName("Rolls Royce - Phantom - Engine");
		System.out.println(carRef.engineRef.getEngineName());
		carRef.engineRef.setEngineModel("Rolls Royce Engine2024");
		System.out.println(carRef.engineRef.getEngineModel());
		carRef.engineRef.setEnginePrice(800000);
		System.out.println(carRef.engineRef.getEnginePrice());
	}

}
