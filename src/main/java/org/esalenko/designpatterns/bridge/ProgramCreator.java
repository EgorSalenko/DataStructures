package org.esalenko.designpatterns.bridge;

public class ProgramCreator {
    public static void main(String[] args) {

        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
