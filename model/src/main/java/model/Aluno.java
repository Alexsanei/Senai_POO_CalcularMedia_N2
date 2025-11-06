/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Alex
 */
public class Aluno {
    public String nome;
    double media;
    
    public double calcularMedia(double nota1, double nota2, double nota3)throws IllegalArgumentException{ 
        if( (nota1 < 0 || nota1 >10) || (nota2 < 0 || nota2 >10) || (nota3 < 0 || nota3 >10))
            throw new IllegalArgumentException (" Sua nota deve ser maior que 0 e menor que 10 ");
    
        media = (nota1+nota2+nota3) / 3;
        return media;
    }
    public String getSituacao(){
        if(media>=7){
            return "Aprovado";
        }
        else if (media >= 5){
            return "Recuperação";
        }
        else{
            return "Reprovado"; 
        }
    }           
}