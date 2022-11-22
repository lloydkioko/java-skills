public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megabytes = kiloBytes / 1024;
            int megabytes_remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + megabytes_remainder + " KB");
        } else
            System.out.println("Invalid Value");
    }
}