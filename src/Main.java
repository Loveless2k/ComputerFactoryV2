public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theMonitor, theMotherboard, theCase);

        // Dibuja un pixel rojo en el monitor
        //thePC.getMonitor().drawPixel(10, 10, "red");

        // Carga el programa "Windows OS" en la placa madre.
        //thePC.getMotherboard().loadProgram("Windows OS");

        // Presiona el botón de encendido
        //thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
