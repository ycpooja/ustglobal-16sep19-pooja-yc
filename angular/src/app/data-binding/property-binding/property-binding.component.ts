import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'john';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/28/16/08/aster-4511176__340.jpg';
  address = 'jayanagara,tumkur 572102';
  colorName = 'brown';
  isActive = false;
  colspanValue = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'red';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
