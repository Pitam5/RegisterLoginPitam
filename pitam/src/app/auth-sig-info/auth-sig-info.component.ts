import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-auth-sig-info',
  templateUrl: './auth-sig-info.component.html',
  styleUrls: ['./auth-sig-info.component.css']
})
export class AuthSigInfoComponent implements OnInit {

  constructor() { }
  countries = [
    {name: 'USA'},
    {name: 'England'},
    {name: 'India'},
  ];
  states = [
    {name: 'West-Bengal'},
    {name: 'Delhi'},
    {name: 'Uttar-Pradesh'},
    {name: 'TamilNadu'}
  ];
  cities = [
    {name: 'Kolkata'},
    {name: 'Durgapur'}
  ];
  model: any = {};
  onSubmit() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model));
  }
  ngOnInit() {
  }

}
