import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component ({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']

})


export class HomeComponent {
    news;
    enews;
    snews;
    constructor(private http: HttpClient ) {
this.getNews();
this.getEnews();
this.getSnews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=f613cd7f64b04508970adb82279580df').subscribe(data => {
        this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('news got successfully');
        });

        }
    getEnews() {
        // tslint:disable-next-line: max-line-length
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=f613cd7f64b04508970adb82279580df').subscribe(data => {
        this.enews = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('enews got successfully');
        });

        }
    getSnews() {
        // tslint:disable-next-line: max-line-length
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=f613cd7f64b04508970adb82279580df').subscribe(data => {
        this.snews = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('snews got successfully');
        });

        }
}
