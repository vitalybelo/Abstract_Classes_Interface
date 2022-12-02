import java.util.ArrayList;
import java.util.Collections;

public class Main
{

    public static void main(String[] args) {

        ArrayList<Lamp> lamps = new ArrayList<>();

        lamps.add(new Lamp(100));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(50));
        lamps.add(new Lamp(150));

        Collections.sort(lamps);
        //lamps.get(0).setType(Lamp.Type.FILAMENT);

        for (Lamp lamp : lamps )
            System.out.println(lamp);
    }
}
