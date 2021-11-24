import { Component, OnInit, HostBinding } from '@angular/core';
import { Cake } from '../../models/cake';
import {  ActivatedRoute, Router } from '@angular/router'
import { CakeService } from 'src/app/services/cake.service';

@Component({
  selector: 'app-cake-form',
  templateUrl: './cake-form.component.html',
  styleUrls: ['./cake-form.component.css']
})
export class CakeFormComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  cake: Cake = {
    id: 0,
    nombre:'',
    tipo: '',
    peso: 0,
    especificacion: '',
    descripcion: '',
    pastelero: '',
    img: '',
    fecha_inicio: new Date(),
    fecha_fin: new Date(),
    created_at: new Date()
  };

  edit: boolean = false;

  constructor(private cakeService: CakeService, private router: Router, private activedRoute: ActivatedRoute) { }

  ngOnInit() {
    const params = this.activedRoute.snapshot.params;
     if(params.id) {
      this.cakeService.getCake(params.id).subscribe(
        (        res: any) => {
          console.log(res);
          this.cake = res;
          this.edit = true;
        },
        (        err: any) => console.log(err)
      )
    } 
  }

  saveNewCake() {
    delete this.cake.created_at;
    delete this.cake.id;
    this.cakeService.saveCake(this.cake)
    .subscribe(
      (      res: any) => {
        this.router.navigate(['/cake']);
        console.log(res);       
      },
      (      err: any) => console.log(err)
    )
  }

  updateCake() {
    delete this.cake.created_at;
    this.cakeService.updateCake(this.cake.id + "", this.cake).subscribe(
      (      res: any) => {
          console.log(res);
          this.router.navigate(['/cake']);
      },
      (      err: any) => console.log(err)
    );
  }
  
}
