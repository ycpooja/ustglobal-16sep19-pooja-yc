import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-reg1',
  templateUrl: './reg1.component.html',
  styleUrls: ['./reg1.component.css']
})
export class Reg1Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  reg1Data(form: NgForm) {
    console.log(form.value);
}
}
