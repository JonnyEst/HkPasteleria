import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { EmployeeFormComponent } from './components/employee-form/employee-form.component';
import { CakeListComponent } from './components/cake-list/cake-list.component'
import { CakeFormComponent } from './components/cake-form/cake-form.component'

const routes: Routes = [{
  path: '',
  redirectTo: '/cake',
  pathMatch: 'full'
},
{
  path: '',
  redirectTo: '/cake',
  pathMatch: 'full'
},
{
  path: 'employee',
  component: EmployeeListComponent
},
{
  path: 'employee/add',
  component: EmployeeFormComponent
},
{
  path: 'employee/edit/:id',
  component: EmployeeFormComponent
},
{
  path: 'cake',
  component: CakeListComponent
},
{
  path: 'cake/add',
  component: CakeFormComponent
},
{
  path: 'cake/edit/:id',
  component: CakeFormComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
