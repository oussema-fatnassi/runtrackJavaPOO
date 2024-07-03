package Jour08.Job2;

public class Game {
    Magic[] deck = new Magic[10];
    
    public void Draw(){
        deck[0] = new Creature(1, "Goblin", 1, 1);
        deck[1] = new Creature(2, "Dragon", 5, 5);
        deck[2] = new Creature(3, "Elf", 2, 2);
        deck[3] = new Terrain("Black");
        deck[4] = new Terrain("White");
        deck[5] = new Terrain("Green");
        deck[6] = new Spell(4, "Fireball", "Deals 3 damage to target creature or player");
        deck[7] = new Spell(3, "Heal", "Heals 3 life points to target creature or player");
        deck[8] = new Spell(2, "Shield", "Gives 3 armor to target creature or player");
        deck[9] = new Spell(1, "Steal", "Steals 3 life points to target creature or player");
    };

    public void Play(){
        for (int i = 0; i < 10; i++){
            deck[i].Show();
            System.out.println();
        }
    };

    public static void main(String[] args){
        Game game = new Game();
        game.Draw();
        game.Play();
    }
}
