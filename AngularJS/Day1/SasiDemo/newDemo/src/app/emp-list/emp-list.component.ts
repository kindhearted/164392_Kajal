import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  pageTitle:string="Employee Details";
  employees:IEmployee[]=[
    {
      "empId":"E101",
      "name":"Kajal Kurhade",
      "email":"kajal97@gmail.com",
      "phone":"1234567890",
      "salary":"20000",
      "appraisalRating":4.5

    },
    {
      "empId":"E102",
      "name":"Aksahy Nalabe",
      "email":"akshay95@gmail.com",
      "phone":"9876543210",
      "salary":"25000",
      "appraisalRating":4.5
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
