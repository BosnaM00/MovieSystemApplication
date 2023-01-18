import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import {Observable } from "rxjs";
import { Book } from "../common/book";
import { map } from "rxjs/operators";
import {Review} from "../common/review";
@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl="http://localhost:8080/books";
  private baseUrlReview="http://localhost:8080/reviews";

  constructor(private httpClient: HttpClient) { }

  public getBooks(pageIndex: number,pageSize: number): Observable<any> {
    return this.httpClient.get<Book[]>(`${this.baseUrl}/all?page=${pageIndex}&size=${pageSize}`);
  }

  getReviewsList(): Observable<Review[]>{
    return this.httpClient.get<Review[]>(`${this.baseUrlReview}/all`);
  }

  public addBook(formData: any): Observable<Book> {
    return this.httpClient.post<Book>(`${this.baseUrl}/add`, formData);
  }

  addReview(review: Review): Observable<Object>{
    return this.httpClient.post(`${this.baseUrlReview}/add`, review);
  }

  getBookById(id: number): Observable<Book>{
    return this.httpClient.get<Book>(`${this.baseUrl}/find/${id}`);
  }

  updateBook(id: number, book: Book): Observable<Object>{
    return this.httpClient.put(`${this.baseUrl}/update`, book);
  }

  deleteBook(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseUrl}/delete/${id}`);
  }

  getBooksByLanguages(pageIndex: number,pageSize: number,language: string): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/findByLanguages?page=${pageIndex}&size=${pageSize}&language=${language}`);
  }

  getBooksByCategories(pageIndex: number,pageSize: number,category: string): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/findByCategories?page=${pageIndex}&size=${pageSize}&category=${category}`);
  }

  sortBooksByAuthorAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortAuthorAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByAuthorDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortAuthorDesc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByTitleAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortTitleAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByTitleDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortTitleDesc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByPublishingHouseAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortPublishingHouseAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByPublishingHouseDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortPublishingHouseDesc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByCollectionAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortCollectionAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByCollectionDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortCollectionDesc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByNumberOfPagesAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortNumberOfPagesAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByNumberOfPagesDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortNumberOfPagesDesc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByYearOfLaunchAsc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortYearOfLaunchAsc?page=${pageIndex}&size=${pageSize}`);
  }

  sortBooksByYearOfLaunchDesc(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/sortYearOfLaunchDesc?page=${pageIndex}&size=${pageSize}`);
  }

  findAvailableBooks(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/findAvailableBooks?page=${pageIndex}&size=${pageSize}`);
  }

  findUnavailableBooks(pageIndex: number,pageSize: number): Observable<any>{
    return this.httpClient.get(`${this.baseUrl}/findUnavailableBooks?page=${pageIndex}&size=${pageSize}`);
  }
}
