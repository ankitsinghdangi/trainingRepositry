package com.carwash.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="VehicleAdd")
public class VehicleAdd {
	@Id
	String Vehiclenumber;
	String Brand;
	String VehicleModel;
	public String getVehiclenumber() {
		return Vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		Vehiclenumber = vehiclenumber;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getVehicleModel() {
		return VehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		VehicleModel = vehicleModel;
	}
	public VehicleAdd(String vehiclenumber, String brand, String vehicleModel) {
		super();
		Vehiclenumber = vehiclenumber;
		Brand = brand;
		VehicleModel = vehicleModel;
	}
	public VehicleAdd() {
		super();
	}
	@Override
	public String toString() {
		return "VehicleAdd [Vehiclenumber=" + Vehiclenumber + ", Brand=" + Brand + ", VehicleModel=" + VehicleModel
				+ "]";
	}
	

}
