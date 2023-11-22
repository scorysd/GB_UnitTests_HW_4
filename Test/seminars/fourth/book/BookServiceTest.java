package seminars.fourth.book;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class BookServiceTest {



    @BeforeEach
    void setUp() {
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);
    }

    @AfterEach
    void tearDown() {


    }

    @Test
    void findBookById() {
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        Mockito.when(inMemoryBookRepository.findById("1")).thenReturn(new Book("123"));
        BookService bookService = new BookService(inMemoryBookRepository);
        verify(inMemoryBookRepository).findById("1");
    }

    @Test
    void findAllBooks() {
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);
        bookService.findAllBooks();
    }
}