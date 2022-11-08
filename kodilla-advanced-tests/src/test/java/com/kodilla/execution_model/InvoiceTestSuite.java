package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
        Item desk = new Item("Desk", 500.99);
        Item chair = new Item("Chair", 150);
        Item coffee = new Item("Coffee", 25.99);
        Item notebook = new Item("Notebook", 3500);

    @Test
    public void shouldReturnCorrectItemsSize() {
        //given
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(4, numberOfItems);
    }
    @Test
    public void shouldReturnCorrectItemFromList() {
        //given
        //when
        Item item = invoice.getItem(2);
        //then
        assertEquals("Coffee", item.getName());
        assertEquals(25.99, item.getPrice(), 0.001);
    }
    @Test
    public void shouldReturnNullWhenIndexIsMinus() {
        //given
        //when
        Item item = invoice.getItem(-2);
        //then
        assertNull(item);
    }
    @Test
    public void shouldReturnNullWhenIndexIsOutOfList() {
        //given
        //when
        Item item = invoice.getItem(4);
        //then
       assertNull(item);
    }
    @Test
    public void shouldWorkCleanOfList() {
        //given
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(desk);
        invoice.addItem(chair);
        invoice.addItem(coffee);
        invoice.addItem(notebook);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}