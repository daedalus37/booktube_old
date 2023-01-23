/*
 * This file is generated by jOOQ.
 */
package com.odyssey.booktube.database.jooq.model.book_tube;


import com.odyssey.booktube.database.jooq.model.book_tube.tables.Author;
import com.odyssey.booktube.database.jooq.model.book_tube.tables.Book;
import com.odyssey.booktube.database.jooq.model.book_tube.tables.records.AuthorRecord;
import com.odyssey.booktube.database.jooq.model.book_tube.tables.records.BookRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * book_tube.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = Internal.createUniqueKey(Author.AUTHOR, DSL.name("KEY_Author_PRIMARY"), new TableField[] { Author.AUTHOR.ID }, true);
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = Internal.createUniqueKey(Book.BOOK, DSL.name("KEY_Book_PRIMARY"), new TableField[] { Book.BOOK.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AuthorRecord, BookRecord> FK_AUTHORBOOKID_BOOKID = Internal.createForeignKey(Author.AUTHOR, DSL.name("FK_AuthorBookId_BookId"), new TableField[] { Author.AUTHOR.FAVORITEBOOKID }, Keys.KEY_BOOK_PRIMARY, new TableField[] { Book.BOOK.ID }, true);
    public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOKAUTHORID_AUTHORID = Internal.createForeignKey(Book.BOOK, DSL.name("FK_BookAuthorId_AuthorId"), new TableField[] { Book.BOOK.AUTHORID }, Keys.KEY_AUTHOR_PRIMARY, new TableField[] { Author.AUTHOR.ID }, true);
}