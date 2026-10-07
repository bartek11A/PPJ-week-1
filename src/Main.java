public class Main {
    static void main(String[] args) {
//        Utworzyć zmienną całkowitą o wartości 42
        int i1 = 42;
//        Wyświetlić wartość zmiennej
        IO.println(i1);
//        Wyświetlić wyniki zastosowania operatorów bitowych z liczbą 15
        IO.println(i1 & 15);
        IO.println(i1 | 15);
        IO.println(i1 ^ 15);

        IO.println("----------System Binarny----------");
//        Zapisac zmienne w systemie binarnym
        int binarne42 = 0b101010;
        int binarne15 = 0b001111;

//        Wyświetlić wartość zmiennej
        IO.println(binarne42);
//        Zapisać te same działania ale w postaci binarnej
        IO.println(binarne42 & binarne15);
//        typ: 0b001010, liczba: 9
        IO.println(binarne42 | binarne15);
//        typ: 0b101111, liczba: 47
        IO.println(binarne42 ^ binarne15);
//        typ: 0b100101, liczba: 37

    }
}
