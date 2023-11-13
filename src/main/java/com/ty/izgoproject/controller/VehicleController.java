package com.ty.izgoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.izgoproject.entity.Vehicle;
import com.ty.izgoproject.response.ResponseStructure;
import com.ty.izgoproject.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	@PostMapping("/saveVehicle/{u_id}")
	public ResponseEntity<ResponseStructure<Vehicle>> saveVehicle(@PathVariable int u_id, @RequestBody Vehicle vehicle){
		return vehicleService.saveVehicle(vehicle, u_id);
	}
	@GetMapping("/getVehicle/{v_id}")
	public ResponseEntity<ResponseStructure<Vehicle>> getVehicleById(@PathVariable int v_id){
		return vehicleService.getVehicleById(v_id);
	}
	@PutMapping("/updateVehicle")
	public ResponseEntity<ResponseStructure<Vehicle>> updateVehicle(@RequestBody Vehicle vehicle){
		return vehicleService.updateVehicle(vehicle);
	}
      @DeleteMapping("/deleteVehicle/{v_id}")
	public ResponseEntity<ResponseStructure<String>> deleteVehicleById(@PathVariable int v_id){
      return vehicleService.deleteVehicleById(v_id);
      }
      @GetMapping("/getAllVehicle")
      public ResponseEntity<ResponseStructure<List<Vehicle>>> getAllVehicle(){
      return vehicleService.getAllVehicle();
      }
      @GetMapping("/getVehicleByVehicleNo/{v_no}")
      public ResponseEntity<ResponseStructure<Vehicle>> getVehicleByVehicleNo(@PathVariable String v_no){
    	  return vehicleService.getVehicleByVehicleNo(v_no);
      }

}