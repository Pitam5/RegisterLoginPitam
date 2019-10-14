import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-busi-info',
  templateUrl: './busi-info.component.html',
  styleUrls: ['./busi-info.component.css']
})
export class BusiInfoComponent implements OnInit {

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
  redirecttoauthsiginfo() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model));
    this.router.navigate(['authsiginfo'])
  }

  ngOnInit() {
  }

}
