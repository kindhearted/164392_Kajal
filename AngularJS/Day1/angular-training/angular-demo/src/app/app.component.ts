import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  firstName='Kajal';
  lastName='Kurhade';

  location:Address={
    "street":"M.G.Road",
    "city":"Mumbai"
  };
}
export class Address{
  street:string;
  city:string;
}

