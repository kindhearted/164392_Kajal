import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-class-style',
  template: `<button class='colorClass' [ngClass]='applyClasses()'>Style Applied Using Class</button>`,  
styles: [`  
.boldClass{  
font-weight:bold;  
font-size : 30px;  
}  
.italicsClass{  
font-style:italic;  
}  
.colorClass{  
color:grey;             
	 } `]
})

export class NgClassStyleComponent implements OnInit {

  applyBoldClass: boolean = true;  
  applyItalicsClass: boolean = true;  
  applyClasses() {  
  let classes = {  
  boldClass: this.applyBoldClass,  
  italicsClass: this.applyItalicsClass  
  };  
  
  return classes;  
  }  

  constructor() { }

  ngOnInit() {
  }

}
