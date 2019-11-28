import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './about/register/register.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuraldirectiveComponent } from './directive/structuraldirective/structuraldirective.component';
import { NgIfComponent } from './directive/structuraldirective/ng-if/ng-if.component';
import { NgForComponent } from './directive/structuraldirective/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structuraldirective/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { Register1Component } from './register1/register1.component';
import { Reg1Component } from './forms/reg1/reg1.component';
import { Reg2Component } from './forms/reg2/reg2.component';
import { Reg3Component } from './forms/reg3/reg3.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { Parent1Component } from './parent1/parent1.component';
import { Child1Component } from './child1/child1.component';
import { Header1Component } from './header1/header1.component';
import { Form5Component } from './form5/form5.component';
import { ReactiveComponent } from './reactive/reactive.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    RegisterComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectiveComponent,
    StructuraldirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    Register1Component,
    Reg1Component,
    Reg2Component,
    Reg3Component,
    RegisterPageComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    Parent1Component,
    Child1Component,
    Header1Component,
    Form5Component,
    ReactiveComponent,

  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component: HomeComponent},
      {path: 'about', component: AboutComponent},
      {path: 'help', component: HelpComponent},
      {path: 'property-binding', component: PropertyBindingComponent},
      {path: 'event-binding', component: EventBindingComponent},
      {path: 'two-way-binding', component: TwoWayBindingComponent},
      {path: 'login', component: NgIfComponent},
      {path: 'ng-for', component: NgForComponent},
      {path: 'ng-Switch', component: NgSwitchComponent},
      {path: 'register', component: RegisterComponent},
      {path: 'reg1', component: Reg1Component},
      {path: 'reg2', component: Reg2Component},
      {path: 'reactive-form', component: RegisterPageComponent  },
      {path: 'parent', component: ParentComponent},
      {path: 'comment-details', component: CommentDetailsComponent},
      {path: 'parent1', component: Parent1Component},
      {path: 'form5', component: Form5Component},
      {path: 'reactive', component: ReactiveComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
