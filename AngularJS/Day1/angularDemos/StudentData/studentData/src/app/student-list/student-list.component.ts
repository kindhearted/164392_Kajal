import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms'  
  
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  public students: any; // this variable holds the list of students  
  constructor() {  
  //Initialized student array to hold some student object  
  this.students = [{  
  Id: 1,  
  Name: "Mahesh",  
  Address: "Thane",  
  Gender: "Male"  
  }, {  
  Id: 2,  
  Name: "Nishikant",  
  Address: "Chembur",  
  Gender: "Male"  
  }, {  
  Id: 3,  
  Name: "Sameer",  
  Address: "Mulund",  
  Gender: "Male"  
  }, {  
  Id: 4,  
  Name: "Nitin",  
  Address: "Nahur",  
  Gender: "Male"  
  }, {  
  Id: 4,  
  Name: "Siri",  
  Address: "Worli",  
  Gender: "Female"  
  }];  
  }
  
  getTotalStudentsCount() {  
  return this.students.length;  
  }  
  //Get the maleStudentsCount  
  getMaleStudentsCount() {  
  return this.students.filter(student => student.Gender == 'Male').length;  
  }  
  //Get the femaleStudentsCount  
  getFemaleStudentsCount() {  
  return this.students.filter(student => student.Gender == 'Female').length;  
  }  

    

  ngOnInit() {
  }

}
