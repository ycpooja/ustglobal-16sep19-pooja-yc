import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-reg2',
  templateUrl: './reg2.component.html',
  styleUrls: ['./reg2.component.css']
})
export class Reg2Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form);
  }
}
