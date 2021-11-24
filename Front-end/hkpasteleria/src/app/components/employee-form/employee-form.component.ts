import { Component,  OnInit, HostBinding } from '@angular/core';
import { Employee } from '../../models/Employee';
import {  Router,ActivatedRoute } from '@angular/router'

import { EmployeeService }  from '../../services/employee.service';

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent implements OnInit {

 @HostBinding('class') classes = 'row';

 employee: Employee = {
   id: 0,
   nombre: '',
   salario: 0,
   tipo: '',
   pasaporte: 0,
   pais: '',
   created_at: new Date()      
 };

 edit: boolean = false;

  constructor(private employeeServices: EmployeeService, private router: Router, private activedRoute: ActivatedRoute ) { }

  ngOnInit(): void {
    const params = this.activedRoute.snapshot.params;
    
  if(params.id) {
      this.employeeServices.getEmployee(params.id).subscribe(
        (        res: any) => {
          console.log(res);
          this.employee = res;
          this.edit = true;
        },
        (        err: any) => console.log(err)
      )
    } 
  }

  saveNewEmployee() {
    delete this.employee.created_at;
    delete this.employee.id;
    this.employeeServices.saveEmploye(this.employee)
    .subscribe(
      (      res: any) => {
        console.log(res);
        this.router.navigate(['/employee']);
      },
      (      err: any) => console.log(err)
    )
  }

  updateEmployee() {
    delete this.employee.created_at;
    this.employeeServices.updateEmployee(this.employee.id + "", this.employee).subscribe(
      (      res: any) => {
          console.log(res);
          this.router.navigate(['/employee']);
      },
      (      err: any) => console.log(err)
    );
  }
  
}
