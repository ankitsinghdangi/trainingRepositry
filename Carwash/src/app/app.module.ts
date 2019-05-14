import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '../../node_modules/@angular/router';
import { AboutComponent } from './about/about.component';
import { HttpClientModule } from '../../node_modules/@angular/common/http';
import { FormsModule,ReactiveFormsModule } from '../../node_modules/@angular/forms';
import { LoginComponent } from './login/login.component';
import { AddvehicleComponent } from './addvehicle/addvehicle.component';
import { BookwashserviceComponent } from './bookwashservice/bookwashservice.component';
import { PaymentComponent } from './payment/payment.component';
import { CarouselModule } from 'ngx-bootstrap/carousel';


@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    AboutComponent,
    LoginComponent,
    AddvehicleComponent,
    BookwashserviceComponent,
    PaymentComponent,
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,
    RouterModule.forRoot([
     {path:'register',component:RegisterComponent},
     {path:'about',component:AboutComponent},
     {path:'login',component:LoginComponent},
     {path:'addvehicle',component:AddvehicleComponent},
     {path:'bookwashservice',component:BookwashserviceComponent},
     {path:'payment',component:PaymentComponent},
  
    
    ]),
    CarouselModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
