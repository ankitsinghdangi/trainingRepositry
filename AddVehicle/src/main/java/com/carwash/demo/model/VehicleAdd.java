package com.carwash.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VehicleAdd")
public class VehicleAdd {
	
	@Id
	private String vehiclenumber;
	private String brand;
	private String vehicleModel;
	
	public VehicleAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleAdd(String vehiclenumber, String brand, String vehicleModel) {
		super();
		this.vehiclenumber = vehiclenumber;
		this.brand = brand;
		this.vehicleModel = vehicleModel;
	}

	public String getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@Override
	public String toString() {
		return "VehicleAdd [vehiclenumber=" + vehiclenumber + ", brand=" + brand + ", vehicleModel=" + vehicleModel
				+ "]";
	}
	
	
}