import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  
  
  private baseUrl1 = 'http://localhost:8888/user';
  private baseUrl = 'http://localhost:1234/user';
  private vehicle = 'http://localhost:1212';
  private bookwash = 'http://localhost:9010';
  private payment1 = 'http://localhost:7777';
  //private membership = 'http://localhost:7000';
  
  
  //createCustomer: any;
  //addUser: any;
 
  constructor(private http: HttpClient) { }
 
 
  createRegister(reg: Object): Observable<Object> {
    console.log(reg)
    return this.http.post(`${this.baseUrl}` + `/add`, reg);
  }

  validateUser(login: Object): Observable<Object>{
    return this.http.post(`${this.baseUrl1}` + `/login`, login);
  }
  addVehicle(addvpojo: Object): Observable<Object> {
    
    console.log(addvpojo)
    console.log(`${this.vehicle}` + `/vehicleadd`)
    return this.http.post(`${this.vehicle}` + `/vehicleadd`, addvpojo);
  }
  bookservice(bookpojo: Object): Observable<Object> {
   
      return this.http.post(`${this.bookwash}` + `/bookWash`, bookpojo);
    }
    // memberShip(member: Object): Observable<Object> {
   
    //   return this.http.post(`${this.membership}` + `/membership`, member);
      
    // }
    payment(paypojo: Object): Observable<Object> {
   console.log(paypojo)
      return this.http.post(`${this.payment1}` + `/payment`, paypojo);
      
    }
}

