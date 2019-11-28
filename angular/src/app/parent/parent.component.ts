import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
selectedCar;
 Cars = [{
  imgUrl: 'https://cdn.pixabay.com/photo/2016/03/18/01/09/cupcake-1264214__340.png'  ,
  name: 'icecream',
  price: 99    ,
},
{
  imgUrl : 'https://cdn.pixabay.com/photo/2016/04/15/08/04/strawberries-1330459__340.jpg'   ,
  name: 'strawberry',
  price: 100 ,
},
{
  imgUrl: 'https://cdn.pixabay.com/photo/2018/02/01/19/21/easter-3123834__340.jpg'   ,
  name: 'eggs',
  price: 99,
}];

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
