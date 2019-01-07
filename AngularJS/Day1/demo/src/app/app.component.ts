import { Component } from '@angular/core';
import { User } from './address-card/user.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title:string='Web App';

  user:User;
    constructor(){
      this.user=new User();
      this.user.name='Kajal Kurhade',
      this.user.title='Software Engineer',
      this.user.address='Katraj,Pune,Maharashtra',
      this.user.phone=['1234556789','987654321'];
    }
}