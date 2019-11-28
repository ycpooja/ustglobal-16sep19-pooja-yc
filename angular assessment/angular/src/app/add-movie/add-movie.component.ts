import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  get addmovie(){
    return this.form.get('text');
  }
  get title()
  {
    return this.form.get('text');
  }
  get imgurl()
  {
    return this.form.get('text');
  }
form=new FormGroup({
  addmovie:new FormControl('',[Validators.required]),
  title:new FormControl('',[Validators.required]),
  imgurl:new FormControl('',[Validators.required])

});
  constructor() { }

  ngOnInit() {
  }
  AddMovie(form){
  console.log(form.value);
}
}

