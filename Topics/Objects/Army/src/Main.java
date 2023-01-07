class Army {

    public static void createArmy() {
        Unit firstUnit = new Unit("Jamal");
        Unit secondUnit = new Unit("Egor");
        Unit thirdUnit = new Unit("Geo");
        Unit forthUnit = new Unit("Gleb");
        Unit fifthUnit = new Unit("Akhmad");

        Knight firstKnight = new Knight("Jamal");
        Knight secondKnight = new Knight("Egor");
        Knight thirdKnight = new Knight("Gleb");

        General general = new General("Tao");

        Doctor doctor = new Doctor("Trax");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}