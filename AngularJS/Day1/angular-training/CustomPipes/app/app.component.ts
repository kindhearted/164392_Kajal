import { Component } from '@angular/core';

//import pipe(s)
import { TitleCasePipe } from './titlecasepipe';
import { BoldPipe } from './textboldpipe';
import { LimitWordPipe } from './limitwordpipe';

@Component({
  selector: 'test-app',
  pipes:[TitleCasePipe,BoldPipe,LimitWordPipe],
  templateUrl: './app/example.html'
})
export class AppComponent { 
  name="jignesh trivedi";
  myText = "This is my test string.";
}