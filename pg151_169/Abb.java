import javax.sound.sampled.SourceDataLine;

interface Ab{
    int a=10;
}
interface Cd{
    int a=10;
}
public class Abb implements Ab,Cd {
    public static void main(String[] args) {
        System.out.println(a);
    }
}
//ambiguous reference error
