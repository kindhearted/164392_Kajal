import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent }  from './app.component';

//import pipe(s)
// import { TitleCasePipe } from './titlecasepipe';
// import { BoldPipe } from './textboldpipe';
// import { LimitWordPipe } from './limitwordpipe';

@NgModule({
  imports:      [ BrowserModule, FormsModule],
  declarations: [ AppComponent],    //declare pipe(s) here --> TitleCasePipe, BoldPipe, LimitWordPipe
  bootstrap:    [ AppComponent ]
})
export class AppModule { 
}