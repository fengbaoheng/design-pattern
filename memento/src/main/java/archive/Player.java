package archive;

public class Player {
    private int vitality, attack, defense;

    public void restore(Archive archive) {
        this.vitality = archive.getVitality();
        this.attack = archive.getAttack();
        this.defense = archive.getDefense();
    }

    public Archive save() {
        return new Archive(vitality, attack, defense);
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
