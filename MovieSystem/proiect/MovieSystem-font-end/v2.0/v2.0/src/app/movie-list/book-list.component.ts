import {Component, OnInit} from '@angular/core';
import {Book} from "../common/book";
import {BookService} from "../services/book.service";
import {Router} from '@angular/router';
import {HttpErrorResponse} from "@angular/common/http";
import {CommonUtil} from "../services/commonUtil";
import {PageEvent} from '@angular/material/paginator';
import {Review} from "../common/review";

@Component({
  selector: 'app-search-book',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css', './search-by-category.css']
})
export class BookListComponent implements OnInit {

  books!: Book[];
  book!: Book;
  PAGE_SIZE: number = 12;
  totalData: number = 0;
  currentPage: number = 0;
  languages: any[] = new Book().language;
  categories: any[] = new Book().category;
  selectedLanguage: string = "";
  selectedCategory: string = "";
  searchType: string = "";


  constructor(private bookService: BookService,
              private router: Router,
              public commonUtil: CommonUtil) {
  }

  ngOnInit(): void {
    this.getBooks();
  }

  getBooks() {
    this.searchType = "all";
    this.bookService.getBooks(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  getBooksByLanguage() {
    if (this.selectedLanguage === 'All') {
      this.bookService.getBooks(this.currentPage, this.PAGE_SIZE).subscribe(
        (data: any) => {
          this.books = data.content;
          if (!this.totalData) {
            this.totalData = data.totalElements;
          }
        }
      )
    } else {
      this.bookService.getBooksByLanguages(this.currentPage, this.PAGE_SIZE, this.selectedLanguage).subscribe(
        (data: any) => {
          this.books = data.content;
          if (!this.totalData) {
            this.totalData = data.totalElements;
          }
        }
      )
    }
  }

  getBooksByCategory() {
    if (this.selectedCategory === 'All') {
      this.bookService.getBooks(this.currentPage, this.PAGE_SIZE).subscribe(
        (data: any) => {
          this.books = data.content;
          if (!this.totalData) {
            this.totalData = data.totalElements;
          }
        }
      )
    }
    else {
      this.bookService.getBooksByCategories(this.currentPage, this.PAGE_SIZE, this.selectedCategory).subscribe(
        (data: any) => {
          this.books = data.content;
          if (!this.totalData) {
            this.totalData = data.totalElements;
          }
        }
      )
    }
  }

  sortBooksAscByAuthor() {
    this.bookService.sortBooksByAuthorAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  findAvailableBooks() {
    this.bookService.findAvailableBooks(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  findUnavailableBooks() {
    this.bookService.findUnavailableBooks(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByAuthor() {
    this.bookService.sortBooksByAuthorDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksAscByTitle() {
    this.bookService.sortBooksByTitleAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByTitle() {
    this.bookService.sortBooksByTitleDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksAscByPublishingHouse() {
    this.bookService.sortBooksByPublishingHouseAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }


  sortBooksAscByCollection() {
    this.bookService.sortBooksByCollectionAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksAscByNumberOfPages() {
    this.bookService.sortBooksByNumberOfPagesAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksAscByYearOfLaunch() {
    this.bookService.sortBooksByYearOfLaunchAsc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByYearOfLaunch() {
    this.bookService.sortBooksByYearOfLaunchDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByCollection() {
    this.bookService.sortBooksByCollectionDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByPublishingHouse() {
    this.bookService.sortBooksByPublishingHouseDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  sortBooksDescByNumberOfPages() {
    this.bookService.sortBooksByNumberOfPagesDesc(this.currentPage, this.PAGE_SIZE).subscribe(
      (data: any) => {
        this.books = data.content;
        if (!this.totalData) {
          this.totalData = data.totalElements;
        }
      }
    )
  }

  fetchData() {
    switch (this.searchType) {
      case "all": {
        this.getBooks();
        break;
      }
      case "category": {
        this.getBooksByCategory();
        break;
      }
      case "language": {
        this.getBooksByLanguage();
        break;
      }
      case "author": {
        this.sortBooksAscByAuthor();
        break;
      }
      case "authorDesc": {
        this.sortBooksDescByAuthor();
        break
      }
      case "title": {
        this.sortBooksAscByTitle();
        break;
      }
      case "titleDesc": {
        this.sortBooksDescByTitle();
        break;
      }
      case "publishingHouse": {
        this.sortBooksAscByPublishingHouse();
        break;
      }
      case "collection": {
        this.sortBooksAscByCollection();
        break;
      }
      case "numberOfPages": {
        this.sortBooksAscByNumberOfPages();
        break;
      }
      case "yearOfLaunch": {
        this.sortBooksAscByYearOfLaunch();
        break;
      }
      case "publishingHouseDesc": {
        this.sortBooksDescByPublishingHouse();
        break;
      }
      case "collectionDesc": {
        this.sortBooksDescByCollection();
        break;
      }
      case "numberOfPagesDesc": {
        this.sortBooksDescByNumberOfPages();
        break;
      }
      case "yearOfLaunchDesc": {
        this.sortBooksDescByYearOfLaunch();
        break;
      }
    }

  }

  pageChanged(event: PageEvent) {
    const request = {};
    console.log(event);
    this.currentPage = event.pageIndex;
    this.fetchData();
    /*if(this.selectedLanguage) {
      this.getBooksByLanguage();
    }
    else {
      this.getBooks();
    }
    if(this.selectedCategory) {
      this.getBooksByCategory();
    }
    else {
      this.getBooks();
    }*/
  }

  languageChanged(language: any, event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "language";
    this.selectedLanguage = language.label;
    this.getBooksByLanguage();
  }

  categoryChanged(category: any, event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "category";
    this.selectedCategory = category.label;
    this.getBooksByCategory();
  }

  sortBooksByAuthor(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "author";
    this.sortBooksAscByAuthor();
  }

  sortBooksByAuthorDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "authorDesc";
    this.sortBooksDescByAuthor();
  }

  sortBooksByTitle(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "title";
    this.sortBooksAscByTitle();
  }

  sortBooksByTitleDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "titleDesc";
    this.sortBooksDescByTitle();
  }

  sortBooksByPublishingHouse(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "publishingHouse";
    this.sortBooksAscByPublishingHouse();
  }

  sortBooksByPublishingHouseDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "publishingHouseDesc";
    this.sortBooksDescByPublishingHouse();
  }

  sortBooksByCollection(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "collection";
    this.sortBooksAscByCollection();
  }

  sortBooksByCollectionDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "collectionDesc";
    this.sortBooksDescByCollection();
  }

  sortBooksByNumberOfPages(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "numberOfPages";
    this.sortBooksAscByNumberOfPages();
  }

  sortBooksByNumberOfPagesDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "numberOfPagesDesc";
    this.sortBooksDescByNumberOfPages();
  }

  sortBooksByYearOfLaunch(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "yearOfLaunch";
    this.sortBooksAscByYearOfLaunch();
  }

  sortBooksByYearOfLaunchDesc(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "yearOfLaunchDesc";
    this.sortBooksDescByYearOfLaunch();
  }

  findAllAvailableBooks(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "AvailableBooks";
    this.findAvailableBooks();
  }
  findAllUnavailableBooks(event: any) {
    event.preventDefault();
    this.currentPage = 0;
    this.totalData = 0;
    this.searchType = "UnavailableBooks";
    this.findUnavailableBooks();
  }

  public searchBooks(key: any): void {
    console.log(key);
    const results: Book[] = [];
    for (const book of this.books) {
      if (book.title.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || book.author.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || book.publishingHouse.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || book.collection.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        results.push(book);
      }
    }
    this.books = results;
    if (results.length === 0 || !key) {
      this.getBooks();
    }
  }


  // public searchBooks(key: string): void {
  //   console.log(key);
  //   const results: Book[] = [];
  //   for (const employee of this.books) {
  //     if (employee.title.toLowerCase().indexOf(key.toLowerCase()) !== -1
  //       || employee.author.toLowerCase().indexOf(key.toLowerCase()) !== -1
  //       || employee.category.toLowerCase().indexOf(key.toLowerCase()) !== -1
  //       || employee.language.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
  //       results.push(employee);
  //     }
  //   }
  //   this.books = results;
  //   if (results.length === 0 || !key) {
  //     this.getBooks();
  //   }
  // }


  deleteBook(id: number) {
    this.bookService.deleteBook(id).subscribe(data => {
      console.log(data);
      this.getBooks();
    })
  }


  updateBook(id: number) {
    this.router.navigate(['updateBook', id]);
  }

  bookDetails(id: number) {
    this.router.navigate(['viewBookDetails', id]);
  }

}
