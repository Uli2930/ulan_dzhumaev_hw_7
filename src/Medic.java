public class Medic extends Hero {
    int healPoints = 20;

    public void increaseExperience() {
        System.out.println("Количество единиц лечения Medica: " +
                 (healPoints + (healPoints * 10) / 100));
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL ");
    }
}