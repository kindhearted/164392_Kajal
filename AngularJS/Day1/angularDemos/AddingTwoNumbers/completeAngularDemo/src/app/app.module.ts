import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';  
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ButtonComponent } from './button/button.component';
import { AddFunctionComponent } from './add-function/add-function.component';
import { ToggleButtonComponent } from './toggle-button/toggle-button.component';
import { NgForDirectiveComponent } from './ng-for-directive/ng-for-directive.component';
import { NgswitchComponent } from './ngswitch/ngswitch.component';
import { NgStyleComponent } from './ng-style/ng-style.component';
import { NgClassStyleComponent } from './ng-class-style/ng-class-style.component';

@NgModule({
  declarations: [
    AppComponent,
    ButtonComponent,
    AddFunctionComponent,
    ToggleButtonComponent,
    NgForDirectiveComponent,
    NgswitchComponent,
    NgStyleComponent,
    NgClassStyleComponent
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
