import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Calsse Mosca.
 * 
 * @author Murilo Ferro 
 * @version 2925-06-03
 */
public class Mosca extends Inseto
{
    //Fields
    private int velocidade;
    private int rotacao;
    //Contructor padrão
    public Mosca(){
        velocidade = 1;
        rotacao = 0;
    }
    //Contructor com parametros
    public Mosca(int vel, int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    /**
     * Act - Método responsável pelas ações da mosca quando 
     * quando os botões Act ou Run são pressionados.
     */
    public void act()
    {
    // Add your action code here.
        move(1);
        if (Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
    }
        verificarCanto();
    }
}
