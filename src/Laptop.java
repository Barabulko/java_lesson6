public class Laptop {
    String Name;
    Integer RAM;
    Integer HDD;
    String OS;
    String Color;

    public Laptop(String _Name, Integer _RAM, Integer _HDD, String _OS, String _Color){
        Name = _Name;
        RAM = _RAM;
        HDD = _HDD;
        OS = _OS;
        Color = _Color;
        return;
    }

    @Override
    public String toString() {
        String res = String.format("%s %s (%dGB HDD, %dGB RAM, %s)", Name, Color, HDD, RAM, OS);
        return res;
    }

    public int compareByHDD(Laptop l2) {
        return HDD>l2.HDD? 1: (HDD==l2.HDD? 0: -1);
    }
    public int compareByRAM(Laptop l2) {
        return RAM>l2.RAM? 1: (RAM==l2.RAM? 0: -1);
    }

    public int compareByOS(Laptop l2) {
        return OS.length()>l2.OS.length()? 1: (OS.length()==l2.OS.length()? 0: -1);
    }

    public int compareByColor(Laptop l2) {
        return Color.charAt(0)>l2.Color.charAt(0)? 1: (Color.charAt(0)==l2.Color.charAt(0)? 0: -1);
    }
}
