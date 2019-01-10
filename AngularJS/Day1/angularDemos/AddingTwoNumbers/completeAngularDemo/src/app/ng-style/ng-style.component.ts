import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-ng-style',
  templateUrl: './ng-style.component.html',
  styleUrls: ['./ng-style.component.css']
})
export class NgStyleComponent implements OnInit {

  isBold: boolean = true;  
	    fontSize: number = 30;  
	    isItalic: boolean = true;  
	  
	    ApplyStyles() {  
	        let styles = {  
	         'font-weight': this.isBold ? 'bold' : 'normal',  
	         'font-style': this.isItalic ? 'italic' : 'normal',  
           'font-size.px': this.fontSize  
	        };  
	        return styles;  
      }

      constructor() {}
  ngOnInit() {}
}
