import { Component, OnInit } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { Router } from '@angular/router';
import  { LoginPojo } from '../LoginPojo'
import { RegisterPojo } from '../registerpojo';
import { RegisterService } from '../register.service';
// import { UserService } from './user.service';
// import { UserAccount } from '../userAccount';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
title:"Car wash"
  submitted: boolean=false;
 
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  logForm: FormGroup;
  response:any;
  login:LoginPojo=new LoginPojo();
  register:RegisterPojo=new RegisterPojo();
  ngOnInit() {
    this.logForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]
  
})
  }
  onLogin(){
    this.submitted=true;
    console.log(this.login)
     
      this.userService.validateUser(this.login)
      .subscribe((response) =>
      {

        this.response=response;
        /* if(response==true)
        {
          console.log(response)
          this.route.navigateByUrl("addvehicle");
        }
        else{
          this.route.navigateByUrl("register");
        } */
        console.log(response), error => console.log(error)});
      /* this.loginAccount=new LoginAccount(); */
     // console.log(this.loginAccount)
  
      
     }


    }