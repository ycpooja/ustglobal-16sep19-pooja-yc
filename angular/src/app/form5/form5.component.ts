import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form5',
  templateUrl: './form5.component.html',
  styleUrls: ['./form5.component.css']
})
export class Form5Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
loginData(form: NgForm) {
  console.log(form.setValue);
}
}
