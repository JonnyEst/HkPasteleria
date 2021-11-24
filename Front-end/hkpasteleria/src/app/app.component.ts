import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hkpasteleria';
  description = '';
  constructor(private htt: HttpClient) {}
 
  ngOnInit () {
    this.htt.get("http://localhost:8080/api/pasteles/pastel",{responseType: 'text'}).subscribe(
      (res:any) => {
        this.description = res;
      },
      (err:any) => console.log(err)
    ),

    this.htt.get("http://localhost:8080/api/empleados/empleado",{responseType: 'text'}).subscribe(
      (res:any) => {
        this.description = res;
      },
      (err:any) => console.log(err)
    )


  }

}
