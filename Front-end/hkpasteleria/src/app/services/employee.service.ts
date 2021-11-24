import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Employee } from '../models/Employee'
//import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  //Direccion de la api a conectar
  API_URI = 'http://localhost:8080/api'

  constructor( private http: HttpClient) { }

  //Peticiones get
  getEmployees() {
    return this.http.get(`${this.API_URI}/empleados/empleado`);
  }

  getEmployee(id: String) {
    return this.http.get(`${this.API_URI}/empleados/empleado/${id}`);
  }

  saveEmploye(employee: Employee) {
    return this.http.post(`${this.API_URI}/empleados/empleado`, employee);
  }

  deleteEmployee(id: string) {
    return this.http.delete(`${this.API_URI}/empleados/empleado/${id}`);
  }

  updateEmployee(id: String, updatedEmployee: Employee) {
    return this.http.put(`${this.API_URI}/empleados/empleado/${id}`, updatedEmployee);
  }
}
