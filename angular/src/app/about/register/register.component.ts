import {Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy} from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../../user.service';
@Component({
    selector: 'app-register',
    templateUrl: './register.component.html',
    styleUrls: ['./register.component.css']

})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit,AfterViewChecked,OnDestroy {
    Users;
    selectedUser;
today=new Date();
    constructor(private service: UserService ) {
        console.log('constructor got excecuted');
        this.getData();
     }

ngOnInit() {
console.log('ngoninit got excecuted');
}
ngDoCheck() 
{
    console.log('ngDoCheck is excecuted');
}
ngAfterViewInit(){
    console.log('ngAfterViewInit is excecuted');
}
ngAfterViewChecked(){
    console.log('ngAfterViewChecked function is excecuted');

}
ngOnDestroy(){
    console.log('ngOnDestroy is excecuted')
}
loginData(form: NgForm) {
console.log(form.value);
this.service.postUser(form.value).subscribe(data => {
    console.log(data);
}, err => {
    console.log(err);
}, () => {
    console.log('data hosted successfully');
});
}
getData(){
this.service.getUsers().subscribe(data => {
    console.log(data);
    this.Users=data;
},err=>{
    console.log(err);
},()=>{
    console.log('data got successfully');
})
}
deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data =>{
    console.log(data);
    this.getData();
    },err=>{
        console.log(err);
    },()=>{
        console.log('data deleted successfully');
    })
    }
    selectuser(user){
        console.log(user);
        this.selectedUser=user;

    }
    updateData(form){
        console.log(form.value);
        this.service.updateUser(form.value.id,form.value).subscribe(data=>{
            console.log(data);
        },err=>{
            console.log(err);
        },()=>{
            console.log('data updated successfully');
        })
    }
}

