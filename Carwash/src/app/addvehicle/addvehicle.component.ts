import { Component, OnInit } from '@angular/core';
import  { RegisterPojo } from '../registerpojo';
import { RegisterService } from '../register.service';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AddvehiclePojo } from '../addvehiclepojo';

@Component({
  selector: 'app-register',
  templateUrl: './addvehicle.component.html',
  styleUrls: ['./addvehicle.component.css']
})
export class AddvehicleComponent implements OnInit {

  // Vehiclenumber:string
  // Brand:string
  // VehicleModel:string
 
  addvpojo: AddvehiclePojo = new AddvehiclePojo();
  submitted = false;
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  vehicleForm:FormGroup
  //login:LoginPojo=new LoginPojo();
  //Register:RegisterPojo=new RegisterPojo();
  ngOnInit() {
    
    this.vehicleForm=this.fb.group(
      {
        //email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
        vehiclenumber:['',[ Validators.required] ],
        brand:['',[Validators.required]],
        vehicleModel:['',[Validators.required]]
        //password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ],
      
      })  }

  save() {
    console.log("in save")
    console.log(this.addvpojo)
    this.userService.addVehicle(this.addvpojo)
      .subscribe(data => console.log(data), error => console.log(error));
    this.addvpojo= new AddvehiclePojo();
    this.route.navigateByUrl("bookwashservice")

  }

  onAdd() {
    this.submitted = true;
    console.log("onadd")
    this.save();
    //this.route.navigateByUrl("membership")

  }
 
}

