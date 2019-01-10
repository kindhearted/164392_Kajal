import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-function',
  templateUrl: './add-function.component.html',
  styleUrls: ['./add-function.component.css']
})
export class AddFunctionComponent implements OnInit {

      number1:number=0;  
      number2:number=0;  
      ans:number=0;  


  constructor() { }

  ngOnInit() {
  }

  add(){
    this.ans=this.number1+this.number2;
  }
}
