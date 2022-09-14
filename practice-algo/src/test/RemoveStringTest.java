import static org.junit.jupiter.api.Assertions.*;

class RemoveStringTest {

    @org.junit.jupiter.api.Test
    void remove() {
        RemoveString removeString = new RemoveString();
        assertEquals(1, removeString.remove("01010"));
        assertEquals(0, removeString.remove("111000"));
        assertEquals(7, removeString.remove("111*000"));
        assertEquals(6, removeString.remove("11101111"));
        assertEquals(5, removeString.remove("110*111000011100000"));
        assertEquals(0, removeString.remove("01"));
    }
}