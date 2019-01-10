import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-student-count',
  templateUrl: './student-count.component.html',
  styleUrls: ['./student-count.component.css']
})
export class StudentCountComponent  {

  @Input()  
  totalStudentsCount: any;  
  @Input()  
  maleStudentsCount: any;  
  @Input()  
  femaleStudentsCount: any;  
  //this variable is use to select the All Radio button by default 
  selectedRadioButton: any = "All";  

  constructor() { }

  
}
