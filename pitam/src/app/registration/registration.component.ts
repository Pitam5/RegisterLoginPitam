import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor( private router : Router) { }

  model: any = {};
  redirecttoverify() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model));
    this.router.navigate(['verify']);
    

  }
  ngOnInit() {
  }

}
