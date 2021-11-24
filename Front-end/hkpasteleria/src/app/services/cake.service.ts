import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Cake } from '../models/cake'
//import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CakeService {

  //Direccion de la api a conectar
  API_URI = 'http://localhost:8080/api'

  constructor( private http: HttpClient) { }

  //Peticiones get
  getCakes() {
    return this.http.get(`${this.API_URI}/pasteles/pastel`);
  }

  getCake(id: String) {
    return this.http.get(`${this.API_URI}/pasteles/pastel/${id}`);
  }

  saveCake(cake: Cake) {
    return this.http.post(`${this.API_URI}/pasteles/pastel`, cake);
  }

  deleteCake(id: string) {
    return this.http.delete(`${this.API_URI}/pasteles/pastel/delete/${id}`);
  }

  updateCake(id: String, updatedCake: Cake) {
    return this.http.put(`${this.API_URI}/pasteles/pastel/${id}`, updatedCake);
  }
}
