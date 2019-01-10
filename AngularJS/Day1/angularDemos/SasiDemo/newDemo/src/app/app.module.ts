import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpListComponent } from './emp-list/emp-list.component';
import { TextboxComponent } from './textbox/textbox.component';
import { EmpsearchPipe } from './empsearch.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    TextboxComponent,
    EmpsearchPipe
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
