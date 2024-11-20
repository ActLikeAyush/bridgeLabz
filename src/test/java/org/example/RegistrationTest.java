package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {


    Registration rs = new Registration();


    //    test case for email


    @Test
    void testEmail() {

        assertTrue(rs.validateEmail("abc@ayush.com"));
    }


    @Test
    void testInvalidSymbol() {

        assertFalse(rs.validateEmail("abcayush.com"));
    }


    @Test
    void testStartWithNum() {

        assertFalse(rs.validateEmail("123@ayush.com"));
    }


    @Test
    void containOtherChar() {

        assertFalse(rs.validateEmail("abc@%ayush.com"));
    }


    @Test
    void EndWithDot() {
        assertFalse(rs.validateEmail("abc@ayush.k"));
    }


    //    Test case for name


    @Test
    void nameLessTheThreeChar() {
        assertFalse(rs.validateName("aY", "kS"));

    }

    @Test
    void nameIsCorrect() {
        assertTrue(rs.validateName("Subh", "Singh"));
    }

//    Test case for Phone number

    @Test
    void testCountryCode(){
        assertTrue(rs.validatePhone("91 2121212121"));
    }


//    Test Case for Password

    @Test
    void testPasswordContainOneUpperCase(){
        assertTrue(rs.validatePassword("Abcefghjl1"));
    }
    @Test
    void testPasswordNotHasDigit(){
        assertFalse(rs.validatePassword("ABchssjdhjshk"));
    }
    @Test
    void testPasswordLessThenEightChar(){
        assertFalse(rs.validatePassword("abcA"));
    }
}
