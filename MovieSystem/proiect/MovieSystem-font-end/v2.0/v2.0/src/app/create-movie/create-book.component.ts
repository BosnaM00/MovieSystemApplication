import { Component, OnInit } from '@angular/core';
import {Book} from "../common/book";
import {Router} from "@angular/router";
import {BookService} from "../services/book.service";

@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {

  book: Book = new Book();
  file: any = null;
  constructor(private bookService: BookService,
              private router: Router) { }

  ngOnInit(): void {
    this.book.selectedLanguage = this.book.language[0];
    console.log(this.book.selectedLanguage);
    this.book.selectedCategory = this.book.category[0];
    console.log(this.book.selectedCategory);
  }

  saveBook(){
    let book: any = {...this.book};
    book.language = book.selectedLanguage.label;
    delete book.selectedLanguage;
    book.category = book.selectedCategory.label;
    delete book.selectedCategory;
    let formData = new FormData();
    if(this.file) {
      formData.append("file",this.file);
    }

    formData.append("book",JSON.stringify(book));
    this.bookService.addBook(formData).subscribe( data =>{
        console.log(data);
        this.goToBookList();
      },
      error => console.log(error));
  }

  fileChangeHandler(event: any) {
    if(event.target.files && event.target.files.length) {
      this.file = event.target.files[0];
    }
  }

  goToBookList(){
    this.router.navigate(['/getAllBooks']);
  }

  onSubmit(){
    console.log(this.book);
    this.saveBook();
  }

}
