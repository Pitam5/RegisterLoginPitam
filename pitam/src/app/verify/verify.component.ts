import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-verify',
  templateUrl: './verify.component.html',
  styleUrls: ['./verify.component.css']
})
export class VerifyComponent implements OnInit {

  constructor(private roter : Router) { }
  model: any = {};
  redirecttobusiinfo() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model));
    this.roter.navigate(['busiinfo'])
  }
  ngOnInit() {
  }

}
