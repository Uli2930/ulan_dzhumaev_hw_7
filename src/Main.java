public class Main {
    public static void main(String[] args) {
        Hero[] herous = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < herous.length; i++) {
            herous[i].applySuperAbility();
            if (herous[i] instanceof Medic){
                ((Medic) herous[i]).increaseExperience();
            }
        }
    }
}