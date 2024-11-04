package InlammningProgramDel2;

public class LogikKlass {
    private int antalRader = 0;
    private int antalTecken = 0;
    private int antalOrd = 0;
    private String langstaOrd = "";

    // Räknar rader, tecken och ord, samt kontrollerar för "stop"
    public boolean raknaRad(String rad) {
        if (rad.equalsIgnoreCase("stop")) {
            return true;  // Avslutar om input är "stop"
        }

        antalRader++;
        antalTecken += rad.length();

        // Dela upp raden i ord och räkna varje ord
        String[] ord = rad.split("\\s+");
        antalOrd += ord.length;

        // Kolla om något ord är det längsta hittills
        for (String o : ord) {
            if (o.length() > langstaOrd.length()) {
                langstaOrd = o;
            }
        }
        return false;
    }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public int getAntalOrd() {
        return antalOrd;
    }

    public String getLangstaOrd() {
        return langstaOrd;
    }
}


