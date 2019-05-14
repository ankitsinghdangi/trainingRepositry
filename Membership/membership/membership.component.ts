import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { MemberShipPojo } from './MemberShipPojo';

@Component({
  selector: 'app-membership',
  templateUrl: './membership.component.html',
  styleUrls: ['./membership.component.css']
})
export class MemberShipComponent implements OnInit {
  submitted:any=true
 
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  memForm:FormGroup
  member:MemberShipPojo=new MemberShipPojo();
  data:any
  ngOnInit() 
  {
    this.memForm = this.fb.group({
      membership: ['', [Validators.required ]],
      // freewash: ['', [Validators.required ]],
      // polishing: ['', [Validators.required ]],
          
   });
  }

  onMemberShip(){
    this.submitted=false
    console.log("in membership() method")
    console.log(this.member)
      this.userService.memberShip(this.member.membership)
      .subscribe((data) => this.data=data, error => console.log(error));
      this.route.navigateByUrl("bookwashservice")
}
}
