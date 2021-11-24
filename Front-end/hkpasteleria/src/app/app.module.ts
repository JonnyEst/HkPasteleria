import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { EmployeeFormComponent } from './components/employee-form/employee-form.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';

import { EmployeeService } from './services/employee.service';
import { CakeFormComponent } from './components/cake-form/cake-form.component';
import { CakeListComponent } from './components/cake-list/cake-list.component';
import { CakeService } from './services/cake.service';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    EmployeeFormComponent,
    EmployeeListComponent,
    CakeFormComponent,
    CakeListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    EmployeeService,
    CakeService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
