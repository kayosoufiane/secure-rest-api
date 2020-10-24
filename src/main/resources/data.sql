DROP TABLE IF EXISTS book;

CREATE TABLE book (
  book_Id INT AUTO_INCREMENT  PRIMARY KEY,
  book_Title VARCHAR(250) NOT NULL,
  book_Author VARCHAR(250) NOT NULL,
  book_Publisher VARCHAR(250) DEFAULT NULL
);

insert into book(book_Id, book_Title, book_Author, book_Publisher) values(1, 'Java in Action', 'Some Author', 'Pearson');
insert into book(book_Id, book_Title, book_Author, book_Publisher) values(2, 'Java Primer', 'Some Author', 'Pearson');
insert into book(book_Id, book_Title, book_Author, book_Publisher) values(3, 'Spring in Action', 'Some Author', 'Pearson');
insert into book(book_Id, book_Title, book_Author, book_Publisher) values(4, 'JavaScript Primer', 'Some Author', 'Pearson');
insert into book(book_Id, book_Title, book_Author, book_Publisher) values(5, 'Scala in Action', 'Some Author', 'Pearson');
