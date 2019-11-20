import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

     movies = [{
      // tslint:disable-next-line: max-line-length
      imgUrl: 'https://m.media-amazon.com/images/M/MV5BZGI5YTFhN2ItMjhlOC00NzlmLTgzM2EtZWEyNmY5NmMxYWNmXkEyXkFqcGdeQXVyNTE0NDY5Njc@._V1_SX300.jpg',
      name: 'milana',
    },
    {
      // tslint:disable-next-line: max-line-length
      imgUrl : 'https://m.media-amazon.com/images/M/MV5BNDljNWM1MzctM2E5NC00YjFkLWI2MDUtNzJkNGIyMGZmN2MwXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg' ,
      name: 'ram',
    },
    {
      // tslint:disable-next-line: max-line-length
      imgUrl: 'https://m.media-amazon.com/images/M/MV5BOGRkNzY2Y2MtNWI4MC00MzQ1LWIyODgtNjg5ZDZiZWU2YzZjXkEyXkFqcGdeQXVyNDkwNjIxNjc@._V1_SX300.jpg' ,
      name: 'jogi',
    }];
      constructor() { }
      ngOnInit() {
      }
      sendCar(movie) {
        console.log(movie.value);
      }
    }
