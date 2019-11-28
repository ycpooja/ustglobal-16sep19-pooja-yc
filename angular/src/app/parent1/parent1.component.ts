import { Component, OnInit } from '@angular/core';
import { AlertPromise } from 'selenium-webdriver';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})
export class Parent1Component implements OnInit {
selectedCar;
cars =[{
  imgUrl: 'https://cdn.pixabay.com/photo/2016/03/18/01/09/cupcake-1264214__340.png',
  name: 'alto',
},
{
  imgUrl: 'https://cdn.pixabay.com/photo/2016/03/18/01/09/cupcake-1264214__340.png' ,
  name: 'alto',
},
{
  imgUrl: 'https://cdn.pixabay.com/photo/2016/03/18/01/09/cupcake-1264214__340.png' ,
  name: 'alto',
}]
  constructor() { }

  ngOnInit() {
  }
sendcar(car) {
  console.log(car);
  this.selectedCar = car;

}
}
