import { Component, OnInit } from '@angular/core';
import {  FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './cutomValidation';


@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {
get email() {
  return this.form.get('email');
}
get password() {
  return this.form.get('password');
}
form = new FormGroup({
email: new FormControl('', [Validators.required, CustomValidation.unique]) ,
password: new FormControl('', [Validators.required])
});

constructor() { }

  ngOnInit() {
  }
loginData(form) {
  console.log(form.value);
}
}
