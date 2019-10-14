import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-auth-sig-info',
  templateUrl: './auth-sig-info.component.html',
  styleUrls: ['./auth-sig-info.component.css']
})
export class AuthSigInfoComponent implements OnInit {

  constructor(private router : Router) { }
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
  redirecttowelcome() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model));
    this.router.navigate(['welcome']);
  }
  redirecttobusiinfo() {

    this.router.navigate(['busiinfo']);
  }
  ngOnInit() {
  }

}
