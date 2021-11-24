import { Component,  OnInit, HostBinding } from '@angular/core';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  employee: any = [];

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
   this.getEmployee();
  }

  getEmployee() {
    this.employeeService.getEmployees().subscribe (
      (      res: any) => {
        this.employee = res;
      },
      (      err: any) => console.error(err)
    );
  }

  deleteEmployee(id: string) {
    this.employeeService.deleteEmployee(id).subscribe(
      (      res: any) => {
          console.log(res);
          this.getEmployee();
      },
      (      err: any) => console.log(err)
    );
  }

  

}
