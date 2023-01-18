import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateBookComponent} from "./create-book/create-book.component";
import {LoginBookComponent} from "./login-book/login-book.component";
import {RegisterUserComponent} from "./register-user/register-user.component";
import {SearchBookComponent} from "./search-book/search-book.component";
import {UpdateBookComponent} from "./update-book/update-book.component";
import {BookListComponent} from "./book-list/book-list.component";
import {ViewBookDetailsComponent} from "./view-book-details/view-book-details.component";
import { ModalModule } from 'ngx-bootstrap/modal'
import {PaginationComponent} from "./pagination/pagination.component";
import {HomePageComponent} from "./home-page/home-page.component";
import {SearchByLanguageComponent} from "./search-by-language/search-by-language.component";
import {CheckEmailComponent} from "./check-email/check-email.component";

const routes: Routes = [
  {path: 'login', component: LoginBookComponent},
  {path: 'register', component: RegisterUserComponent},
  {path: 'getAllBooks', component: BookListComponent},
  {path: 'addBook', component: CreateBookComponent},
  {path: 'updateBook/:id', component: UpdateBookComponent},
  {path: 'viewBookDetails/:id', component: ViewBookDetailsComponent},
  {path: 'pagination', component: PaginationComponent},
  {path: 'home', component: HomePageComponent},
  {path: 'category', component: SearchByLanguageComponent},
  {path: 'checkEmail', component: CheckEmailComponent},
  {path:'', component: HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})
export class AppRoutingModule { }
