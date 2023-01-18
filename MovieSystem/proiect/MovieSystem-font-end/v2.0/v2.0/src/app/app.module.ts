import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import {BookService} from "./services/book.service";
import { CreateBookComponent } from './create-book/create-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { LoginBookComponent } from './login-book/login-book.component';
import {UpdateBookComponent} from "./update-book/update-book.component";
import {BookListComponent} from "./book-list/book-list.component";
import { ViewBookDetailsComponent } from './view-book-details/view-book-details.component';
import { HomePageComponent } from './home-page/home-page.component';
import { PaginationComponent } from './pagination/pagination.component';
import { SearchByLanguageComponent } from './search-by-language/search-by-language.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatPaginatorModule } from '@angular/material/paginator';
import { CreateReviewComponent } from './create-review/create-review.component';
import { CheckEmailComponent } from './check-email/check-email.component';
@NgModule({
  declarations: [
    CreateBookComponent,
    AppComponent,
    RegisterUserComponent,
    BookListComponent,
    SearchBookComponent,
    LoginBookComponent,
    UpdateBookComponent,
    ViewBookDetailsComponent,
    HomePageComponent,
    PaginationComponent,
    SearchByLanguageComponent,
    CreateReviewComponent,
    CheckEmailComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatPaginatorModule,


  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
