export class Book {
  id!: number;
  title!: string;
  author!: string;
  publishingHouse!: string;
  collection!: string;
  available!: boolean;
  language: any[] = [{label: "ROMANA"},
    {label: "ENGLEZA"},
    {label: "GERMANA"},
    {label: "FRANCEZA"},
    {label: "SPANIOLA"}];
  selectedLanguage !: string;
  numberOfPages!: number;
  yearOfLaunch!: number;
  category: any[] = [{label: "LITERATURE"},
    {label: "NONFICTION"},
    {label: "ACTION"},
    {label: "THRILLER"},
    {label: "TECHNOLOGY"},
    {label: "DRAMA"},
    {label: "POETRY"},
    {label: "MEDIA"},
    {label: "OTHERS"}];
  selectedCategory !: string;
  bookCode!: string;
  reviews!: string;
  description!: string;
  uploadedFileName !: string;
}
